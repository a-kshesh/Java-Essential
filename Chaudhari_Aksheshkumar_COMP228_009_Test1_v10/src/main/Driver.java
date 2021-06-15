package main;

import java.util.ArrayList;
import java.util.Scanner;

import bedding.Blanket;
import furniture.Chair;
import furniture.Furniture;
import furniture.Sofa;
import processors.itemsProcessor;


public class Driver {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		ArrayList<Furniture> furniture=new ArrayList<Furniture>();
		
		Chair chair1=new Chair(4,"sliding Chair","foldable");
		furniture.add(chair1);
		Blanket blanket=new Blanket(0,"winter Blanket","Foldable");
		furniture.add(blanket);
		Sofa sofa= new Sofa(6,"leather Sofa","not Foldable");
		furniture.add(sofa);
		System.out.println("Legs of chair");
		int userInputLegs=input.nextInt();
		System.out.println("Chair type?");
		String userChairType=input.next();
		System.out.println("Chair foldable?");
		String userChairFoldable=input.next();
		String foldable;
			
		if(userChairFoldable.equals("yes"))
		{
			 foldable="foldable";
		}else {
			 foldable="not Foldable";
		}
		Chair chair2=new Chair(userInputLegs,userChairType,foldable);
		furniture.add(chair2);
		
		itemsProcessor.displayItems(furniture);
		
	}

}
