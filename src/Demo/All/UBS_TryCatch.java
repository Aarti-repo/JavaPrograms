package Demo.All;

public class UBS_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			badMethod();
			System.out.println("A");
		}
		catch(Exception ex)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("C");
		}
		System.out.println("D");
	}
		
		public static void badMethod() 
		{
			
		}
	}

