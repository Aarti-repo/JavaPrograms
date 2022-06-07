package Collections;

import java.util.ArrayList;

public class ArrayList_demo {

	public static void main(String[] args) {
		
		ArrayList i = new ArrayList();
		
//		i.add(10);
//		i.add("A");
//		i.add('B');
//		i.add(null);
//		i.add(10);
//		i.add("*");
//		
//		System.out.println(i);
		
		i.remove(1);
	//	i.remove(10);
		System.out.println(i);

		i.add(2,"M");
		i.add('N');
		
		System.out.println(i);
	}

}
