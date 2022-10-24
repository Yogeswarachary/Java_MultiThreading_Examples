package extending_thread_class;

public class Using_ThreadClass_String_Example2{
	public static void main(String[] args) {
		//creating an object of the thread class using the constructor
		Thread t=new Thread("This is a Thread");
		
		//The start method moves the thread to active state
		t.start();
		
		//getting the thread name by invoking the getName() method
		String str=t.getName();
		System.out.println(str);
	}

}
