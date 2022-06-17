package application.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import application.entity.Book;
import application.entity.Member;
import application.entity.Transaction;
import application.service.DatabaseService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.cell.PropertyValueFactory;

public class BorrowBookController implements Initializable {

    @FXML
    private ComboBox<String> cbo_member;

    @FXML
    private ComboBox<String> cbo_title;
	
    @FXML
    private TableColumn<Transaction, Integer> col_book_id;

    @FXML
    private TableColumn<Transaction, LocalDate> col_borrow_date;

    @FXML
    private TableColumn<Transaction, Integer> col_borrow_id;

    @FXML
    private TableColumn<Transaction, LocalDate> col_due_date;

    @FXML
    private TableColumn<Transaction, Integer> col_fees;

    @FXML
    private TableColumn<Transaction, String> col_librarian;

    @FXML
    private TableColumn<Transaction, Integer> col_member_id;

    @FXML
    private TableView<Transaction> tbl_borrow;

    
    private List<Member> memberList;
    private List<Book> bookList;
    private List<Transaction> transList;

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Main.fxml");
    }

    @SuppressWarnings("unused")
	@FXML
    void btn_borrow_click(ActionEvent event) {
    	
    	int book_code = cbo_title.getSelectionModel().getSelectedIndex();
    	int member_id = cbo_member.getSelectionModel().getSelectedIndex();
    	

    	if(member_id == -1) {
    		showAlert(AlertType.WARNING, "Choose Member Name");
    		return;
    	}
    	if(book_code == -1) {
    		showAlert(AlertType.WARNING, "Choose Title");
    		return;
    	}

    	Transaction tran = new Transaction();

		tran.setBook_id(bookList.get(book_code));
	
		int available = bookList.get(book_code).getAvailable();
		
		if(available == 0) {
			
			List<Transaction> borrowList = new ArrayList<>();
			
			for(int i = 0;i < transList.size(); i++) {
				if(transList.get(i).getReturn_date() == null)
					borrowList.add(transList.get(i));
			}
			
			LocalDate now = LocalDate.now();
			LocalDate exp_date = memberList.get(member_id).getExpired_date();
			
			if(now.isBefore(exp_date)) {
				
				if(borrowList.size() > 0) {
					
					int card_id = memberList.get(member_id).getCard_id();
					for(int  i = 0;i < borrowList.size(); i++) {
						
						if(card_id == borrowList.get(i).getMember_id().getCard_id()) {
							LocalDate due_date = borrowList.get(i).getDue_date();
							if(now.isBefore(due_date)) {
								borrow(member_id,book_code);
								break;
							}
							else {
								showAlert(AlertType.WARNING,"You are out of due date");
								break;
							}
						}
						else {
							borrow(member_id,book_code);
							break;
						}
					}
				}
				else {
					borrow(member_id,book_code);
					
				}
			}
			else {
				showAlert(AlertType.WARNING, "Member card is expired");
				return;
			}
			
		}
		else {
			showAlert(AlertType.WARNING, "Book is no available");
			return;
		}

    }
    
    private void borrow(int card_id,int code) {
    	
    	Transaction transaction = new Transaction();
    	LocalDate now = LocalDate.now();
    	
    	transaction.setMember_id(memberList.get(card_id));
    	transaction.setBook_id(bookList.get(code));
    	transaction.setBorrow_date(now);
    	transaction.setDue_date(now.plusDays(5));
    	transaction.setFees(200);
    	transaction.setCreated_by(LoginController.login_librarian);

		if(DatabaseService.borrowBook(transaction)){
			showAlert(AlertType.INFORMATION, "Book is add to borrow list");
			reset();
			return;
		}
		else {
			showAlert(AlertType.WARNING, "Something is wrong");
			return;
		}
    }
    

    private void reset() {

		cbo_title.setItems(null);
		cbo_member.setItems(null);
		loadTransaction();

	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		col_borrow_id.setCellValueFactory(new PropertyValueFactory<>("id"));
		col_member_id.setCellValueFactory(new PropertyValueFactory<>("memberName"));
		col_book_id.setCellValueFactory(new PropertyValueFactory<>("titleName"));
		col_borrow_date.setCellValueFactory(new PropertyValueFactory<>("borrow_date"));
		col_due_date.setCellValueFactory(new PropertyValueFactory<>("due_date"));
		col_fees.setCellValueFactory(new PropertyValueFactory<>("fees"));
		col_librarian.setCellValueFactory(new PropertyValueFactory<>("librarianName"));
		
		loadTransaction();

	}
	
	private void loadTransaction() {

		transList = DatabaseService.findAllTransactions();

		
		List<Transaction> list = new ArrayList<>();
		
		for(int i =0;i < transList.size(); i++) {
			if(transList.get(i).getReturn_date() == null) {
				list.add(transList.get(i));
			}
		}
		
		tbl_borrow.setItems(FXCollections.observableArrayList(list));
		
		loadBooks();
		loadMembers();

	}
	
	private void loadBooks() {
		
		bookList = DatabaseService.findAllBooks();
		
		List<String> title = bookList.stream()
									.map(b -> b.getTitle())
									.toList();
		
		cbo_title.setItems(FXCollections.observableArrayList(title));
		
	}
	
	private void loadMembers() {
		
		memberList = DatabaseService.findAllMembers();
		
		List<String> names = memberList.stream()
									.map(m -> m.getName())
									.toList();
		
		cbo_member.setItems(FXCollections.observableArrayList(names));
	}
	
	
	private void showAlert(AlertType type, String content) {
		
		Alert alert = new Alert(type);
		alert.setContentText(content);
		alert.setHeaderText(null);
		alert.setTitle("Message");
		alert.showAndWait();
		
	}
}
