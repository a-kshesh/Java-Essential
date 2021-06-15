package Excercise1;

import java.util.ArrayList;

public class InsuranceService {
	
	public static void CalculateInterest(ArrayList<Insurance> insurance) {
		for(Insurance i:insurance) {
			i.setInsuranceCost();
			i.displayInfo();
		}
		
	}

}
