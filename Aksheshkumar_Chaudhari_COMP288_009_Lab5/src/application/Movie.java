package application;

public class Movie {

	private int ticketId;
	private String location;
	private String movieName;
	private String ticketNumber;
	private int seatNumber;
	private String theatreName;
	private String startTime;
	
	/**
	 * @return the theatreName
	 */
	public String gettheatreName() {
		return theatreName;
	}


	/**
	 * @param theatreName the theatreName to set
	 */
	public void settheatreName(String theatreName) {
		this.theatreName = theatreName;
	}


	@Override
	public String toString() {
		return "Theatre Name = "+theatreName+"\n Ticket Id = " + ticketId + "\n Location = " + location + "\n Movie Name: " + movieName + "\n Ticket Number: "
				+ ticketNumber + "/n Seat Number: " + seatNumber + "\n Time: " + startTime ;
	}


	public Movie(String theatreName,int ticketId, String location, String movieName, String ticketNumber, int seatNumber,String startTime) {
		this.ticketId = ticketId;
		this.location = location;
		this.movieName = movieName;
		this.ticketNumber = ticketNumber;
		this.seatNumber = seatNumber;
		this.startTime = startTime;
		this.theatreName = theatreName;
	}
	
	
	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}
	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @return the ticketNumber
	 */
	public String getTicketNumber() {
		return ticketNumber;
	}
	/**
	 * @param ticketNumber the ticketNumber to set
	 */
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	/**
	 * @return the seatNumber
	 */
	public int getSeatNumber() {
		return seatNumber;
	}
	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	
}
