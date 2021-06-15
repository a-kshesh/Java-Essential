package Excercise1;

public class Health extends Insurance {	
	
	
	protected Health(String type, double monthlyCost) {
		super(type, monthlyCost);
	}

	public void setInsuranceCost() {
		totalCost=monthlyCost* 12;
	}
	
	public void displayInfo() {
		System.out.printf("your Health insurance cost is %.2f\n",totalCost);
	}

}
