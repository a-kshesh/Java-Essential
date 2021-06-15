package Excercise2;

public abstract class Student {
 String name;
 Boolean fullTimeStudent;
 double fees;
 int creditHours;
 
 protected Student(String name,Boolean fullTimeStudent) {
	 this.name=name;
	 this.fullTimeStudent=fullTimeStudent;
 }
 public abstract void tution();
}
