package DurgaSoft;


class ABC{
	
	public void M1() {
		System.out.println("Class A Method");
	}
	
	public void M2() {
		System.out.println("Class A M2 Method");
	}
}

class c extends ABC{
	
}

class B extends c{
	
	public void M2() {
		System.out.println("Class B  M2 method");
	}
	
}

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b1 = new B();
		
		b1.M1();
		b1.M2();
		
		ABC a1 = new ABC();
		a1.M1();
		a1.M2();
		
		ABC a2 = new B();
		a2.M1();
		a2.M2();
		
	//	B b2 = new ABC();
	}

}
