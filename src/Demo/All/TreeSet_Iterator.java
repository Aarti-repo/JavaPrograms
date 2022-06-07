package Demo.All;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class TreeSet_Iterator {

	public static void main(String[] Args) {
		
	
	TreeSet<String> map = new TreeSet();          // TreeSet add elements using add methid
	
	    map.add("one");
	    map.add("two");
	    map.add("three");
	    map.add("one");              // Duplicate value will not add & print
	    map.add("four");
	
	Iterator i = map.iterator();
	
	while(i.hasNext())
		System.out.println(i.next() + "");                // It will print element in alphabetical ascending order
		
	}	
}
