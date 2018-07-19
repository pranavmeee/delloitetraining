
public class Hello {
	public void display() {
		System.out.println("hi");
	}
	public void accept() {
		System.out.println("accept");
		Hello ob=new Hello();
		ob.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h = new Hello();
		h.display();
		System.out.println("hello and welcome to java");
		h.display();
		h.accept();
		//Employee e=new Employee();
		//e.getDetails();
		System.out.println("End");
      
	}

}

