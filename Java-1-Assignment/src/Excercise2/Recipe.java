package Excercise2;

public class Recipe {
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

public String getcookingInstructions() 
{
	return cookingInstructions;
} 
}
