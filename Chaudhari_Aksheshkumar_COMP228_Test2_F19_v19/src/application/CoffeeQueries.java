package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import java.util.ArrayList;

public class CoffeeQueries {

	private static final String URL = "jdbc:derby:coffeeorder";
	private static final String USERNAME = "tutorial";
	private static final String PASSWORD = "tutorial";

	private Connection connection;
	private PreparedStatement selectAllOrder;	
	private PreparedStatement removeOrder;

	public CoffeeQueries() {
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			selectAllOrder = connection.prepareStatement("SELECT * FROM coffeeorder ORDER BY quantity");			
			removeOrder = connection.prepareStatement("DELETE FROM coffeeorder WHERE quantity =?");
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}
	
	public List<CoffeeOrder> getAllOrder()
	{
		try (ResultSet resultSet = selectAllOrder.executeQuery()) {
			List<CoffeeOrder> results = new ArrayList<CoffeeOrder>();

			while (resultSet.next()) 
			{
				CoffeeOrder order = new CoffeeOrder(resultSet.getInt("orderID"),resultSet.getInt("quantity"),
						resultSet.getString("productname "),resultSet.getString("customername"));
				
				results.add(order);
			}

			return results;
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

		return null;
	}
	
	public int removeOrder(String quantity) 
	{
		try {
			removeOrder.setString(1, quantity);

			return removeOrder.executeUpdate();
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
