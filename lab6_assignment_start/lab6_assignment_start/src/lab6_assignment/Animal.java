package lab6_assignment;

import java.security.SecureRandom;


//TODO 1 modify this class declaration so that it can be used as a task in Executor framework
public class Animal  {
	private final static SecureRandom generator = new SecureRandom();
	private final String type;
	private final int sleepTime; 

	public Animal(String type, int startMls, int endMls) {
		super();
		this.type = type;
		this.sleepTime = startMls + generator.nextInt(endMls);
	}

	public String getType() {
		return type;
	}

	//@Override
	public void run() {
		for (int x = 1; x < 10; x++) {
			try {
				//TODO 2  put thread to sleep. use sleepTime variable declared above
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(type + " ran " + x + " meters");
	
		}
		System.out.println(type + " arrived at finish line");
	}

}
