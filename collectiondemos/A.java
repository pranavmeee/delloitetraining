package collectiondemos;

class A {
	String password = "hello@123ritika";
public class ChangePassword {
		int passwordChangedDays = 10;
		public void display() {
			System.out.println(passwordChangedDays);
			System.out.println("Original password: " + password);
			password = "abc@123123899";
		}
	}
	public void changePwd() {
		ChangePassword p = new ChangePassword();
		p.display();
		System.out.println("Changed password:"+password);
	}

}

 class B{
	public static void main(String[] args) {
		A a= new A();
		a.changePwd();
		A.ChangePassword f =a.new ChangePassword();
		f.display();
	}
}
