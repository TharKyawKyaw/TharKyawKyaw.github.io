package application.controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class BookController {

    @FXML
    void btn_add_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/AddBook.fxml");
    }

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Main.fxml");
    }

    @FXML
    void btn_delete_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/DeleteBook.fxml");
    }

    @FXML
    void btn_edit_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/EditBook.fxml");
    }

    @FXML
    void btn_search_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/SearchBook.fxml");
    }
}
