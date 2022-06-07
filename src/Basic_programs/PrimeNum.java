package Basic_programs;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=21 ; i<=300; i++)
		{
			if(i%2 == 0) {
				
				System.out.println("Not Prime");
			}
			
			else if(i ==1 || i==2) {
				System.out.println("Not Prime No");
			}
			
			else
			{
				System.out.println("Prime no:" + i);
			}
		}
		
	}

}
