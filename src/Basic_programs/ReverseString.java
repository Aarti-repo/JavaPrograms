package Basic_programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Aarti";
		String s2 = "Nalge";
		
		String rev = " ";
		String rev1 = " ";
		
		for(int i =s1.length()-1; i>=0;i--) {
			
			rev = rev + s1.charAt(i);
		}
		System.out.println("First string :" +rev);
		
/*****************************************************************************/	
		
		char ch[] = s2.toCharArray();
		
		int size = ch.length;
		
		
		for(int i = size-1; i>=0; i--)
		{
			rev1 = rev1 + ch[i];
		}
		System.out.println("Sencond : " + rev1);
		
	}

}
