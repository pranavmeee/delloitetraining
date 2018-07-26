package collectiondemos;
import java.util.*;

public class Deemo3 {
	public static void main(String[] args) {
		String str[]= {"Raju","Rohan","Uday","Tarun"};
		List<String> list=  Arrays.asList(str);
		List<String> pp=new ArrayList(); //convert array to list then copy all elements
		//to the new list. Then add the elements to the list
		pp.addAll(list);
		pp.add(3,"Ram");
		System.out.println(pp);
	}

}
