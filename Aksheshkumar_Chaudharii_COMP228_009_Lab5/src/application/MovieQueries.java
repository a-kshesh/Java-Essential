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
	private PreparedStatement selectAllMovie;
	private PreparedStatement selectMoviesBytheatreName;
	private PreparedStatement addMovie;
	private PreparedStatement updateMovie;
	private PreparedStatement removeMovie;

	public MovieQueries() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			selectAllMovie = connection.prepareStatement("SELECT * FROM movies ORDER BY theatreName");

			selectMoviesBytheatreName = connection.prepareStatement("SELECT * FROM movies WHERE theatreName = ?");

			addMovie = connection.prepareStatement("INSERT INTO movies  (theatreName,location,movieName,ticketNumber,seatNumber,startTime) VALUES (?, ?, ?, ?, ?, ?)");
			
			updateMovie = connection.prepareStatement("UPDATE movies SET theatreName = ?, location = ?, movieName = ?, ticketNumber = ?, seatNumber = ?, startTime = ? WHERE theatreName = ?");
			
			removeMovie = connection.prepareStatement("DELETE FROM movies WHERE theatreName=?");
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}

	public int getTicketCounts() 
	{
		try (ResultSet resultSet = selectAllMovie.executeQuery()) {
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
	
	public List<Movie> getAllMovies()
	{
		try (ResultSet resultSet = selectAllMovie.executeQuery()) {
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

	public List<Movie> getMoviesBytheatreName(String theatreName) 
	{
		try {
			selectMoviesBytheatreName.setString(1, theatreName);
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return null;
		}

		try (ResultSet resultSet = selectMoviesBytheatreName.executeQuery()) 
		{
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
			return null;
		}
	}

	public int addMovie(String theatreName, String location, String movieName, String ticketNumber, int seatNumber, String startTime) 
	{

		try {
			addMovie.setString(1, theatreName);
			addMovie.setString(2, location);
			addMovie.setString(3, movieName);
			addMovie.setString(4, ticketNumber);
			addMovie.setInt(5, seatNumber);
			addMovie.setString(6, startTime);
			return addMovie.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return 0;
		}
	}

	public int updateMovie(String search, String theatreName, String location, String movieName, String ticketNumber, int seatNumber, String startTime) 
	{

		try {
			updateMovie.setString(1, theatreName);
			updateMovie.setString(2, location);
			updateMovie.setString(3, movieName);
			updateMovie.setString(4, ticketNumber);
			updateMovie.setInt(5, seatNumber);
			updateMovie.setString(6, startTime);
			updateMovie.setString(7, search);
			

			return updateMovie.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return 0;
		}
	}

	public int removeMovie(String theatreName) 
	{
		try {
			removeMovie.setString(1, theatreName);

			return removeMovie.executeUpdate();
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
