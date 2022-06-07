package Basic_programs;

public class Palimdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 545, r, sum=0;
		int temp = n;
		
		while(n>0) {
			
			r = n%10 ;
			
			sum = sum*10 + r;
			n = n/10;
			
			System.out.println("sum is" + sum);
			
		}
		
		if(temp == sum) {
			
			System.out.println("no. is palimdrome");
		}
		else {
			System.out.println("not palimdrome");
		}
	}

}
