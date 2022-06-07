package Demo.All;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection_Algos {

	
	public static void main(String[] args) {

         LinkedList<Integer> list = new LinkedList<Integer>();
         
      list.add(new Integer(2));
      list.add(new Integer(8));
      list.add(new Integer(5));
      list.add(new Integer(1));
      
   Iterator i = list.iterator();
      
      Collections.reverse(list);
      
      System.out.println(list);
      
      Collections.shuffle(list);
      System.out.println(list);
      
      
      while(i.hasNext())
    	  System.out.println(i.next()+ "");             //  consider iterator next method alway start with 0 index
         
		
	}

}
