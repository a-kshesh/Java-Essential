package Excercise1;

public class Dish 
{
	
	int quantity;
	String dishname;
	String description;
	boolean createdish;
	
	
	public int getquantity() 
	{
		return quantity;
	}

	public void setquantity(int quantity)
	{
		this.quantity = quantity;
	}

	public String getdishname() 
	{
		return dishname;
	}

	public void setdishname(String dishname)
	{
		this.dishname = dishname;
	}

	public String getdescription() 
	{
		return description;
	}

	public void setdescription(String description) 
	{
		this.description = description;
	}

	public boolean crreatedish() 
	{
		return createdish;
	}

	public void setcreatedish(boolean createdish) 
	{
		this.createdish = createdish;
	}
	
	public String getInformation()
	{
		return String.format("Dish name is %s, serving quantity %d  and your order is confirmed", dishname, quantity);
	}
}

