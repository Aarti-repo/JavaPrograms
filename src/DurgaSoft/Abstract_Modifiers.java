package DurgaSoft;

 public abstract  class Abstract_Modifiers {

	 abstract void A();
	public abstract  void B();
	public abstract  void D();
	public void C() {}
	
	public static void main(String[] args) 
	{
	//	 Abstract_Modifiers m1 = new Abstract_Modifiers();
	//	 m1.A();
	 }
 }
 
  abstract class test extends Abstract_Modifiers {
	
	 
	 public void A() {}
	// public void B() {}
	 public void D() {}
	
}
 
 
 
 

 