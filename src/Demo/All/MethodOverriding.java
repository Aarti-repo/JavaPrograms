package Demo.All;

class A{
	
	public void printName()
	{
		System.out.println("Value-A");
	}
	
	public int printName(int a) {
		
	return a;
	}
	
	public String printName(String a) {
		
		return a;
		}
}

class B extends A
{
	public void printName() {
		System.out.println("Value-B");
	}
}

class C extends A{
	
	public void printName() {
		System.out.println("Value-C");
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b= new B();
		C c = new C();
	//	b = c;              // 	Type mismatch: cannot convert from C to B

		newPrint(b);
	}
	
	public static void newPrint(A a) {
		a.printName();
	}

}
