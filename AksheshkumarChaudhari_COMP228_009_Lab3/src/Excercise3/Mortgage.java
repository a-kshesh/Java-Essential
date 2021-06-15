package Excercise3;

import java.util.ArrayList;

public abstract class Mortgage implements MortgageConstants {
	double mortgageNumber;
	String custName;
	double mortgageAmount;
	double interestRate;
	int term;
	String mortgageType;
	
	public Mortgage(double mortgageNumber,String custName,double mortgageAmount,double interestRate,String term,String mortgageType) {
		this.mortgageNumber=mortgageNumber;
		this.custName=custName;
		if(mortgageAmount>maxMorgageAmount) 
		{this.mortgageAmount=maxMorgageAmount;}
		else
		{this.mortgageAmount=mortgageAmount;}
		this.interestRate=interestRate;
		if(term.toLowerCase().equals("short")) 
		{
			this.term=shortTerm;
		}
		else if(term.toLowerCase().equals("medium")) 
		{
			this.term=mediumTerm;
		}
		else if(term.toLowerCase().equals("long")) 
		{
		this.term=longTerm;
		} else 
		{
			this.term=shortTerm;
		}
		this.mortgageType=mortgageType;
	}


	public static void getMortgageInfo(ArrayList<Mortgage> morgageList) 
	{
		for(Mortgage m:morgageList) 
		{
			System.out.println("Mortgage Type: "+m.mortgageType +"\n");
			System.out.println("Name: "+m.custName);
			System.out.println("Morgage Number: "+m.mortgageNumber);
			System.out.println("Mortgage AMount: "+m.mortgageAmount);
			System.out.println("InterestRate: "+m.interestRate);
			System.out.println("Mortgage Term: "+m.term +" Year");
		}
	} 
	
}
