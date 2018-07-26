package iodemos;
import java.io.*;

public class Demo2 {
	
	public static void main(String[] args)  throws IOException {
		File file= new File("B.txt");
		FileWriter writer = new FileWriter(file);
		writer.write("YOU ARE WORKING HERE");
		writer.close();
		}

	
	public static void main1(String[] args) throws IOException {
		File file = new File ("c:\\mydata\\B.txt");
		FileReader reader = new FileReader(file);
		int i;
		while ((i=reader.read())!=-1) {
			System.out.println((char)i);
		}
		reader.close();
		}
	}

