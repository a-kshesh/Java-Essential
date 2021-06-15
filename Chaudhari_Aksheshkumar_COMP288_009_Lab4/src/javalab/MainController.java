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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable {
	@FXML
	private TextField type;

	InputDetails id = new InputDetails();
	@FXML
	private Label lbType;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private void HandleActionbutton1(ActionEvent event) {
		
		openSecondWindow();
	}
	@FXML
	private void HandleActionbuttonSave(ActionEvent event) {
		
		lbType.setText(type.getText());
		id.setType(type.getText());
	}
	
	private void openSecondWindow() {
		try {
			Stage stage = new Stage();
			stage.setTitle("Movie Application");
			String fxmlFileName = "SecondWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			SecondController controller = loader.<SecondController>getController();
			controller.populateName(id);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
