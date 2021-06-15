package javalab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class SecondController implements Initializable{
	@FXML
	private Label lbl1;
	@FXML
	private Label lblCategory;
	
	InputDetails id;
	@FXML
	private RadioButton r1;
	@FXML
	private RadioButton r2;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	public void populateName(InputDetails type) {
		id = type;
	}
	@FXML
	private void HandleActionbutton2(ActionEvent event) {
		
		openThirdWindow();
	}
	@FXML
	private void HandleActionbuttonSave(ActionEvent event) {
		if(r1.isSelected()) {
			 id.setCategory(r1.getText());
			 lblCategory.setText(r1.getText());
		}
		else if(r2.isSelected()) {
			id.setCategory(r2.getText());
			 lblCategory.setText(r2.getText());
		}
		else {
			lblCategory.setText("Select Something");
		}
		
	}
	private void openThirdWindow() {
		try {
			Stage stage = new Stage();
			stage.setTitle("Movie Application");
			String fxmlFileName = "ThirdWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			ThirdController cn = loader.<ThirdController>getController();
			cn.populateName(id);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
