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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ThirdWindowController implements Initializable {
	@FXML 
	private Label lb1;
	
	@FXML
	private CheckBox c1;
	
	@FXML
	private CheckBox c2;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		

	}

	
	@FXML
	private void selectionEvent(ActionEvent event)
	{
		
		if(c1.isSelected())
		{
			lb1.setText(c1.getText());
		}
		if(c2.isSelected())
		{
			lb1.setText(c2.getText());
		}
		if(c1.isSelected() && c2.isSelected())
		{
			lb1.setText(c1.getText()+"/"+c2.getText());
		}
		if(!c1.isSelected() && !c2.isSelected())
		{
			lb1.setText("Please Select Something");
		}
		
	}
	@FXML
	private void selectionEvent2(ActionEvent event) {
		
	}
	
	@FXML
    private void handleButtonAction(ActionEvent event) {
	
		openFourthWindow();
	}
		
	private void openFourthWindow()
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "Fourth_Window.fxml";
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
