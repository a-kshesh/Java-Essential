package application;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType; 

public class CreateWindowController implements Initializable {

	private MovieQueries queries;
	
	@FXML
	private TextField theatreName;
	
	@FXML
	private TextField location;
	
	@FXML
	private TextField movieName;
	
	@FXML
	private TextField startTime;
	
	@FXML
	private TextField seatNumber;
	
	
	public void passQueriesObject(MovieQueries queries) 
	{
		this.queries = queries;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
	}
	

	@FXML
	private void handleCreateButton(ActionEvent event) 
	{
		SecureRandom random = new SecureRandom();
		//int movie = this.queries.addTicket(theatreName.getText(), location.getText(), movieName.getText(),Integer.toString(random.nextInt(100000)) , Integer.parseInt(seatNumber.getText()), startTime.getText());	
	}

}
