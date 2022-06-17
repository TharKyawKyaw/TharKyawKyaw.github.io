package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

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

public class EditBookController implements Initializable {

    @FXML
    private ComboBox<String> cbo_author;

    @FXML
    private ComboBox<String> cbo_category;

    @FXML
    private TextField txt_code;

    @FXML
    private TextField txt_title;
    
    private List<Author> authorList;
    private List<Category> categoryList;

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Books.fxml");
    }

    @FXML
    void btn_search_click(ActionEvent event) {

    	String code = txt_code.getText();
    	
    	if(code.isEmpty()) {
    		showAlert(AlertType.WARNING, "Please enter code");
    		return;
    	}
    	
    	Book book = DatabaseService.findBookByCode(code);
    	if(book != null) {
    		
    		txt_title.setText(book.getTitle());
    		
    		cbo_author.getSelectionModel().select(book.getAuthorName());
    		cbo_category.getSelectionModel().select(book.getCategoryName());
    	}
    	else {
    		showAlert(AlertType.ERROR,"No book with this code.");
    	}
    	
    }

    @FXML
    void btn_update_click(ActionEvent event) {
    	
		Book book = new Book();
		book.setCode(Integer.parseInt(txt_code.getText()));
		book.setTitle(txt_title.getText());
		
		var author_index = cbo_author.getSelectionModel().getSelectedIndex();
		var category_index = cbo_category.getSelectionModel().getSelectedIndex();
		
		book.setAuthor(authorList.get(author_index));
		book.setCategory(categoryList.get(category_index));
		
		if(DatabaseService.updateBook(book)) {
			showAlert(AlertType.INFORMATION,"Update Success");
		}
		else {
			showAlert(AlertType.ERROR, "Something Wrond");
		}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		authorList = DatabaseService.findAllAuthors();
		categoryList = DatabaseService.findAllCategories();
		
		var author_names = authorList.stream()
									.map(a -> a.getName())
									.toList();
		
		var cate_name = categoryList.stream()
									.map(c -> c.getName())
									.toList();
		
		cbo_author.setItems(FXCollections.observableArrayList(author_names));
		cbo_category.setItems(FXCollections.observableArrayList(cate_name));
		
	}
	
    private void showAlert(AlertType type, String string) {
		
    	Alert alert = new Alert(type);
    	alert.setContentText(string);
    	alert.setTitle("Message");
    	alert.setHeaderText(null);
    	alert.showAndWait();
		
	}

}
