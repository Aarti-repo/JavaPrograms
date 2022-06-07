package Demo.All;


import DurgaSoft.Test3;

public class Test_protected extends Test3 {

	public static void main(String[] args) {
		
		Test_protected p1 = new Test_protected();  // correct way to call protected
		p1.m1();
		
		A a = new A();                // cant call 
	//	a.m1();                          // cant call
		Test3 t = new Test3();
	//	t.m1();                       // cant call
	//	A a1 = new Test3();
	//	a1.m1();               // cant call
	}
}
