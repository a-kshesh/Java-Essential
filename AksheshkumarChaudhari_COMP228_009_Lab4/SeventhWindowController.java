package Application;

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


public class SeventhWindowController implements Initializable {
	@FXML 
	private Label lb1;
	
	@FXML
	private Slider slider = new Slider(0,5,2.5);
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		 slider.valueProperty().addListener((obs, oldValue, newValue) -> {
			 lb1.setText(String.valueOf((int)newValue.doubleValue()));
		 }
		 );
		 

	}

	@FXML
    private void handleButtonAction(ActionEvent event) {
	
		openSeventhWindow();
	}
		
	private void openSeventhWindow()
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "Seventh_Window.fxml";
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
