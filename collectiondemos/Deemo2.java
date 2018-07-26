package collectiondemos;
import java.util.*;
public class Deemo2 {
	public static void main(String[] args) {
		List <Integer> s = new LinkedList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s);
		//Iterator i = s.iterator();
		
	//	while (i.hasNext())
	//	{
			//System.out.println(i.next());
		//}
			System.out.println("2nd");
			s.add(2,12);
			System.out.println("3rd");
			s.remove(3);
			System.out.println(s);
		
	}

}
