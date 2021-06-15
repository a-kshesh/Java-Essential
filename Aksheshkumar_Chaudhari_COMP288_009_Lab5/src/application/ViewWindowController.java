package application;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class ViewWindowController implements Initializable {

	private MovieQueries queries;
	private final ObservableList<Movie> movie = FXCollections.observableArrayList();

	@FXML
	private ListView<Movie> ticketListView;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{	
	}

	public void passQueriesObject(MovieQueries queries) 
	{
		this.queries = queries;
		List<Movie> ticket = this.queries.getAllTickets();
		
		for(Movie t : ticket) 
		{
			movie.add(t);
		}
		ticketListView.setItems(movie);	
	}
}
