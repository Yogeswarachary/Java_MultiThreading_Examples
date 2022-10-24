package thread_priority;

public class Thread_Priority_Example1 extends Thread{
	//method1, when ever the start method is called by a thread
	//the run() invoked
	public void run() {
		//the print statement
		System.out.println("Inside the run() method");
	}
	//The main method
	public static void main(String[] args) {
		//creating threads with the help of class name
		Thread_Priority_Example1 thread1= new Thread_Priority_Example1();
		Thread_Priority_Example1 thread2=new Thread_Priority_Example1();
		Thread_Priority_Example1 thread3=new Thread_Priority_Example1();
		
		//In the above we do not mention the priority of the thread
		//by default the thread priority is 5
		
		//1st thread printing the priority by using getPriority(), similarly remaining threads also
		System.out.println("Priority of the thread1 is: "+thread1.getPriority());
		System.out.println("Priority of the thread2 is: "+thread2.getPriority());
		System.out.println("Priority of the thread3 is: "+thread3.getPriority());
		
		//setting priorities to the above threads by passing integer values
		thread1.setPriority(6);
		thread2.setPriority(3);
		thread3.setPriority(9);
		
		//thread1 having priority of 6
		System.out.println("Priority of thread1 is: "+thread1.getPriority());
		
		//thread2 having priority of 3
		System.out.println("Priority of thread2 is: "+thread2.getPriority());
		
		//thread3 having priority of 9
		System.out.println("Priority of thread3 is: "+thread3.getPriority());
		
		//Main thread
		//Displaying name of the currently executed thread
		System.out.println("Currently Executing thread: "+Thread.currentThread().getName());
		
		System.out.println("Priority of the main thread is: "+Thread.currentThread().getPriority());
		
		//Priority of the main thread is 10 now
		Thread.currentThread().setPriority(10);
		
		System.out.println("Priority of the main thread is: "+Thread.currentThread().getPriority());
	}
}
