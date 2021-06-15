package Excercise3;

public class PersonalMortgage extends Mortgage {
	
	public PersonalMortgage(double mortgageNumber,String custName,double mortgageAmount,double interestRate,String term,String mortgageType) {
		super( mortgageNumber, custName, mortgageAmount, interestRate+2, term,mortgageType);
	}

}
