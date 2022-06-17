package application.controller;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    void author_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/Authors.fxml");
    }

    @FXML
    void book_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/Books.fxml");
    }

    @FXML
    void category_click(MouseEvent event) throws IOException {
    	Main.change_Scene("view/Categories.fxml");
    }
}
