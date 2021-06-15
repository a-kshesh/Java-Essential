package application;
import java.io.IOException;
import java.security.SecureRandom;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuWindowController implements Initializable
{

	private MovieQueries queries = new MovieQueries();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		SecureRandom random = new SecureRandom();
		int ticketCounts = this.queries.getTicketCounts();
		if(ticketCounts < 3) 
		{
			int movie1 = this.queries.addTicket("Inox", "Warden", "Dumb & Dumber", Integer.toString(250), 5, "8.00 AM");
			int movie2 = this.queries.addTicket("3D", "Brampton", "IP Man", Integer.toString(120), 7, "8:45 PM");
			int movie3 = this.queries.addTicket("Cineplex", "Pape", "The Raid Redmption", Integer.toString(222), 3, "11:00 PM");
			int movie4 = this.queries.addTicket("Cinestarz", "Bloor Yonge", "12 Years a Slave", Integer.toString(659), 20, "11.00 AM");
			
		}
	}
	
	public void passQueriesObject() 
	{
		
	};
	
	
	
	@FXML
	private void handleBTView(ActionEvent event)
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "ViewWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root;
			root = loader.load();
			Scene scene = new Scene(root,400,400);
			stage.setScene(scene);
			ViewWindowController controller = loader.<ViewWindowController>getController();
			controller.passQueriesObject(queries);
			stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@FXML
	private void handleBTCreate(ActionEvent event) 
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "CreateWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root;
			root = loader.load();
			Scene scene = new Scene(root,400,400);
			stage.setScene(scene);
			CreateWindowController controller = loader.<CreateWindowController>getController();
			controller.passQueriesObject(queries);
			stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@FXML
	private void handleBTManage(ActionEvent event) 
	{
		try {
			Stage stage = new Stage();
			String fxmlFileName = "ManageWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root;
			root = loader.load();
			Scene scene = new Scene(root,400,400);
			stage.setScene(scene);
			ManageWindowController controller = loader.<ManageWindowController>getController();
			controller.passQueriesObject(queries);
			stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
