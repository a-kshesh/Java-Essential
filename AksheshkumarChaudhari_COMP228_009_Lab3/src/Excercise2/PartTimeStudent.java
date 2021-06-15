package Excercise2;

public class PartTimeStudent extends Student{
	public PartTimeStudent(String name,Boolean partTimeStudent) {
		super(name, partTimeStudent);
	}
	
	public void tution() {
		fees=creditHours*100;
	}

}
