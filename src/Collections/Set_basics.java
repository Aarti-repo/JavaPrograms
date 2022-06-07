package Collections;

import java.util.*;

public class Set_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> s1 = new HashSet();
		Set<Integer> s2 = new LinkedHashSet();
		Set<String> s3 = new TreeSet();
		
		
		s1.add("aarti");
		s1.add("nalge");
		s1.add("aarti");
		s1.add("zpa");
		s1.add("avi");
		
		System.out.println(s1);
		
//******************************************************************
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		ls.add("zpa");
		ls.add("aarti");
		ls.add("zpa");
		ls.add("avi");
		
		System.out.println(ls);
		
		
//******************************************************************
		
		SortedSet<String> ss = new TreeSet<String>();
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("zpa");
		ts.add("baba");
		ts.add("aarti");
		ts.add("zpa");
		ts.add("nlage");
		
		System.out.println(ts);
		
	}

}
