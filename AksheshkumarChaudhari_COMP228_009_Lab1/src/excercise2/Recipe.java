package excercise2;

public class Recipe 
{
	private String ingredients;
	private String cookingInstructions;
	
	public Recipe(String ingredients, String cookingInstructions) 
	{
		this.cookingInstructions = cookingInstructions;
		this.ingredients = ingredients;
	}

	public String getIngredients() 
	{
		return ingredients;
	}

	public void setIngredients(String ingredients) 
	{
		this.ingredients = ingredients;
	}


	public String getCookingInstructions() 
	{
		return cookingInstructions;
	}


	public void setCookingInstructions(String cookingInstructions) 
	{
		this.cookingInstructions = cookingInstructions;
	}

}

