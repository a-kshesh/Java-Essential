package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Label; 

public class CreateWindowController implements Initializable {

	private CoffeeQueries queries;
	
	@FXML
	private TextField quantity;
	
	@FXML
	private Label created; 
	
	@FXML
	private TextField productname ;
	
	@FXML
	private TextField customername ;
	
	
	public void passQueriesObject(CoffeeQueries queries) 
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
		created.setText("Created successsfully");
		this.queries.addOrder(Integer.parseInt(quantity.getText()), productname.getText(), 
				customername.getText());
		
	}

}
