package Excercise1;

public abstract class Insurance {
	String type;
	double monthlyCost;
	double totalCost;
	
	public String getType(){
		return type;
	}
	
	protected Insurance(String type,double monthlyCost) {
		this.type=type;
		this.monthlyCost=monthlyCost;
	}
	
	public double getMonthlyCost() {
		return monthlyCost;
	}
	
	public abstract void setInsuranceCost();
	public abstract void displayInfo();
	
}