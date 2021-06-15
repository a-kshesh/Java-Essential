package Excercise2;

public class FullTimeStudent extends Student {

	protected FullTimeStudent(String name,Boolean fullTimeStudent) {
		super(name,fullTimeStudent);
	}
	
	public void tution(){
		fullTimeStudent=true;
		
	}
}
