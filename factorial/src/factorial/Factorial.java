package factorial;

public class Factorial 
{ 	
    public static void main(String[] args) 
    { 
    	long startTime=System.currentTimeMillis();
        // infinite loop because condition is not apt 
        // condition should have been i>0. 
        for (int i = 1; i <= 1000; i++ ) 
        { 
            System.out.println(i); 
        } 
       
        
        long endTime=System.currentTimeMillis();
        
        System.out.println("Time Difference:"+(endTime-startTime));
        
    } 
}