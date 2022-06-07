package Collections;

import java.util.*;

public class list_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		List<datatype> l1 = new ArrayList();
//		List<datatype> l2 = new LinkedList();
//		List<datatype> l3 = new Vector();
//		List<datatype> l4 = new Stack();
	

 //********************************************************************
		
		ArrayList<String> l1 = new ArrayList();
		l1.add("Aarti");
		l1.add("Avinash");
		l1.add("Nalge");
		l1.add("Bharat");
		l1.add("aarti");
		l1.add("Avinash");
		l1.add("");
		
		System.out.println(l1);
		
		
		
	Iterator it = l1.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	//***************************************************************************
	
	LinkedList<Integer> l2 = new LinkedList();
	l2.add(2);
	l2.add(1);
	l2.add(8);
	l2.add(10);
	l2.add(10);
	
	System.out.println(l2);
	
	Iterator itr = l2.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	//***********************************************************************
	
	Vector<String> v1 = new Vector<String>();
	
	v1.add("aarti");
	v1.add("avi");
	v1.add("12");
	v1.add("aarti");
	
	System.out.println(v1);
	
	Iterator i1 = v1.iterator();
	
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
	//******************************************************************
	
	Stack<String> s1 = new Stack();
	
	s1.push("aarti");
	s1.push("ppuja");
	s1.push("avinash");
	s1.push("aarti");
	s1.push("om");
	
	System.out.println(s1);
	s1.pop();
	s1.pop();
	
	System.out.println(s1);
	}

}
