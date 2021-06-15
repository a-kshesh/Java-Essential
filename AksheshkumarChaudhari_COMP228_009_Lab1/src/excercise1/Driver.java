package excercise1;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		Dish dishes = new Dish();
		Scanner input = new Scanner(System.in); 
		System.out.println("create a Dish?");
		String dish = input.next();
		if (dish.equals("yes")) {
			System.out.println("Enter the quantity of the Dish:");
			dishes.setQuantity(input.nextDouble());
			System.out.println("Name of the dish ?");
			dishes.setName(input.next());
			System.out.println("Dish Description?");
			dishes.setDescription(input.next());
			
			System.out.println("Information: " + dishes.getInformation());
		} 
		else 
		{
			System.out.println("No dish has choosen.");
		}
		input.close();
	}
}
