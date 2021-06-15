package application;

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
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class FifthWindowController implements Initializable {
	@FXML 
	private Label lb1;
	
	@FXML
	private ListView<String> Actors;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		Actors.getItems().add("Jacky");
		Actors.getItems().add("Huge");
		Actors.getItems().add("Scarlatte");
		Actors.getItems().add("Rock");

	}

	
	@FXML
	private void selectionEvent(MouseEvent event)
	{
		lb1.setText(Actors.getSelectionModel().getSelectedItem());
	}
	
	@FXML
    private void handleButtonAction(ActionEvent event) {
	
		openSixthWindow();
	}
		
	private void openSixthWindow()
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "Sixth_Window.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root,400,400);
			stage.setScene(scene);
			//SecondWindowController controller = loader.<SecondWindowController>getController();
			//controller.passData(movies);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
