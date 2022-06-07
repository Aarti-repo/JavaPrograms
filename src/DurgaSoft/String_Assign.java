package DurgaSoft;

public class String_Assign {

	public static void main(String[] args) {
		
//                 String s = "A";
//                 System.out.println(s);
//       //         String_Assign s1 = new String_Assign();
//      //          s1.f1(s);
//                 f1(s);                             // static method you can cll without object.
//                 System.out.println(s);
//	}
//
//	public static void f1(String s) {
//		s = "B";
//	//	System.out.println(s);
		
		
/************************************************/
		 String s = "A";
       System.out.println(s);
       f1("B"); 
       System.out.println(s);
		}
	public static void f1(String s) {
		 System.out.println(s);
		 f2("C");
		 System.out.println(s);
	}
	
	public static void f2(String s) {
		System.out.println(s);
	}
}
