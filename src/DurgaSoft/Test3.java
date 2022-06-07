package DurgaSoft;


class A{
	
	protected void m1() {
		System.out.println("A");
	}
}


public class Test3 extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.m1();
		Test3 t = new Test3();
		t.m1();
		A a1 = new Test3();
		a1.m1();
	
	}

}
