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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


public class SixthWindowController implements Initializable {
	@FXML 
	private Label lb1;
	
	@FXML
	private TextArea textArea;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		

	}

	
	@FXML
	private void selectionEvent(ActionEvent event)
	{
		lb1.setText(textArea.getText());
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
