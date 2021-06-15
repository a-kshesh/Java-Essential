package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class controller_class implements Initializable {
	@FXML
	private TextField name;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	private void actionhandle(ActionEvent event) {
		System.out.println("asgew"+name.getText());
	}

}
