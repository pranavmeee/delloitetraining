import java.util.Scanner;
public class Calculator {
	double num1,num2;
	int o;
	
	public Calculator (double num1, double num2, int o) {
		this.num1=num1;
		this.num2=num2;
		this.o=o;
	}

	public void add(int num1, int num2) {
		System.out.println((num1+num2)); 
	}
	public void add(double num1, double num2) {
		System.out.println((num1+num2)); 
	}
	public void add(int num1, double num2) {
		System.out.println((num1+num2)); 
	}
	public void add(double num1, int num2) {
		System.out.println((num1+num2)); 
	}
	public void diff(int num1, int num2) {
		System.out.println((num1-num2)); 
	}
	public void diff(double num1, double num2) {
		System.out.println((num1-num2)); 
	}
	public void diff(int num1, double num2) {
		System.out.println((num1-num2)); 
	}
	public void diff(double num1, int num2) {
		System.out.println((num1-num2)); 
	}
	public void mul(int num1, int num2) {
		System.out.println((num1*num2)); 
	}
	public void mul(double num1, double num2) {
		System.out.println((num1*num2)); 
	}
	public void mul(int num1, double num2) {
		System.out.println((num1*num2)); 
	}
	public void mul(double num1, int num2) {
		System.out.println((num1*num2)); 
	}
	public void div(int num1, int num2) {
		System.out.println((num1/num2)); 
	}
	public void div(double num1, double num2) {
		System.out.println((num1/num2)); 
	}
	public void div(int num1, double num2) {
		System.out.println((num1/num2)); 
	}
	public void div(double num1, int num2) {
		System.out.println((num1/num2)); 
	}
	
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		
		System.out.println("Enter operation Add(1)/Subtract(2)/Multiply(3)/Divide(4)");
		Scanner in=new Scanner(System.in);
		int o=in.nextInt();
		
		Calculator c=new Calculator(num1,num2,o);
		switch(o) {
		case 1: c.add(num1, num2);break;
		case 2: c.diff(num1, num2);break;
		case 3: c.mul(num1, num2);break;
		case 4: if (num2>0) {
			c.div(num1, num2);break;
		}
		else
		{
			System.out.println("Enter a non-zero number");
		}
		}
	}
}
		

	
	
	
	
	
	