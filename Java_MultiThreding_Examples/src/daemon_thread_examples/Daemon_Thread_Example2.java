package daemon_thread_examples;

public class Daemon_Thread_Example2 extends Thread {
	public void run() {
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		Daemon_Thread_Example2 thread1=new Daemon_Thread_Example2();
		Daemon_Thread_Example2 thread2=new Daemon_Thread_Example2();
		thread1.start();
		thread1.setDaemon(true);
		thread2.start();
	}

}
