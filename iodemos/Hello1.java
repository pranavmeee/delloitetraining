package iodemos;

import java.util.Enumeration;
import java.util.Properties;

public class Hello1 {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration<Object> e = p.elements();
		while (e.hasMoreElements()) {
			System.out.println("The value is : "+e.nextElement());
		}
	}

}
