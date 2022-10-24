package thread_pool_examples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{
	private String taskName;
	
	//constructor of the class tasks
	public Tasks(String str) {
		//initializing the field task name
		taskName=str;
	}
	
	//printing the task name and then sleeps for 1 sec
	//the complete process is getting  repeated five times
	public void run() {
		try {
			for(int j=0;j<=5;j++) {
				if(j==0) {
					Date dt=new Date();
					SimpleDateFormat sdf=new SimpleDateFormat("hh : mm : ss");
					
					//prints the initialization time for every task
					System.out.println("Initialization time for the task name: "+taskName+" = "+sdf.format(dt));
				}
				//1000ms=1 sec
				Thread.sleep(1000);
			}
			System.out.println(taskName+" is complete");
		} catch(InterruptedException e) {
			e.fillInStackTrace();
		}
	}
}

public class Thread_Pool_Example2 {
	static final int Max_Th=3;
	//main method
	public static void main(String[] args) {
		//creating five new tasks
		Runnable task1=new Tasks("Task1");
		Runnable task2=new Tasks("Task2");
		Runnable task3=new Tasks("Task3");
		Runnable task4=new Tasks("Task4");
		Runnable task5=new Tasks("Task5");
		
		//creating a thread pool with MAX_TH number of
		//threads size the pool size is fixed
		ExecutorService pool=Executors.newFixedThreadPool(Max_Th);
		
		//passes the task objects to the pool to execute(step3)
		pool.execute(task1);
		pool.execute(task2);
		pool.execute(task3);
		pool.execute(task4);
		pool.execute(task5);
		
		//pool is shutdown
		pool.shutdown();
	}
}
