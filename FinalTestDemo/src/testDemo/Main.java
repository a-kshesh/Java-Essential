package testDemo;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		//the file name below has to match your fxml file name 
		String fxmlFileName = "firstWindow.fxml";
		primaryStage.setTitle("Ring");
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
