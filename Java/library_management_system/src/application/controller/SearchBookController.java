package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import application.entity.Book;
import application.service.DatabaseService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class SearchBookController implements Initializable{

    @FXML
    private TableColumn<Book, String> col_author;

    @FXML
    private TableColumn<Book, Integer> col_avaliable;

    @FXML
    private TableColumn<Book, String> col_category;

    @FXML
    private TableColumn<Book, Integer> col_id;

    @FXML
    private TableColumn<Book, String> col_title;

    @FXML
    private TableView<Book> tbl_book;

    @FXML
    private TextField txt_author;

    @FXML
    private TextField txt_category;
    
    private List<Book> bookList;

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Books.fxml");
    }

    @FXML
    void btn_search_click(ActionEvent event) {
    	String author = txt_author.getText();
    	String category = txt_category.getText();
    	
    	var bookList = DatabaseService.searchBook(author,category);
    	
    	if(bookList.size() > 0) {
    		tbl_book.setItems(FXCollections.observableArrayList(bookList));
    	}
    	else {
    		tbl_book.setItems(null);
    	}
    }
    
    @FXML
    void btn_delete_click(ActionEvent event) {

		   var book = tbl_book.getSelectionModel().getSelectedItem();
		   
		   if(book != null) {
			   Alert alert = new Alert(AlertType.CONFIRMATION);
			   alert.setContentText("Are you sure to delete");
			   
			   alert.setHeaderText(null);
			   Optional<ButtonType> result =alert.showAndWait();
			   if(result.get() == ButtonType.OK) {
				   
				   DatabaseService.deleteBookByCode(book.getCode());
				   tbl_book.setItems(null);
				   loadBooks();
			   }
		   }
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		col_id.setCellValueFactory(new PropertyValueFactory<>("code"));
		col_title.setCellValueFactory(new PropertyValueFactory<>("title"));
		col_author.setCellValueFactory(new PropertyValueFactory<>("authorName"));
		col_category.setCellValueFactory(new PropertyValueFactory<>("categoryName"));
		col_avaliable.setCellValueFactory(new PropertyValueFactory<>("available"));

	}
	
	private void loadBooks() {
		
		bookList = DatabaseService.findAllBooks();
		
		tbl_book.setItems(FXCollections.observableArrayList(bookList));
		
	}
}
