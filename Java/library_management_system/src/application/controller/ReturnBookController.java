package application.controller;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import application.entity.Member;
import application.entity.Transaction;
import application.service.DatabaseService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReturnBookController implements Initializable{

    @FXML
    private ComboBox<String> cbo_member;

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
    private TableColumn<Transaction, LocalDate> col_return_date;

    @FXML
    private TableColumn<Transaction, Integer> col_member_id;

    @FXML
    private TableView<Transaction> tbl_return;
    
    private List<Member> memberList;
	private List<Transaction> searchList = new ArrayList<>();

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Main.fxml");
    }

    @FXML
    void btn_return_click(ActionEvent event) {

    	int index = tbl_return.getSelectionModel().getSelectedIndex();
    	
    	Transaction tran = new Transaction();

    	tran.setId(searchList.get(index).getId());
    	tran.setBook_id(searchList.get(index).getBook_id());
    	tran.setReturn_date(LocalDate.now());
    	
    	
    	if(DatabaseService.returnWithBorrowId(tran)) {
    		showAlert(AlertType.INFORMATION, "Book is returned");
    		cbo_member.setItems(null);
    		tbl_return.setItems(null);
    		loadMembers();
    	}
    	else {
    		showAlert(AlertType.WARNING, "Something is wrong");
    	}
    }


	@FXML
    void btn_search_click(ActionEvent event) {
    	
    	int member_id = cbo_member.getSelectionModel().getSelectedIndex();
    	
    	if(member_id == -1) {
    		showAlert(AlertType.WARNING, "Member name should be select");
    		return;
    	}
    	var searchTransactions = DatabaseService.findTransactionWithMemberID(memberList.get(member_id).getCard_id());
    	
    	searchList.clear();
    	
    	for(int i =0 ;i < searchTransactions.size(); i++) {
    		if(searchTransactions.get(i).getReturn_date() == null) {
    			searchList.add(searchTransactions.get(i));
    		}
    	}
    	
    	for(int i =0 ;i < searchList.size(); i++) {
    			
    		System.out.println(searchList.get(i).getBook_id().getCode());

    	}
    	
		tbl_return.setItems(FXCollections.observableArrayList(searchList));
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		col_borrow_id.setCellValueFactory(new PropertyValueFactory<>("id"));
		col_member_id.setCellValueFactory(new PropertyValueFactory<>("memberName"));
		col_book_id.setCellValueFactory(new PropertyValueFactory<>("titleName"));
		col_borrow_date.setCellValueFactory(new PropertyValueFactory<>("borrow_date"));
		col_due_date.setCellValueFactory(new PropertyValueFactory<>("due_date"));
		col_return_date.setCellValueFactory(new PropertyValueFactory<>("return_date"));
		col_fees.setCellValueFactory(new PropertyValueFactory<>("fees"));
		
		loadMembers();
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
