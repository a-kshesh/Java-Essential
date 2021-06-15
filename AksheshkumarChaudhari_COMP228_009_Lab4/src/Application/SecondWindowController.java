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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SecondWindowController implements Initializable {
	@FXML 
	private Label lb1;
	
	@FXML
	private RadioButton r1;
	
	@FXML
	private RadioButton r2;
	
	@FXML
	private ToggleGroup toggleGroup;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		toggleGroup=new ToggleGroup();
		this.r1.setToggleGroup(toggleGroup);
		this.r2.setToggleGroup(toggleGroup);
	}

	@FXML
	private void selectionEvent(ActionEvent event)
	{
		if(r1.isSelected())
		{
			lb1.setText(r1.getText());
		}
		else if(r2.isSelected())
		{
			lb1.setText(r2.getText());
		}
		else
		lb1.setText("please select value");
	}
	
	@FXML
    private void handleButtonAction(ActionEvent event) {
	
		openThirdWindow();
	}
		
	private void openThirdWindow()
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "Third_Window.fxml";
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
