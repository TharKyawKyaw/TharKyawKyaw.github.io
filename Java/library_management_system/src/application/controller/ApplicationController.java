package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class ApplicationController {

    @FXML
    void author_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/Authors.fxml");
    }

    @FXML
    void book_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/Books.fxml");
    }



    @FXML
    void btn_logout_click(ActionEvent event) throws IOException {
    	LoginController.login_librarian = null;
    	Main.change_Scene("view/Login.fxml");
    }

    @FXML
    void category_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/Categories.fxml");
    }

    @FXML
    void librarian_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/Librarians.fxml");
    }

    @FXML
    void member_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/Members.fxml");
    }
    
    @FXML
    void borrow_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/BorrowBook.fxml");
    }

    @FXML
    void return_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/ReturnBook.fxml");
    }

}
