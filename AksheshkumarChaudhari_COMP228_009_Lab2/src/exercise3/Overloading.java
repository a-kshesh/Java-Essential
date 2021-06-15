package exercise3;

public class Overloading {
	
	public static void main(String[] args) {
		duties();
		duties("coding");
		duties("coding","testing");

	}
	
	public static void duties() {
		System.out.println("No Duties left -0 parameter");
	}
	
	public static void duties(String duty1) {
		System.out.printf("1 duty: %s left -1 parameter \n",duty1);
	}
	
	public static void duties(String duty1,String duty2) {
		System.out.printf("2 Duties: %s & %s  left -2 parameters \n",duty1,duty2);
	}

}
