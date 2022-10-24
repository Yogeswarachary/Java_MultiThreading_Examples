package extending_thread_class;

public class Starting_Thread2Times extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		Starting_Thread2Times obj1=new Starting_Thread2Times();
		obj1.start();
		obj1.start();
	}

}
