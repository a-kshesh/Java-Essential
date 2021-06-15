package Excercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessMortgage
{

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in); 
		ArrayList<Mortgage> morgageList=new ArrayList<Mortgage>();
		for(int i=0;i<2;i++) 
		{
			System.out.println("what's the current rate ?");
			double userInputRate=input.nextDouble();
			System.out.println("Which mortgage type are you interested in, Business or Personal ?");
			String userInputType=input.next();
			if(userInputType.toLowerCase().equals("business"))
			{
				String mortgageType="Business";
				//double mortgageNumber,String custName,double mortgageAmount,double interestRate,int term,String userInputType
				System.out.println("Please enter your name");
				String userInputName=input.next();
				System.out.println("Please enter Morgage Number");
				double userInputMorNum=input.nextDouble();
				System.out.println("Please enter Morgage Amount");
				double userInputMorAmt=input.nextDouble();
				System.out.println(" which plan Short/medium/Long term plan?");
				String userInputTerm=input.next();
				BusinessMortgage business= new BusinessMortgage(userInputMorNum,userInputName,userInputMorAmt,userInputRate,userInputTerm,userInputType);
				morgageList.add(business);
			}
			else
			{
				String mortgageType="Personal";
				//double mortgageNumber,String custName,double mortgageAmount,double interestRate,int term,String userInputType
				System.out.println("Please enter your name");
				String userInputName=input.next();
				System.out.println("Please enter Morgage Number");
				double userInputMorNum=input.nextDouble();
				System.out.println("Please enter Morgage Amount");
				double userInputMorAmt=input.nextDouble();
				System.out.println(" which plan Short/medium/Long term ?");
				String userInputTerm=input.next();	
				PersonalMortgage personal= new PersonalMortgage(userInputMorNum,userInputName,userInputMorAmt,userInputRate,userInputTerm,userInputType);
				morgageList.add(personal);
				
				
			}
			
		}
		Mortgage.getMortgageInfo(morgageList);
	}

}
