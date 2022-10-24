package thread_pool_examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//class for working thread pool
class WorkerThread implements Runnable{
	private String message;
	//constructor
	public WorkerThread(String s) {
		this.message=s;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(Start) message= "+message);
		processmessage();//call process message method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
	}
	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadPool_Example {
	public static void main(String[] args) {
		//creating the pool of 6 threads
		ExecutorService executor=Executors.newFixedThreadPool(6);
		
		for(int i=0;i<10;i++) {
			Runnable worker=new WorkerThread(""+i);
			//Calling execute method of Executor service
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Finished all the thread");
	}
}
