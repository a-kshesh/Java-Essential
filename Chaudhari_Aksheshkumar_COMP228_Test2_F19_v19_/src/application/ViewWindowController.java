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

	private CoffeeQueries queries;
	private final ObservableList<CoffeeOrder> coffeeOrder = FXCollections.observableArrayList();

	@FXML
	private ListView<CoffeeOrder> coffeeOrderListView;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{	
	}

	public void passQueriesObject(CoffeeQueries queries) 
	{
		this.queries = queries;
		List<CoffeeOrder> m = this.queries.getAllOrder();
		
		for(CoffeeOrder t : m) 
		{
			coffeeOrder.add(t);
		}
		coffeeOrderListView.setItems(coffeeOrder);	
	}
}
