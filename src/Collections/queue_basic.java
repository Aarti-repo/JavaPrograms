package Collections;

import java.util.*;

public class queue_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> q1 = new PriorityQueue<String>();
		Queue<String> q2 = new ArrayDeque(); 
		
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("arti");
		pq.add("nalge");
		pq.add("avi");
		pq.add("avi");
		
		System.out.println(pq);
		
		System.out.println(pq.element()); // return and retrieve the head element of the queue, if queue empty throws nosuchelement exception
		System.out.println(pq.peek());    // return the head element of the queue if queue is empty it return null
		
		System.out.println(pq);
		
		System.out.println(pq.poll());   // it retrieve element and remove also and if queue is empty retun null
		System.out.println(pq.remove()); // it return eleemnt and remove also if queue is empty returns exception
		
		System.out.println(pq);
		
//*****************************************************************************
		
		ArrayDeque<String> ad = new ArrayDeque<String>();
		
		ad.add("zpa");
		ad.add("aarti");
		ad.add("puja");
		
		System.out.println(ad);
		
		
		
	}

}
