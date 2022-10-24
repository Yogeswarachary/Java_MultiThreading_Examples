package extending_thread_class;

public class Negitive_Time_Sleep {
	public static void main(String[] args) {
		//we can also use throws keyword followed by exception name for throwing the exception
		try {
			for(int j=0;j<5;j++) {
				//this throws the illegalArgument Exception
				//as the time is negitive which is -100
				Thread.sleep(j);
				//displaying the variable value
				System.out.println(j);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
