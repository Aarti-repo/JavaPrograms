package DurgaSoft;

abstract class Vehicle{
	
	public abstract int getNoWheels();           // use of this abstract method declaration is 
}
	
 class Auto extends Vehicle{
	
	public int getNoWheels()
	{
		return 3;
	}
 }	
class Bus extends Vehicle{
	
	public int getNoWheels() {
		return 4;
	}
}
 
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //  Vehicle v1 = new Vehicle();
		
		Auto a1 = new Auto();
		
		System.out.println(a1.getNoWheels());
		
		Bus b1 = new Bus();
		System.out.println(b1.getNoWheels());
		
		
	}
}
 	
