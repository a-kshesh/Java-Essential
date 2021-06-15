package javalab;

import java.util.ArrayList;

public class InputDetails {
	private String type;
	private String category;
	private String review;
	private String actor;
	private String movie;
	private ArrayList<String> place = new ArrayList<String>();
	private int rating;
	public void setPlace(ArrayList<String> place) {
		this.place = place;
	}
	public ArrayList<String> getPlace() {
		return place;
	}
	
	public String getActor() {
		return actor;
	}
	
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public String getMovie() {
		return movie;
	}
	
	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public InputDetails() {
		
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
