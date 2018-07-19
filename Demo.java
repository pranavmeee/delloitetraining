
import java.lang.String;
import java.lang.System;

public class Demo {
	int b=0;
	public int getP() {
		return b;
	}
	public void setP(int p) {
		this.b = p;
	}
	public void disp(int p,int m) {
		System.out.println("Adding 2 num:"+p+m);
	}
	public void disp() {
		System.out.println("no additioin");
	}
	public void disp(int...num) {
		for (int i:num)
			System.out.println(i);
	}
	 public static void main(String[] args) 
	{
		 	Demo customer=new Demo();
		 	customer.disp(1,2);
	}
	 
}