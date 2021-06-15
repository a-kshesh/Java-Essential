package javalab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class FifthController implements Initializable{
	InputDetails id;
	@FXML
	private Label lblMovie;
	private final ObservableList<String> movie = FXCollections.observableArrayList(); 
	@FXML 
	ListView<String> listMovie = new ListView<>(movie);

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		movie.addAll("Pirates","Iron Man-2","Ip Man","Rush Hour");
		listMovie.setItems(movie);
		
	}
	@FXML
	private void HandleActionbutton5(ActionEvent event) {
		openSixthWindow();
	}
	@FXML
	private void HandleActionbuttonSave(ActionEvent event) {
		lblMovie.setText(listMovie.getSelectionModel().getSelectedItem());
		id.setMovie(listMovie.getSelectionModel().getSelectedItem());
	}
	public void populateData(InputDetails movie) {
		id = movie;
	}
	private void openSixthWindow() {
		try {
			Stage stage = new Stage();
			stage.setTitle("Movie Application");
			String fxmlFileName = "SixthWindow.fxml";
			FXMLLoader loader = new  FXMLLoader(getClass().getResource(fxmlFileName));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			SixthController controller = loader.<SixthController>getController();
			controller.populateData(id);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
