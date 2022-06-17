package application.controller;


import java.io.IOException;

import application.Main;
import application.entity.Librarian;
import application.service.DatabaseService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

	public static Librarian login_librarian;
	
    @FXML
    private TextField txt_name;

    @FXML
    private PasswordField txt_password;

    @FXML
    void btn_clear_click(ActionEvent event) {

    	txt_name.setText(null);
    	txt_password.setText(null);
    }

    @FXML
    void btn_exit_click(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void btn_login_click(ActionEvent event) throws IOException {
    	
    	String name = txt_name.getText();
    	String password = txt_password.getText();
    	
    	var librarian = DatabaseService.login(name,password);
    	if(librarian != null) {
    		login_librarian = librarian;
    		Main.change_Scene("view/Main.fxml");
    	}
    	else {
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setContentText("You are name or password is incorrect!");
    		alert.setHeaderText(null);
    		alert.setTitle("Login Fail!");
    		alert.showAndWait();
    	}
    	
//    	var user = DatabaseService.login(email, password);
//    	if(user != null) {
//    		login_librarian = user;
//    		Main.change_Scene("view/Main.fxml");
//    	}
//    	else {
//    		Alert alert = new Alert(AlertType.ERROR);
//    		alert.setContentText("You are not authenticated");
//    		alert.setHeaderText(null);
//    		alert.setTitle("Message");
//    		alert.showAndWait();
//    	}
    }
}
