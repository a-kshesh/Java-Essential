package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class MovieQueries {

	private static final String URL = "jdbc:derby:movies";
	private static final String USERNAME = "tutorial";
	private static final String PASSWORD = "tutorial";

	private Connection connection;
	private PreparedStatement selectAllTickets;
	private PreparedStatement selectTicketsBytheatreName;
	private PreparedStatement addNewTicket;
	private PreparedStatement updateTicket;
	private PreparedStatement removeTicket;

// constructor
	public MovieQueries() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			selectAllTickets = connection.prepareStatement("SELECT * FROM movies ORDER BY theatreName");

			selectTicketsBytheatreName = connection.prepareStatement("SELECT * FROM movies WHERE theatreName = ?");

			addNewTicket = connection.prepareStatement("INSERT INTO movies  (theatreName,location,movieName,ticketNumber,seatNumber,startTime) VALUES (?, ?, ?, ?, ?, ?)");
			
			updateTicket = connection.prepareStatement("UPDATE movies SET theatreName = ?, location = ?, movieName = ?, ticketNumber = ?, seatNumber = ?, startTime = ? WHERE theatreName = ?");
			
			removeTicket = connection.prepareStatement("DELETE FROM movies WHERE theatreName=?");
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}

	public int getTicketCounts() 
	{
		try (ResultSet resultSet = selectAllTickets.executeQuery()) {
			int count = 0;
			while (resultSet.next()) {
				count++;
			}
			return count;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return 0;
	}
	
	public List<Movie> getAllTickets()
	{
		try (ResultSet resultSet = selectAllTickets.executeQuery()) {
			List<Movie> results = new ArrayList<Movie>();

			while (resultSet.next()) 
			{
				Movie movie = new Movie(resultSet.getString("theatreName"),resultSet.getInt("ticketId"), resultSet.getString("location"),
										resultSet.getString("movieName"),resultSet.getString("ticketNumber"),
										resultSet.getInt("seatNumber"),resultSet.getString("startTime"));
				
				results.add(movie);
			}

			return results;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return null;
	}
//
//	public List<Movie> getTicketsBytheatreName(String theatreName) 
//	{
//		try {
//			selectTicketsBytheatreName.setString(1, theatreName);
//		} catch (SQLException sqlException) {
//			sqlException.printStackTrace();
//			return null;
//		}
//
//		try (ResultSet resultSet = selectTicketsBytheatreName.executeQuery()) 
//		{
//			List<Movie> results = new ArrayList<Movie>();
//
//			while (resultSet.next()) 
//			{
//				Movie movie = new Movie(resultSet.getString("theatreName"),resultSet.getInt("ticketId"), resultSet.getString("location"),
//						resultSet.getString("movieName"),resultSet.getString("ticketNumber"),
//						resultSet.getInt("seatNumber"),resultSet.getString("startTime"));
//				results.add(movie);
//			}
//
//			return results;
//		} catch (SQLException sqlException) {
//			sqlException.printStackTrace();
//			return null;
//		}
//	}
//
	public int addTicket(String theatreName, String location, String movieName, String ticketNumber, int seatNumber, String startTime) 
	{

		try {
			addNewTicket.setString(1, theatreName);
			addNewTicket.setString(2, location);
			addNewTicket.setString(3, movieName);
			addNewTicket.setString(4, ticketNumber);
			addNewTicket.setInt(5, seatNumber);
			addNewTicket.setString(6, startTime);
			return addNewTicket.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return 0;
		}
	}
//
//	public int updateTicket(String search, String theatreName, String location, String movieName, String ticketNumber, int seatNumber, String startTime) 
//	{
//
//		try {
//			updateTicket.setString(1, theatreName);
//			updateTicket.setString(2, location);
//			updateTicket.setString(3, movieName);
//			updateTicket.setString(4, ticketNumber);
//			updateTicket.setInt(5, seatNumber);
//			updateTicket.setString(6, startTime);
//			updateTicket.setString(7, search);
//			
//
//			return updateTicket.executeUpdate();
//		} catch (SQLException sqlException) {
//			sqlException.printStackTrace();
//			return 0;
//		}
//	}
//
//	public int removeTicket(String theatreName) 
//	{
//		try {
//			removeTicket.setString(1, theatreName);
//
//			return removeTicket.executeUpdate();
//		}
//		catch (SQLException sqlException) 
//		{
//			sqlException.printStackTrace();
//			return 0;
//		}
//	}

	public void close() 
	{
		try {
			connection.close();
		}
		catch (SQLException sqlException) 
		{
			sqlException.printStackTrace();
		}
	}
}
