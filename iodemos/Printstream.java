package iodemos;
import java.io.*;


public class Printstream {
	public static void main(String[] args) {
		PrintStream pout= new PrintStream(System.out);
		pout.println(1900);
		pout.println("Hello Java");
		pout.println("Ta-Ta");
		pout.close();
		
	}

}
