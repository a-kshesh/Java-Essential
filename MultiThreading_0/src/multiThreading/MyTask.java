package multiThreading;

//Fig. 23.3: PrintTask.java
//PrintTask class sleeps for a random time from 0 to 5 seconds
import java.security.SecureRandom;

public class MyTask implements Runnable 
{
private final static SecureRandom generator = new SecureRandom();
private int sleepTime; // random sleep time for thread
private final String taskName; // name of task
private int myInt;
 
// constructor
public MyTask(String taskName, int myInt)
{
   this.taskName = taskName;
   this.myInt = myInt;
} 

// method run contains the code that a thread will execute
public void run() 
{
   try // put thread to sleep for sleepTime amount of time 
   {
 	  System.out.println("running task: " +taskName);
 	  // pick random sleep time between 0 and 5 seconds
       sleepTime = generator.nextInt(5000); // milliseconds
 	  int result = 10 + myInt;
      System.out.printf("%s going to sleep for %d milliseconds.%nThe result of sum is %d%n", 
         taskName, sleepTime, result);
      Thread.sleep(sleepTime); // put thread to sleep
   }       
   catch (InterruptedException exception)
   {
      exception.printStackTrace();
     // Thread.currentThread().interrupt(); // re-interrupt the thread
   } 
     
   // print task name
   System.out.printf("%s done sleeping%n", taskName); 
} 
} // end class PrintTask
