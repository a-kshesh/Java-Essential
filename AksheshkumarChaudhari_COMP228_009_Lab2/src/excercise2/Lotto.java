package excercise2;

import java.util.Random;

public class Lotto 
{
 int[] array= new int[3];
 
 	public Lotto() {
 		Random random=new Random();
		array[0] =random.nextInt(5)+1;
		array[1] =random.nextInt(5)+1;
		array[2] =random.nextInt(5)+1;
 	}
 	
 	public int[] getArray() 
 	{
 	return 	array;
 	}
 	
 	
 	
 }
