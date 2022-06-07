package Basic_programs;

public class Demo123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String s1 = new String("post build");
	String s2 = new String("post build");
	String s3 = "post build";
	String s4 = "post build";
  final  String s5 = "post ";
	String s6 = s5 + "build";
	System.out.println(s1 == s2);//-----------output--------
	System.out.println(s1 == s3);//-----------output--------
	System.out.println(s3 == s4);//-----------output--------
	System.out.println(s6 == s3);//-----------output--------

	}

}

/****************************************
false
false
true
true */
