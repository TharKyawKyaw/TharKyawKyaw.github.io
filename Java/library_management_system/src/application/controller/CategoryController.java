package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import application.entity.Category;
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

public class CategoryController implements Initializable {

	
    @FXML
    private TableColumn<Category, Integer> col_id;

    @FXML
    private TableColumn<Category, String> col_name;

    @FXML
    private TableView<Category> tbl_category;

    @FXML
    private TextField txt_name;

    private List<Category> categoryList;
    @FXML
    void btn_add_click(ActionEvent event) {
    	
		   String name = txt_name.getText();
		   
		   DatabaseService.saveCategory(name);
		   txt_name.setText(null);
		   loadCategories();
    }

    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Main.fxml");
    }

    @FXML
    void btn_delete_click(ActionEvent event) {
    	
		   var category = tbl_category.getSelectionModel().getSelectedItem();
		   
		   if(category != null) {
			   Alert alert = new Alert(AlertType.CONFIRMATION);
			   alert.setContentText("Are you sure to delete");
			   
			   alert.setHeaderText(null);
			   Optional<ButtonType> result =alert.showAndWait();
			   if(result.get() == ButtonType.OK) {
				   
				   DatabaseService.deleteCategoryById(category.getId());
				   txt_name.setText(null);
				   loadCategories();
			   }
		   }
    }

    @FXML
    void btn_search_click(ActionEvent event) {
    	
    	
    	String category = txt_name.getText();
    	
    	var categoryList = DatabaseService.searchCategory(category);
    	
    	
        	if(categoryList != null) {
        		tbl_category.setItems(FXCollections.observableArrayList(categoryList));
        	}
        	else {
        		tbl_category.setItems(null);
        	}
    }


    @FXML
    void btn_update_click(ActionEvent event) {
    	
		   String name = txt_name.getText();
		   
		   Category category = tbl_category.getSelectionModel().getSelectedItem();
		   category.setName(name);
		   
		   DatabaseService.updateCategory(category);
		   txt_name.setText(null);
		   loadCategories();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
		col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		loadCategories();
		
		tbl_category.getSelectionModel().selectedItemProperty().addListener(
				(obs,old_select,new_select) -> {
					if(new_select != null) {
						var category = tbl_category.getSelectionModel().getSelectedItem();
						txt_name.setText(category.getName());
					}
				}
		);
	}
	
	private void loadCategories() {
		
		categoryList = DatabaseService.findAllCategories();
		
		tbl_category.setItems(FXCollections.observableArrayList(categoryList));
		
	}
}
