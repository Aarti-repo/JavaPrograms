package Basic_programs;

import java.util.Arrays;
import java.util.Collections;

public class SortArray_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer[] arr = new Integer[] {10,40,20,80,30,-50,4,15};
		
//		Arrays.sort(arr);
		
		System.out.println("Sorted array"+ Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Reverse order :"+Arrays.toString(arr));
	}

}
