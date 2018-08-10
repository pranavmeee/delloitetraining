package exceptiondemos;

public class Demo2 {
	String name;
	public void display() {
		try {
		System.out.println("I AM");
		System.out.println("The length is:" + name.length());
	}
	catch (Exception e){
		System.out.println("Null");
	}
	System.out.println("Method ends");
	}
	
	public static void main(String[] args) {
		System.out.println("hi");
		Demo2 d=new Demo2();
		d.display();
		System.out.println("Hello");
	}
	}


