package application.controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import application.Main;
import application.entity.Member;
import application.service.DatabaseService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class MemberController implements Initializable{

    @FXML
    private TableColumn<Member,String> col_academic_year;

    @FXML
    private TableColumn<Member, String> col_class_year;

    @FXML
    private TableColumn<Member, LocalDate> col_expire_date;

    @FXML
    private TableColumn<Member, Integer> col_id;

    @FXML
    private TableColumn<Member, String> col_name;

    @FXML
    private TableColumn<Member, LocalDate> col_register_date;

    @FXML
    private TableColumn<Member, Integer> col_roll_number;

    @FXML
    private TableView<Member> tbl_member;

    @FXML
    private TextField txt_academic_year;

    @FXML
    private TextField txt_class_year;



    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_name;

    @FXML
    private DatePicker txt_register_date;

    @FXML
    private TextField txt_roll_number;
    
    @FXML
    private TextField txt_search_id;

    @FXML
    private TextField txt_search_name;
    
    private List<Member> memberList;

    @SuppressWarnings("unused")
	@FXML
    void btn_add_click(ActionEvent event) {
    	
    	String id = txt_id.getText();
    	String name = txt_name.getText();
    	String rNo = txt_roll_number.getText();
    	String cYear = txt_class_year.getText();
    	String aYear = txt_academic_year.getText();
    	LocalDate regDate = txt_register_date.getValue();
    	LocalDate expDate = regDate.plusYears(2);
    	
    	if(id.isEmpty()) {
    		showAlert(AlertType.WARNING, "Enter member card id");
    		return;
    	}
    	if(name.isEmpty()) {
    		showAlert(AlertType.WARNING, "Enter member name");
    		return;
    	}
    	if(rNo.isEmpty()) {
    		showAlert(AlertType.WARNING, "Enter member roll number");
    		return;
    	}
    	if(cYear.isEmpty()) {
    		showAlert(AlertType.WARNING, "Enter member class year");
    		return;
    	}
    	if(aYear.isEmpty()) {
    		showAlert(AlertType.WARNING, "Enter member academic year");
    		return;
    	}
    	if(regDate == null) {
    		showAlert(AlertType.WARNING, "Enter member register date");
    		return;
    	}
    	
    	//
    	Member mb = new Member();
    	mb.setCard_id(Integer.parseInt(id));
    	mb.setName(name);
    	mb.setRoll_no(Integer.parseInt(rNo));
    	mb.setClass_year(cYear);
    	mb.setAcademic_year(aYear);
    	mb.setRegister_date(regDate);
    	mb.setExpired_date(expDate);
    	

    	if(DatabaseService.saveMember(mb)) {
    		showAlert(AlertType.INFORMATION,"New member is added");
    		reset();
    	}
    	else {
    		showAlert(AlertType.ERROR, "Something is wrong");
    	}
    	loadMembers();
    }

    @FXML
    void btn_delete_click(ActionEvent event) {
    	
		   var member = tbl_member.getSelectionModel().getSelectedItem();
		   
		   if(member != null) {
			   Alert alert = new Alert(AlertType.CONFIRMATION);
			   alert.setContentText("Are you sure to delete");
			   
			   alert.setHeaderText(null);
			   Optional<ButtonType> result =alert.showAndWait();
			   if(result.get() == ButtonType.OK) {
				   
				   DatabaseService.deleteMemberById(member.getCard_id());
				   reset();
				   loadMembers();
			   }
		   }
    }

    @FXML
    void btn_edit_click(ActionEvent event) {
    	
    	int id = Integer.parseInt(txt_id.getText());
    	String name = txt_name.getText();
    	String rNo = txt_roll_number.getText();
    	String cYear = txt_class_year.getText();
    	String aYear = txt_academic_year.getText();
    	LocalDate regDate = txt_register_date.getValue();
    	LocalDate expDate = regDate.plusYears(3);
    	

    	Member mb = tbl_member.getSelectionModel().getSelectedItem();
    	mb.setCard_id(mb.getCard_id());
    	mb.setName(name);
    	mb.setRoll_no(Integer.parseInt(rNo));
    	mb.setClass_year(cYear);
    	mb.setAcademic_year(aYear);
    	mb.setRegister_date(regDate);
    	mb.setExpired_date(expDate);
		   
    	if(id == mb.getCard_id()) {
    		DatabaseService.updateMember(mb);
    		reset();
    		loadMembers();
    	}
    	else {
    		showAlert(AlertType.WARNING, "Card id must be same with old");
    	}
		
    }

    @FXML
    void btn_search_click(ActionEvent event) {

    	String s_id = txt_search_id.getText();
    	String s_name = txt_search_name.getText();
    	
    	var memberList = DatabaseService.searchMember(s_id,s_name);
    	
    	if(memberList.size() > 0) {
    		tbl_member.setItems(FXCollections.observableArrayList(memberList));
    	}
    	else {
    		tbl_member.setItems(null);
    	}
    }
    
    @FXML
    void btn_back_click(ActionEvent event) throws IOException {
    	Main.change_Scene("view/Main.fxml");
    }



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		col_id.setCellValueFactory(new PropertyValueFactory<>("card_id"));
		col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
		col_roll_number.setCellValueFactory(new PropertyValueFactory<>("roll_no"));
		col_class_year.setCellValueFactory(new PropertyValueFactory<>("class_year"));
		col_academic_year.setCellValueFactory(new PropertyValueFactory<>("academic_year"));
		col_register_date.setCellValueFactory(new PropertyValueFactory<>("register_date"));
		col_expire_date.setCellValueFactory(new PropertyValueFactory<>("expired_date"));
		
		loadMembers();
		
		tbl_member.getSelectionModel().selectedItemProperty().addListener(
				(obs,old_select,new_select) -> {
					if(new_select != null) {
						var category = tbl_member.getSelectionModel().getSelectedItem();
						txt_id.setText(category.toString(category.getCard_id()));
						txt_name.setText(category.getName());
						txt_roll_number.setText(category.toString(category.getRoll_no()));
						txt_class_year.setText(category.getClass_year());
						txt_academic_year.setText(category.getAcademic_year());
						txt_register_date.setValue(category.getRegister_date());
					}
				}
		);
		
	}



	private void loadMembers() {
		
		memberList = DatabaseService.findAllMembers();
		
		tbl_member.setItems(FXCollections.observableArrayList(memberList));
	
	}
	
	private void reset() {
		txt_id.setText(null);
		txt_name.setText(null);
		txt_roll_number.setText(null);
		txt_class_year.setText(null);
		txt_academic_year.setText(null);
		txt_register_date.setValue(null);
	}
	
	private void showAlert(AlertType type, String content) {
		
		Alert alert = new Alert(type);
		alert.setContentText(content);
		alert.setHeaderText(null);
		alert.setTitle("Message");
		alert.showAndWait();
		
	}
}
