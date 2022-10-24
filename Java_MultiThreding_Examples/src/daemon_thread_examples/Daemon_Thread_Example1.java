package daemon_thread_examples;

public class Daemon_Thread_Example1 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			//checking for daemon thread
			System.out.println("daemon thread work");
		}
		else {
			System.out.println("User thread work");
		}
	}
	public static void main(String[] args) {
		Daemon_Thread_Example1 thread1=new Daemon_Thread_Example1();
		Daemon_Thread_Example1 thread2=new Daemon_Thread_Example1();
		Daemon_Thread_Example1 thread3=new Daemon_Thread_Example1();
		
		//setting thread1 as daemon thread
		thread1.setDaemon(true);
		
		//starting threads
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
