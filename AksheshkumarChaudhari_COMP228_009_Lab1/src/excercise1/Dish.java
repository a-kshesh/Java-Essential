package excercise1;

public class Dish {

	private double quantity;
	private String name;
	private String description;

	public double getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(double quantity) 
	{
		this.quantity = quantity;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getInformation() // Creating getInformation method
	{
		return String.format("The Quantity of the Dish is: %f , \n The Name of the Dish is: %s, \n description for dish: %s",
				quantity, name, description);
	}
}