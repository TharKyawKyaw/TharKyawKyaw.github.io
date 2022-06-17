package application.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import application.entity.Author;
import application.service.DatabaseService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.cell.PropertyValueFactory;

public class AuthorController implements Initializable{

    @FXML
    private TableColumn<Author, LocalDate> col_birthday;

    @FXML
    private TableColumn<Author, String> col_city;

    @FXML
    private TableColumn<Author, LocalDateTime> col_create;

    @FXML
    private TableColumn<Author, Integer> col_id;

    @FXML
    private TableColumn<Author, String> col_name;

    @FXML
    private TableColumn<Author, LocalDateTime> col_update;

    @FXML
    private TableView<Author> tbl_author;

    @FXML
    private DatePicker txt_birthday;

    @FXML
    private TextField txt_city;

    @FXML
    private TextField txt_name;

    @FXML
    void btn_add_click(ActionEvent event) {
    	String name = txt_name.getText();
    	String city = txt_city.getText();
    	LocalDate dob = txt_birthday.getValue();
    	
    	if(name.isEmpty()) {

    		showAlert(AlertType.WARNING, "Please enter name");
    		return;
    	}
    	if(city.isEmpty()) {

    		showAlert(AlertType.WARNING, "Please enter city");
    		return;
    	}
    	if(dob == null) {
    		showAlert(AlertType.WARNING, "Please choose birthday");
    		return;
    	}
    	
    	// create author obj
    	var author = new Author();
    	author.setBirthday(dob);
    	author.setCity(city);
    	author.setName(name);
    	
    	// save
    	DatabaseService.saveAuthor(author);
    	
    	clearData();
    	loadAuthors();
    	
    }

    private void clearData() {
		
    	txt_birthday.setValue(null);
    	txt_name.setText(null);
    	txt_city.setText(null);
		
	}

	@FXML
    void btn_back_click(ActionEvent event) throws IOException {
		
		   
		   Main.change_Scene("view/Main.fxml");

    }

    @FXML
    void btn_delete_click(ActionEvent event) {

    	var author = tbl_author.getSelectionModel().getSelectedItem();
    	
    	if(author != null) {
    		var output = showAlert(AlertType.CONFIRMATION, "Are you sure to delete?");
    		if(output.get() == ButtonType.OK) {
    			
    			DatabaseService.deleteAuthorById(author.getId());
    			clearData();
    			loadAuthors();
    		}
    	}
    	
    	
    }

    @FXML
    void btn_update_click(ActionEvent event) {
    	
    	var select_author = tbl_author.getSelectionModel().getSelectedItem();
    	
    	select_author.setBirthday(txt_birthday.getValue());
    	select_author.setName(txt_name.getText());
    	select_author.setCity(txt_city.getText());
    	
    	DatabaseService.updateAuthor(select_author);
    	clearData();
    	loadAuthors();

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
		col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
		col_birthday.setCellValueFactory(new PropertyValueFactory<>("birthday"));
		col_city.setCellValueFactory(new PropertyValueFactory<>("city"));
		col_create.setCellValueFactory(new PropertyValueFactory<>("created_at"));
		col_update.setCellValueFactory(new PropertyValueFactory<>("updated_at"));

		
		loadAuthors();
		tbl_author.getSelectionModel().selectedItemProperty().addListener(
				(obs,old_select,new_select) -> {
					if(new_select != null) {
						var author = tbl_author.getSelectionModel().getSelectedItem();
						txt_birthday.setValue(author.getBirthday());
						txt_city.setText(author.getCity());
						txt_name.setText(author.getName());
					}
				}
		);
		
	}
	
	private Optional<ButtonType> showAlert(AlertType type, String body) {
		Alert alert = new Alert(type);
		alert.setContentText(body);
		alert.setTitle("Message");
		alert.setHeaderText(null);
		Optional<ButtonType> result = alert.showAndWait();
		
		return result;
		
	}

	private void loadAuthors() {
		
		var authors = DatabaseService.findAllAuthors();
		
		tbl_author.setItems(FXCollections.observableArrayList(authors));
		
	}
}
