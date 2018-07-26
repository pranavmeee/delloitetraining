package collectiondemos;
import java.util.*;
//import java.util.Set;
//import java.util.TreeMap;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class MapDemo {
	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap();
		
		tm.put("John Doe", new Double(3434.34));
		tm.put("J", new Double(34.34));
		tm.put(" Doe", new Double(344.34));
		tm.put("John", new Double(3434.3));
		
		Set<Entry<String,Double>> set = tm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		double balance = ((Double)tm.get("John Doe")).doubleValue();
		tm.put("John Doe", new Double(balance+1000));
		System.out.println("John Doe's new balance:" + tm.get("John Doe"));
		}
	
	
	}


