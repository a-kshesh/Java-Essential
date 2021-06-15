package excercise2;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Lotto l1=new Lotto();
		int[] a= l1.getArray();
		Scanner input = new Scanner(System.in);
		System.out.println("enter number between 3 and 15");
		int first= input.nextInt();
		if (first==(a[0]+a[1]+a[2])) {
			System.out.println("Congratulations, you win");
		}
		else {
			System.out.println("You lose, 2nd attempt");

			int second= input.nextInt();
			Lotto l2=new Lotto();
			int[] b=l2.getArray();
			if (second==(b[0]+b[1]+b[2])) {
				System.out.println("Congratulations, you win");
			}else {
				System.out.println("You lose, 3rd and last attempt");

				int third= input.nextInt();
				Lotto l3=new Lotto();
				int[] c=l2.getArray();
				if (second==(c[0]+c[1]+c[2])) {
					System.out.println("Congratulations, you win");
				}else {
					System.out.println("Game Over, Better luck next time");
				}
			}
		}

	}
}
