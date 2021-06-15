package excercise2;
import java.util.Scanner;
public class Driver 
{
	public static void main(String[] args)
	{
		Dish dishes = new Dish();
		Scanner input = new Scanner(System.in);
		System.out.println(" want to order a Dish?");
		String dish = input.next();
		if (dish.equals("yes")) {
			System.out.println("Enter the quantity of the Dish:");
			dishes.setQuantity(input.nextDouble());
			System.out.println("Name of the dish please?");
			dishes.setName(input.next());
			System.out.println("Description of the dish please?");
			dishes.setDescription(input.next());
			System.out.println("Enter ingredients:");
			String inst = input.next();
			System.out.println("Enter cooking instructions of Dish:");
			String cookinginst = input.next();
			dishes.setRecipe(inst,cookinginst);
			System.out.println("Information: " + dishes.getInformation());
		} 
		else
		{
			System.out.println("Thank you....");
		}
		input.close();
	}
}
