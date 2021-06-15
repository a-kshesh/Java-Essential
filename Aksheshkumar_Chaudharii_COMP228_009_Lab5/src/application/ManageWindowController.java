package application;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class ManageWindowController implements Initializable {

	private MovieQueries queries;
	
	@FXML
	private TextField search;
	
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
	private TextField movieId;
	
	@FXML
	private Label message;
	
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
		List<Movie> m = this.queries.getMoviesBytheatreName(search.getText());
		if(m.size() > 0) 
		{
			location.setText(m.get(0).getLocation());
			movieName.setText(m.get(0).getMovieName());
			movieId.setText(Integer.toString(m.get(0).getmovieID()));
			theatreName.setText(m.get(0).gettheatreName());
			time.setText(m.get(0).getStartTime());
			seatNumber.setText(Integer.toString(m.get(0).getSeatNumber()));
		}
		else
		{
			location.setText("");
			movieName.setText("");
			theatreName.setText("");
			time.setText("");
			seatNumber.setText("");
		}
	}
	
	@FXML
	public void handleBTUpdate(ActionEvent event) 
	{
		message.setText("Updated");
		this.queries.updateMovie(search.getText(),theatreName.getText(), location.getText(), movieName.getText(),Integer.toString(12) , Integer.parseInt(seatNumber.getText()), time.getText());
		
	}
	
	@FXML
	public void handleBTRemove(ActionEvent event) 
	{
		message.setText("Removed");
		int m = this.queries.removeMovie(search.getText());
		if(m > 0) 
		{
			location.setText("");
			movieName.setText("");
			time.setText("");
			seatNumber.setText("");
			theatreName.setText("");
			search.setText("");
			movieId.setText("");
			 
		}
	}

}
