package iodemos;
import java.io.*;

public class Exercise1 {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Batch\\BatchMates.txt");
		File file2= new File("C:\\Batch");
		if (file.exists()) {
			file.delete();
			System.out.println("File Deleted");
		}
		else
		{
			boolean result = file2.mkdirs();
			if (result) {
				file.createNewFile();
				System.out.println("File created");
			}
			
			
		}
	
	}
	
}
	


	
	
	


