package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import application.entity.Librarian;
import application.service.DatabaseService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class LibrarianController implements Initializable {

    @FXML
    private TableColumn<Librarian, Integer> col_id;

    @FXML
    private TableColumn<Librarian, String> col_name;

    @FXML
    private TableColumn<Librarian, String> col_password;

    @FXML
    private TableView<Librarian> tbl_librarian;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_name;

    @FXML
    private PasswordField txt_password;

    @FXML
    private TextField txt_search;
    
    private List<Librarian> librariansList;

    @FXML
    void btn_add_click(ActionEvent event) {
    	
    	String id = txt_id.getText();
    	String name = txt_name.getText();
    	String password = txt_password.getText();
    	
    	if(id.isEmpty()) {
    		showAlert(AlertType.WARNING, "Id can't be empty");
    		return;
    	}
    	if(name.isEmpty()) {
    		showAlert(AlertType.WARNING, "Name can't be empty");
    		return;
    	}
    	if(password.isEmpty()) {
    		showAlert(AlertType.WARNING, "Password can't be empty");
    		return;
    	}
    	
    	Librarian lib = new Librarian();
    	lib.setId(Integer.parseInt(id));
    	lib.setName(name);
    	lib.setPassword(password);
    	
    	if(DatabaseService.saveLibrarian(lib)) {
    		showAlert(AlertType.INFORMATION,"New librarian is added");
    		loadLibrarians();
    		reset();
    	}
    	else {
    		showAlert(AlertType.ERROR, "Something was wrond");
    	}
    	

    }
    


    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Main.fxml");
    }

    @FXML
    void btn_delete_click(ActionEvent event) {
    	
    	var lib = tbl_librarian.getSelectionModel().getSelectedItem();
    	
    	if(lib != null) {
			   Alert alert = new Alert(AlertType.CONFIRMATION);
			   alert.setContentText("Are you sure to delete");
			   
			   alert.setHeaderText(null);
			   Optional<ButtonType> result =alert.showAndWait();
			   if(result.get() == ButtonType.OK) {
				   
				   DatabaseService.deleteLibrarianByCode(lib.getId());
				   tbl_librarian.setItems(null);
				   reset();
				   loadLibrarians();
			   }
    	}
    }

    @FXML
    void btn_edit_click(ActionEvent event) {
    	
    		int id = Integer.parseInt(txt_id.getText());
		   	String name = txt_name.getText();
		   	String password = txt_password.getText();
		   
		   	Librarian lib = tbl_librarian.getSelectionModel().getSelectedItem();
		   	
		   	lib.setName(name);
		   	lib.setPassword(password);
		   
		   	if(id == lib.getId()) {
		   		DatabaseService.updateLibrarian(lib);
		   		reset();
			   	loadLibrarians();
		   	}
		   	else {
		   		showAlert(AlertType.WARNING, "Id can't be change");
		   	}
		   	
    	
    }

    @FXML
    void btn_search_click(ActionEvent event) {

    	String lib = txt_search.getText();
    	
    	var librarianList = DatabaseService.searchLibrarianWihId(lib);
    	
    	
    		if(librarianList != null) {
    			tbl_librarian.setItems(FXCollections.observableArrayList(librarianList));
    		}
    		else {
    			tbl_librarian.setItems(null);
    		}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
		col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
		col_password.setCellValueFactory(new PropertyValueFactory<>("password"));
		
		loadLibrarians();
		
		tbl_librarian.getSelectionModel().selectedItemProperty().addListener(
				(obs,old_select,new_select) -> {
					if(new_select != null) {
						var librarian = tbl_librarian.getSelectionModel().getSelectedItem();
						txt_id.setText(librarian.getIdToString(librarian.getId()));
						txt_name.setText(librarian.getName());
						txt_password.setText(librarian.getPassword());
					}
				}
		);
		
	}

	private void loadLibrarians() {
		
		librariansList = DatabaseService.findAllLibrarians();
		
		tbl_librarian.setItems(FXCollections.observableArrayList(librariansList));

	}
	private void showAlert(AlertType type, String content) {
		
		Alert alert = new Alert(type);
		alert.setContentText(content);
		alert.setHeaderText(null);
		alert.setTitle("Message");
		alert.showAndWait();
		
	}
	
    private void reset() {
    	txt_id.setText(null);
    	txt_name.setText(null);
    	txt_password.setText(null);
    }
    
	
}
