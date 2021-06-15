package excercise2;

public class Dish {

	private double quantity;
	private String name;
	private String description;
	private Recipe r; 

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

	public void setRecipe(String ingredients, String cookingInstructions) 
	{
		this.r = new Recipe(ingredients,cookingInstructions);
	}

	public String getInformation()
	{
		return String.format("Quantity of the Dishes: %f , \n Name of the Dish: %s, \n Dish description : %s,\n Ingredients are:%s,\n cooking Instructions:%s",
				quantity, name, description,this.r.getIngredients(),this.r.getCookingInstructions());
	}


}