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
import javafx.scene.control.Slider;
import javafx.stage.Stage;

public class SeventhController implements Initializable{
	@FXML
	Slider slider = new Slider();
	@FXML
	private Label lblRate;
	InputDetails id;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private void HandleActionbutton7(ActionEvent event) {
		openEighthWindow();
	}
	@FXML
	private void HandleActionbuttonSave(ActionEvent event) {
		lblRate.setText(""+(((int)slider.getValue())+1));
		id.setRating((((int)slider.getValue())+1));
		
	}
	public void populateData(InputDetails rate) {
		id = rate;
	}
	private void openEighthWindow() {
		try {
			Stage stage = new Stage();
			stage.setTitle("Movie Application");
			String fxmlFileName = "EighthWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			EighthController controller = loader.<EighthController>getController();
			controller.loadData(id);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
