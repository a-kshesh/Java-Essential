package javalab;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SixthController implements Initializable{
	@FXML
	private Label lblPlace1;
	@FXML
	private CheckBox cb1;
	@FXML
	private CheckBox cb2;
	InputDetails id;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private void HandleActionbutton6(ActionEvent event) {
		openSeventhWindow();
	}
	public void populateData(InputDetails place) {
		id = place;
	}
	@FXML
	private void HandleActionbuttonSave(ActionEvent event) {
		ArrayList<String> place = new ArrayList<String>();
		ArrayList<String> lblPlace = new ArrayList<>();
		if(cb1.isSelected()) {
			lblPlace.add(cb1.getText());
			place.add(cb1.getText());
			
		}
		if(cb2.isSelected()) {
			lblPlace.add(cb2.getText());
			place.add(cb2.getText());
		}
		
		id.setPlace(place);
		lblPlace1.setText(String.join(",", place));
		
	}
	private void openSeventhWindow() {
		try {
			Stage stage = new Stage();
			stage.setTitle("Movie Application");
			String fxmlFileName = "SeventhWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			SeventhController controller = loader.<SeventhController>getController();
			controller.populateData(id);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
