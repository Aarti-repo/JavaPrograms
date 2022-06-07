package Basic_programs;

import java.util.Arrays;

public class Sort_Array_Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]arr = new int[] {20,12,23,1,4,8,5, 56,-43};
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length;i++)
		System.out.println(arr[i]);
		
		System.out.println(Arrays.toString(arr));
		
	System.out.println("******************************************");	
		//without using sort() method
		
		
		int temp = 0;
		int[] arr1 = new int[] {10,21,1,5,2,-20,-10, 15,50};
		
		
		for(int i=0; i<arr1.length;i++) {
			for(int j= i+1 ; j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp = arr1[i];
					arr1[i]=arr[j];
					arr1[j]= arr[i];
				}
			}
			System.out.println("sorted elements:" + arr[i]);
		}
	}

}
