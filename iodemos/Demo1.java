package iodemos;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");
		RandomAccessFile ra = new RandomAccessFile(f,"rw");
		ra.writeUTF("Hello how are u today");
		ra.seek(0);// throws IOException;
		String n = ra.readUTF();
		ra.close();
		
	}

}
