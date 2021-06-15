package javalab;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class EighthController implements Initializable{
	private InputDetails id;
	@FXML
	private ImageView imageview;
	@FXML
	private Label lblType;
	@FXML
	private Label lblCategory;
	@FXML
	private Label lblReview;
	@FXML
	private Label lblActor;
	@FXML
	private Label lblMovie;
	@FXML
	private Label lblPlace;
	@FXML
	private Label lblRating;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
        Image image = new Image("/javalab/image.jpg");
        imageview.setImage(image);    
        
	}
	public void loadData(InputDetails data) {
		this.id = data;
		lblType.setText(id.getType());     
		lblCategory.setText(id.getCategory());
		lblReview.setText(id.getReview());
		lblActor.setText(id.getActor());
		lblMovie.setText(id.getMovie());
		lblPlace.setText(id.getPlace().toString());
		lblRating.setText(String.format("%d", id.getRating()) +" Star");
		
		
	}

}
