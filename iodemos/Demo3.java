package iodemos;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		//File file=new File ("C:\\Batch\\data.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("your name:");
		String name = br.readLine();
	
		System.out.println("Quantity is:");
		int quan = Integer.parseInt(br.readLine());
		System.out.println("Price is:");
		int price= Integer.parseInt(br.readLine());
		FileOutputStream writer = new FileOutputStream("myrec.txt");
		BufferedOutputStream bs = new BufferedOutputStream(writer);
		DataOutputStream ds = new DataOutputStream(bs);
		
		ds.writeUTF(name);
		ds.writeInt(quan);
		ds.writeInt(price);
		
		System.out.println("Bye");
		ds.close();
		bs.close();
		writer.close();
	
//BufferedWriter writer= new BufferedWriter(new FileWriter(file));
//writer.write(name);
//writer.write(price);
//writer.write(quan);
//System.out.println(name + ", your data is stored permanently");
//	writer.close();
}
}
