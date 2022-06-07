package Demo.All;
import DurgaSoft.Test1;
import DurgaSoft.Abstract_Modifiers;
public class TestString {

	public static void main(String[] args) {
		
	//	Test1 t1 = new Test1();            // public class access outside the pkg
	//	Abstract_Modifiers m1 = new Abstract_Modifiers();
	//	m1.C();
			 
			 
		String s1 = "Aarti";
		String s2 = "Nalge";
		String s3 = "Aarti";
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		
		
		if(s1==s2){
			
			System.out.println("Matches");
		}
		else
		{
			System.out.println("Not Matches");
	
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	System.out.println(s1.equals(s2));
	
	//Object comparision
	

	System.out.println(s4==s5);
System.out.println(s4.equals(s5));
	
		
	System.out.print(s1=s2);                 //Assignment operator
	}

	}
}
