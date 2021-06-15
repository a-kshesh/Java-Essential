package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RingQueries {
	
	private static final String URL = "jdbc:derby:ring";
	private static final String USERNAME = "tutorial";
	private static final String PASSWORD = "tutorial";

	private Connection connection;
	private PreparedStatement selectAllRing;
	private PreparedStatement selectRingByMaterial;
	private PreparedStatement addRing;
	private PreparedStatement updateRing;
	private PreparedStatement removeRing;

	public RingQueries() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			selectAllRing = connection.prepareStatement("SELECT * FROM ring ORDER BY material");

			selectRingByMaterial = connection.prepareStatement("SELECT * FROM ring WHERE material = ?");

			addRing = connection.prepareStatement("INSERT INTO ring  (ringsize,material,width) VALUES (?, ?, ?)");
			
			updateRing = connection.prepareStatement("UPDATE ring SET ringsize = ?, material = ?, width = ?");
			
			removeRing = connection.prepareStatement("DELETE FROM ring WHERE material=?");
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}

	public int getRingCounts() 
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
				Ring ring = new Ring(resultSet.getInt("ringId"),resultSet.getInt("ringSize"), resultSet.getString("material"),
										resultSet.getInt("width"));
				
				results.add(ring);
			}

			return results;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return null;
	}

	public List<Ring> getRingByMaterial(String material) 
	{
		try {
			selectRingByMaterial.setString(1, material);
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return null;
		}

		try (ResultSet resultSet = selectRingByMaterial.executeQuery()) 
		{
			List<Ring> results = new ArrayList<Ring>();

			while (resultSet.next()) 
			{
				Ring ring = new Ring(resultSet.getInt("ringId"),resultSet.getInt("ringSize"), resultSet.getString("material"),
						resultSet.getInt("width"));
				results.add(ring);
			}

			return results;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return null;
		}
	}

	public int addRing(int ringSize, String material, int width) 
	{

		try {
			addRing.setInt(1, ringSize);
			addRing.setString(2, material);
			addRing.setInt(3, width);
			return addRing.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return 0;
		}
	}

	public int updateRing(int ringSize, String material, int width) 
	{

		try {
			updateRing.setInt(1,ringSize);
			updateRing.setString(2, material);
			updateRing.setInt(3, width);
			

			return updateRing.executeUpdate();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			return 0;
		}
	}

	public int removeRing(String material) 
	{
		try {
			removeRing.setString(1, material);

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
