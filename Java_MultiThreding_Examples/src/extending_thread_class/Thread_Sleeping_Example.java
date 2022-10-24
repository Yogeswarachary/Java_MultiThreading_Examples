package extending_thread_class;

public class Thread_Sleeping_Example extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			//the thread will sleep for the 500 milli seconds
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Thread_Sleeping_Example obj1=new Thread_Sleeping_Example();
		Thread_Sleeping_Example obj2=new Thread_Sleeping_Example();
		
		obj1.start();
		obj2.start();
	}

}
