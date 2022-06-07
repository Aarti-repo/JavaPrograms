
package Basic_programs;

import java.util.Arrays;
import java.util.Collections;

public class SortArray_alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] str ={"Mango", "Apple","Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
		
		Arrays.sort(str);
		
		System.out.println("Sorted array alphabetically:" + Arrays.toString(str));
		
		Arrays.sort(str, Collections.reverseOrder());
		
		System.out.println("reverse order string alphabetically" + Arrays.toString(str));
	}

}
