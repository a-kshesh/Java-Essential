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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ThirdController implements Initializable {
	@FXML
	private TextArea review;
	private InputDetails id;
	@FXML Label lblReview;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private void HandleActionbutton3(ActionEvent event) {
		openFourthWindow();
	}
	@FXML
	private void HandleActionbuttonSave(ActionEvent event) {
		id.setReview(review.getText());
		lblReview.setText(review.getText());
		
	}
	
	public void populateName(InputDetails type) {
		id = type;
	}
	private void openFourthWindow() {
		try {
			Stage stage = new Stage();
			stage.setTitle("Movie Application");
			String fxmlFileName = "FourthWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			FourthController cn = loader.<FourthController>getController();
			cn.populateData(id);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
