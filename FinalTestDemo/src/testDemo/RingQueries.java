package testDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import java.util.ArrayList;

public class RingQueries {

	private static final String URL = "jdbc:derby:ring";
	private static final String USERNAME = "tutorial";
	private static final String PASSWORD = "tutorial";

	private Connection connection;
	private PreparedStatement selectAllRing;
	//private PreparedStatement selectMoviesBytheatreName;
	//private PreparedStatement addMovie;
	//private PreparedStatement updateMovie;
	private PreparedStatement removeRing;

	public RingQueries() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			selectAllRing = connection.prepareStatement("SELECT * FROM ring ORDER BY width");

			//selectMoviesBytheatreName = connection.prepareStatement("SELECT * FROM movies WHERE theatreName = ?");

			//addMovie = connection.prepareStatement("INSERT INTO movies  (theatreName,location,movieName,ticketNumber,seatNumber,startTime) VALUES (?, ?, ?, ?, ?, ?)");
			
			//updateMovie = connection.prepareStatement("UPDATE movies SET theatreName = ?, location = ?, movieName = ?, ticketNumber = ?, seatNumber = ?, startTime = ? WHERE theatreName = ?");
			
			removeRing = connection.prepareStatement("DELETE FROM ring WHERE width=?");
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}

	public int getTicketCounts() 
	{
		try (ResultSet resultSet = selectAllRing.executeQuery()) {
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
	
	public List<Ring> getAllRing()
	{
		try (ResultSet resultSet = selectAllRing.executeQuery()) {
			List<Ring> results = new ArrayList<Ring>();

			while (resultSet.next()) 
			{
				Ring ring = new Ring(resultSet.getInt("ringID "),resultSet.getInt("ringsize "), resultSet.getString("material"),
										resultSet.getInt("width"));
				
				results.add(ring);
			}

			return results;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return null;
	}
	
	public int removeRing(String width) 
	{
		try {
			removeRing.setString(1, width);

			return removeRing.executeUpdate();
		}
		catch (SQLException sqlException) 
		{
			sqlException.printStackTrace();
			return 0;
		}
	}

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
