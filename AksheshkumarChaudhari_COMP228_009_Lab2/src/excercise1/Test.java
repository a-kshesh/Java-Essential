package excercise1;

import java.util.Random;
import java.util.Scanner;

public class Test 
{
		int b=0;
		public Test() {}
	
		char answerKey[] = new char[]{'a','b','c','d','a'};
		
		String message[][]=new String[][] {
			{"Great job" ,"Awesome","voiila, Keep it Up","you're smart"},
			{"wrong Answer","sorry incorrect answer","please concentrate"}
		};
		
		String questions[] = new String[]{
				"Which of these values can a boolean variable contain?",
				"Which of these operators can be used to concatenate two or more String objects?",
				"Which of these method of class String is used to obtain length of String object?",
				"Which of these method of class String is used to extract a single character from a String object?",
				" Which of these is necessary to specify at time of one dimensional array initialization?"
		};
		String options[][] = new String[][]{
				{
					"True & False","0 & 1","Any integer value.","Both a & b"
				},
				{
					"=","+","||","-"
				},
				{
					"get()","lengthof()","length()","Sizeof()"
				},
				{
					"CHARAT()","CharAt()","charat()","charAt()"
				},
				{
					"Row","Column","Both Row and Column","None"
				}
		}; 	
		
	

	private String simulateQuestion(int questionNumber)
	{
		
		return String.format("q%d %s\na %s\nb %s\nc %s\nd %s\n",
				questionNumber+1,
				this.questions[questionNumber],
				this.options[questionNumber][0],
				this.options[questionNumber][1],
				this.options[questionNumber][2],
				this.options[questionNumber][3]);
	}
	
	private boolean checkAnswer(int questionNumber, char userAnswer)
	{
		if(answerKey[questionNumber] == userAnswer) {
			return true;
		}else {
			return false;
		}
		
	}
	
	private void generateMessage(boolean check)
	{
		
		Random random=new Random();
		int a=random.nextInt(3);
		if(check) {
			b++;
			System.out.println("{"+this.message[0][a]+"}\n\n");
		}
		else {
			System.out.println("{"+this.message[1][a]+"}\n\n");

		}
	}
	
	public void inputAnswer()
	{
		Scanner input = new Scanner(System.in);
		for(int i=0; i<this.questions.length; i++) {
			System.out.println(simulateQuestion(i));
			boolean check = checkAnswer(i,input.next().charAt(0));
			generateMessage(check);
		}
		double percent=(b*100)/5;
		System.out.printf("your score is %d/5 and percentage is %.2f",b,percent);
	}
	
}
