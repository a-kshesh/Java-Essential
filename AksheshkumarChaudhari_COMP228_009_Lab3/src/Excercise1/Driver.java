package Excercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		ArrayList<Insurance> insurance = new ArrayList<Insurance>();
		
		for(int i=0;i<2;i++) {
		System.out.println("which insurance plan you would like to choose ,Life or Health ?");
		String type= input.next();
		System.out.println("what's the monthly cost?");
		var cost= input.nextDouble();
		if (type.toLowerCase().equals("health")) {
			Health health= new Health(type,cost);
			insurance.add(health);
		}else {
			Life life= new Life(type,cost);
			insurance.add(life);
		}
		}
		InsuranceService.CalculateInterest(insurance);
		
	}

}
