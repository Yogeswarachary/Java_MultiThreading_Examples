package thread_priority;

public class Thread_Priority_Example2 extends Thread{
	//Whenever the start() method is called by thread
	//the run method is invoked
	public void run() {
		System.out.println("inside the run() method");
	}
	
	//main method
	public static void main(String[] args) {
		//Now priority of main thread is setting to the 7
		Thread.currentThread().setPriority(7);
		
		//the current thread is retrived using the current thread()
		//displaying the main thread priority using the getPriority()
		System.out.println("The priority of main thread is: "+Thread.currentThread().getPriority());
		
		//creating a thread by using the class name
		Thread_Priority_Example2 thread1=new Thread_Priority_Example2();
		
		//thread one is the child thread of main thread
		// therefore the child thread is also have the same priority like main thread
		System.out.println("Priority of the child thread or Thread1 is: "+thread1.getPriority());
	}
}
