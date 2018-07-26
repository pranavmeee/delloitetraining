package iodemos;
import java.util.*;

public class StringTokenDemo {
	public static void main(String[] args) {
		String value = "Sachit sometimes see here also";
		StringTokenizer tokenizer = new StringTokenizer(value,"z");
		System.out.println(tokenizer.countTokens());
	}

}
