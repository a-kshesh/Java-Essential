package Excercise2;

import java.util.Scanner;

import Excercise2.Dish;

public class Driver {

public static void main(String[] args) {
Dish dishes = new Dish();
Scanner input = new Scanner(System.in); 
System.out.println("you wanna create a Dish?");
String dish = input.next(); 
System.out.println("Enter the serving numbers:");
dishes.setQuantity(input.nextInt()); 
System.out.println("Dish name?");
dishes.setDishname(input.next());
System.out.println("Enter ingredients of Dish:");
String i = input.next();
System.out.println("Enter cooking instructions of Dish:");
String c = input.next();



dishes.setRecipe(i,c);

//String in = dishes.getRecipe();
System.out.println("Information: " + dishes.getInformation());
} else {
System.out.println("No dish is created since you din't choose any.");
}
input.close(); // Scanner close
}
}
