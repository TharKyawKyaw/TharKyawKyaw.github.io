package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import application.Main;
import application.entity.Author;
import application.entity.Book;
import application.entity.Category;
import application.service.DatabaseService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AddBookController implements Initializable{

	
    @FXML
    private ComboBox<String> cbo_author;

    @FXML
    private ComboBox<String> cbo_category;

    @FXML
    private TextField txt_code;

    @FXML
    private TextField txt_title;

    private List<Author> authorList;
    private List<Category>	categoryList;
    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Books.fxml");
    }

    @FXML
    void btn_reset_click(ActionEvent event) {
    	reset();
    }
    
    void reset() {
    	txt_code.clear();
    	txt_title.clear();
    	cbo_author.setItems(null);
    	cbo_category.setItems(null);
    	loadAuthors();
    	loadCategories();
    }

    @FXML
    void btn_save_click(ActionEvent event) {

    	String code = txt_code.getText();
    	String title = txt_title.getText();
    	
    	int author_index = cbo_author.getSelectionModel().getSelectedIndex();
    	int category_index = cbo_category.getSelectionModel().getSelectedIndex();
    	
    	if(code.isEmpty()) {
    		showAlert(AlertType.WARNING, "Please enter book code");
    		return;
    	}
    	if(title.isEmpty()) {
    		showAlert(AlertType.WARNING, "Please enter book title");
    		return;
    	}
    	if(author_index == -1) {
    		showAlert(AlertType.WARNING, "Please choose author");
    		return;
    	}
    	if(category_index == -1) {
    		showAlert(AlertType.WARNING, "Please choose category");
    		return;
    	}
    	// save
    	Book book = new Book();
    	book.setCode(Integer.parseInt(code));
    	book.setTitle(title);
    	book.setAuthor(authorList.get(author_index));
    	book.setCategory(categoryList.get(category_index));
    	book.setCreated_by(LoginController.login_librarian);
    	
    	if(DatabaseService.saveBook(book)) {
    		showAlert(AlertType.INFORMATION,"New Book is added");
    		reset();
    	}
    	else {
    		showAlert(AlertType.ERROR, "Something is wrong");
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		loadAuthors();
		loadCategories();
		
	}
	
	private void loadCategories() {
		
		categoryList = DatabaseService.findAllCategories();
		
		List<String> names = categoryList.stream()
									.map(c -> c.getName())
									.toList();
		
		cbo_category.setItems(FXCollections.observableArrayList(names));
		
	}

	private void loadAuthors() {
		
		authorList = DatabaseService.findAllAuthors();
		
		List<String> names = authorList.stream()
									.map(a -> a.getName())
									.collect(Collectors.toList());
		
		cbo_author.setItems(FXCollections.observableArrayList(names));
		
	}
	
	private void showAlert(AlertType type, String content) {
		
		Alert alert = new Alert(type);
		alert.setContentText(content);
		alert.setHeaderText(null);
		alert.setTitle("Message");
		alert.showAndWait();
		
	}
}
