package lab6_assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Driver {
	
	public static void main(String[] args) {
	
	  Fox task1 = new Fox("fox", 2000, 3000);
      Rabbit task2 = new Rabbit("rabbit", 1000, 3000);
      Turtle task3 = new Turtle("turtle", 2500, 4000);

      // TODO 3 create ExecutorService to manage threads
      ExecutorService executorService = Executors.newCachedThreadPool();

      // TODO 4 send the three Tasks for execution
      executorService.execute(task1); 	
      executorService.execute(task2); 
      executorService.execute(task3); 

      // TODO 5 shut down ExecutorService--it decides when to shut down threads
      

      System.out.printf("Tasks started, main thread ends.%n%n");
      executorService.shutdown();
      
      try{
          // TODO 6 wait 30 seconds for all tasks to finish executing
          boolean tasksEnded =executorService.awaitTermination(30, TimeUnit.SECONDS);

          if (tasksEnded)
          {
             System.out.printf("All tasks finished running!");
          }else {
             System.out.println(
                "Timed out while waiting for tasks to finish.");
          }
       } 
       catch (Exception ex)
       {
          ex.printStackTrace();
       } 
	
   } 
}
