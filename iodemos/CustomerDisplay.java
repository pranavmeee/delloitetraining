package iodemos;
import java.io.*;
public class CustomerDisplay {
	public static void main(String[] args) throws IOException{
		Customer customer = new Customer (122, "Kiruthika","Nagerkoil",35);
		FileOutputStream stream = new FileOutputStream("customer.txt");
		BufferedOutputStream bs = new BufferedOutputStream(stream);
		ObjectOutputStream ot = new ObjectOutputStream(bs);
		ot.writeObject(customer);
		ot.close();
		System.out.println(customer.getCustomerName()+ " , your record saved");
		
	}

}
