package Excercise1;
import java.util.Scanner;

public class Driver 
{
	 
	
	public static void main(String[] args)
	{
		Dish dish= new Dish();
		System.out.println("Please enter Dish name");
		Scanner input =new Scanner(System.in);
		dish.setdishname(input.next()); 
		
		System.out.println("Please enter Serving Numbers");
		dish.setquantity(input.nextInt());
		
		System.out.println("Please enter description");
		dish.setdescription(input.next());
		
		System.out.println("So you want to confirm the order ? ");
		dish.setcreatedish(input.nextBoolean());
		System.out.println(dish.getInformation());
		
		input.close();
	}
	
}
