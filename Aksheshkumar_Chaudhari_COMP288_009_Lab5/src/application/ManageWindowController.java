package application;
import java.net.URL;
import java.security.SecureRandom;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ManageWindowController implements Initializable {

	private MovieQueries queries;
	
	@FXML
	private TextField location;
	
	@FXML
	private TextField movieName;
	
	@FXML
	private TextField theatreName;
	
	@FXML
	private TextField time;
	
	@FXML
	private TextField seatNumber;
	
	@FXML
	private TextField search;
	
	public void passQueriesObject(MovieQueries queries)
	{
		this.queries = queries;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{

	}
	
	@FXML
	public void handleSearchButton(ActionEvent event) 
	{
//		List<Movie> m = this.queries.getTicketsBytheatreName(search.getText());
//		if(m.size() > 0) 
//		{
//			location.setText(m.get(0).getLocation());
//			movieName.setText(m.get(0).getMovieName());
//			theatreName.setText(m.get(0).gettheatreName());
//			time.setText(m.get(0).getStartTime());
//			seatNumber.setText(Integer.toString(m.get(0).getSeatNumber()));
//		}
//		else
//		{
//			location.setText("");
//			movieName.setText("");
//			theatreName.setText("");
//			time.setText("");
//			seatNumber.setText("");
//			Alert a = new Alert(AlertType.NONE);
//			a.setAlertType(AlertType.ERROR); 
//			a.setContentText("No Match Found");
//            a.show();
//		}
	}
	
	@FXML
	public void handleUpdateButton(ActionEvent event) 
	{
		SecureRandom random = new SecureRandom();
//		int movie = this.queries.updateTicket(search.getText(),theatreName.getText(), location.getText(), movieName.getText(),Integer.toString(random.nextInt(100000)) , Integer.parseInt(seatNumber.getText()), time.getText());
//		if(movie > 0) 
//		{
//			Alert a = new Alert(AlertType.NONE);
//			a.setAlertType(AlertType.INFORMATION); 
//			a.setContentText("Updated Successfully");
//            a.show(); 
//		}
	}
	
	@FXML
	public void handleRemoveButton(ActionEvent event) 
	{
//		int m = this.queries.removeTicket(search.getText());
//		if(m > 0) 
//		{
//			location.setText("");
//			movieName.setText("");
//			time.setText("");
//			seatNumber.setText("");
//			theatreName.setText("");
//			search.setText("");
//			Alert a = new Alert(AlertType.NONE);
//			a.setAlertType(AlertType.INFORMATION); 
//			a.setContentText("Successfully Deleted");
//            a.show(); 
//		}
	}

}
