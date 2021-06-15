package processors;

import java.util.ArrayList;

import furniture.Furniture;

public class itemsProcessor  {
	public static void displayItems(ArrayList<Furniture> furniture)
	{
		for(Furniture items:furniture)
		{
			System.out.printf("Legs: "+items.name+"\n");
			System.out.printf("Name: "+items.legs+"\n");
			System.out.printf(items.name+"Is "+items.foldable+"\n");
		}
	}
	
	public static void displayItems(Furniture furniture)
	{
		
	}
}
