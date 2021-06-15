	package application;
		
	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.stage.Stage;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	
	
	
	public class Main extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
				String fxmlFileName = "MainWindow.fxml";
		        Parent root = FXMLLoader.load(getClass().getResource(fxmlFileName));
				Scene scene = new Scene(root,400,400);
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}
