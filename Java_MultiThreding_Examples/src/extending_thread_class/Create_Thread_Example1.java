package extending_thread_class;

public class Create_Thread_Example1 extends Thread {
	public void method1() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		Create_Thread_Example1 t1= new Create_Thread_Example1();
		
		//running the thread using start()
		t1.start();
	}
	
}
