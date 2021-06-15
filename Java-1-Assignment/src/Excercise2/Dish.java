package Excercise2;

public class Dish 
{
	
	int quantity;
	String dishname;
	String description;
	boolean createdish;
	
	
	public int getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public String getDishname() 
	{
		return dishname;
	}

	public void setDishname(String dishname)
	{
		this.dishname = dishname;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	
	public String getInformation()
	{
		return String.format("Dish name is %s, serving quantity %d  and your order is confirmed", dishname, quantity);
	}
}

