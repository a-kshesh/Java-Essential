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
import javafx.scene.control.TextField;
import javafx.stage.Stage;




public class FirstWindowController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	}
	 @FXML
	 private TextField txtName;
	
	@FXML
    private void handleButtonAction(ActionEvent event) {
		

		openSecondaryWindow();
		
        
	}

	private void openSecondaryWindow()
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "Second_Window.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root,400,400);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
