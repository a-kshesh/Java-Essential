package Excercise1;

public class Life extends Insurance{
	protected Life(String type, double monthlyCost) {
		super(type, monthlyCost);
	}
	public void setInsuranceCost() {
		totalCost=monthlyCost* 12;
	}
	public void displayInfo() {
		System.out.printf("your Life insurance cost is %.2f\n",totalCost);
		
	}

}
