package Demo.All;

public class duplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "aartiannalge";
		
		int count;
		char string[] = s1.toCharArray();
		int size = string.length;
		
		System.out.println("String is:"+ s1);
		for(int i=0; i<size; i++)
		{
			count = 1;
		 for(int j=i+1; j<size;j++)
		 {
			 
			 if(string[i]==string[j] && string[j]!=' ')
			 {
				 count++;
				 
			 }
			 
		 }
		 System.out.println(count);
		 
		 if(count>1)
				System.out.println("Duplicate characters:"+ string[i]);
			    
		}
		  
			}

}
