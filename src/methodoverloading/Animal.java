package methodoverloading;

public class Animal {
	public void run( int b) {
		System.out.println("iam running");
	}
	public void run() {
		System.out.println("Tiger is running");
	}
	public void run(String a) {
		System.out.println("THis is third method");
	}
	public void run (String a , int b) {
		System.out.println("this is 4th method");
	}

}

