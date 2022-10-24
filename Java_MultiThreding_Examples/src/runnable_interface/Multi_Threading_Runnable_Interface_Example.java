package runnable_interface;

public class Multi_Threading_Runnable_Interface_Example implements Runnable {
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		Multi_Threading_Runnable_Interface_Example obj1=new Multi_Threading_Runnable_Interface_Example();
		Thread t1=new Thread(obj1);
		t1.start();
	}

}
