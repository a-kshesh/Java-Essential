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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class FourthWindowController implements Initializable {
	@FXML 
	private Label lb1;
	
	@FXML
	private ComboBox<String> cb1;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		cb1.getItems().add("Dumb & Dumber");
		cb1.getItems().add("Rush Hour 3");
		cb1.getItems().add("Game of Thrones");
		cb1.getItems().add("Designated Survivor");

	}

	
	@FXML
	private void selectionEvent(ActionEvent event)
	{
		lb1.setText("Selected Movie: "+cb1.getValue().toString());
	}
	
	
	@FXML
    private void handleButtonAction(ActionEvent event) {
	
		openFifthWindow();
	}
		
	private void openFifthWindow()
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "Fifth_Window.fxml";
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
