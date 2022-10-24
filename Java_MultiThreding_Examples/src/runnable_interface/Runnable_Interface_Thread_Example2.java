package runnable_interface;

public class Runnable_Interface_Thread_Example2 implements Runnable{
	//Override method from runnable interface
	public void run() {
		System.out.println("Now the thread is running...");
	}
	
	//main method
	public static void main(String[] args) {
		//creating an object of the class mythread2
		Runnable r1=new Multi_Threading_Runnable_Interface_Example();
		
		//creating object of the class thread using thread(Runnable r, String name)
		Thread th1=new Thread(r1, "this is new thread");
		
		//the start() method moves the thread to the active state
		th1.start();
		
		//getting the thread name by invoking the getName() method
		String str=th1.getName();
		System.out.println(str);
	}
	
}
