package Excercise3;

public class BusinessMortgage extends Mortgage {

	public BusinessMortgage(double mortgageNumber,String custName,double mortgageAmount,double interestRate,String term,String mortgageType) 
	
	{
		super( mortgageNumber, custName, mortgageAmount, interestRate+1, term, mortgageType);
	}

}
