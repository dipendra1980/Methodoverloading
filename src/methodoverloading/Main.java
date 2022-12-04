package methodoverloading;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Animal an = new Animal();
	
		an.run("Dipendra", 10);
		an.run();
		an.run("Dipsika");
		an.run(20);
		
		

	}

}
