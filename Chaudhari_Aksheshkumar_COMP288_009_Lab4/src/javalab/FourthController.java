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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FourthController implements Initializable {
	InputDetails id;
	@FXML
	private Label lblActor;
	final String actor[] = {"Jacky","Rock","Scarlatte","Johny Depp"};
	
	@FXML
	private ComboBox<String> combobox ;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		combobox.getItems().removeAll(combobox.getItems());
		combobox.getItems().addAll(actor);
		
	}
	public void populateData(InputDetails type) {
		this.id = type;
	}
	@FXML
	private void HandleActionbutton4(ActionEvent event) {
		openFifthWindow();
	}
	@FXML
	private void HandleActionbuttonSave(ActionEvent event) {
		lblActor.setText(String.valueOf(combobox.getSelectionModel().getSelectedItem()));
		id.setActor(lblActor.getText());
		
	}
	
	private void openFifthWindow() {
		try {
			Stage stage = new Stage();
			stage.setTitle("Movie Application");
			String fxmlFileName = "FifthWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			FifthController cn = loader.<FifthController>getController();
			cn.populateData(id);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
