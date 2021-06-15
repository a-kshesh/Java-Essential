package Excercise2;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Driver {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What's your name?");
		String userName=input.nextLine();
		System.out.println("Are you a Full-time Student?");
		String userInput=input.nextLine();
		if(userInput.toLowerCase().equals("fulltime")) {
			FullTimeStudent fullTime=new FullTimeStudent(userName, true);
		}else if (userInput.toLowerCase().equals("parttime")) {
			PartTimeStudent fullTime=new PartTimeStudent(userName, false);
			System.out.println("Your number of Credit Hours?");
			int credit=input.nextInt();
		}

	}

}
