package extending_thread_class;

public class Difference_Between_Method_Call_And_Start_Method extends Thread{
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		Difference_Between_Method_Call_And_Start_Method obj1=new Difference_Between_Method_Call_And_Start_Method();
		
		//fine, but does not start a separate call stack 
		obj1.run();
		
		//The start() will call the separate call stack for thread
		obj1.start();
		
		//A call stack is a stack data structure that stores information 
		// about the active subroutines of a computer program.
	}
}
