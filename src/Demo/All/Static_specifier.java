package Demo.All;


class access
{
	public int x;                                  // Public varible value will change every time when it called.
	static int y;                                 // static varible value will not chnge it will continue with previous value
	
	void cal(int a, int b)
	{
		x+=a;
		y+=b;
		
	}
}
public class Static_specifier{

	public static void main(String[] args) {
		
		access obj1 = new access();
		access obj2 = new access();
		
		obj1.x = 0;
		access.y = 0;
			
		
		obj1.cal(1, 2);
		
    	obj2.x=0;
		obj2.cal(2, 3);
		System.out.println(obj2.x + "" + obj2.y);

	}

}
