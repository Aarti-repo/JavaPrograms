package Basic_programs;

public class Pattern_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		for(int i = n; i>0 ; i--)
		{
			int j = i;
			
	    	while (j>0) {
				
			System.out.print("*");
			j--;
		}
			System.out.println();
			
		}
	}

}
