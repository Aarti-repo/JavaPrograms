package Basic_programs;



public class Rotational_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "aarti";
		String s2 = "sdfsfgfdhfhfh";
		
		String s3;
	//	System.out.println("Enter String: " + s2);
		
		s3 = s1 + s1;
		
		System.out.println(s3);
		
		
		if(s3.contains(s2)) {
			
			System.out.println("rotational String");
		}
		
		else
		{
			System.out.println("Not");
		}
		
/*************************************************************************************/		
	
//		String s1 = "aarti";
//		String s2 = "rtiaa";
//
//		if(s1.equals(s2))
//		{
//			System.out.println("equal");
//		}
//		for(int i=0; i<s1.length()-1;i++)
//		{
//			for(int j=0; j<s2.length()-1;j++)
//			{
//
//				if(s2.charAt(j)!=s1.charAt(i) && s2.charAt(j) == s1.charAt(i+1))
//				{
//
//					System.out.println("rotational");
//				}
//				else
//				{
//					System.out.println("Not");
//				}
//
//			}
//		}
	}

}
