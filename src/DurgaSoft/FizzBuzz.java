package DurgaSoft;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int input = 15;
		
		if(input% 3 == 0)
		{
			System.out.println("fizz");
		}
		else if(input % 5 ==0) {
			System.out.println("Buzz");
		}
		else if(input % 3==0 && input%5 ==0) {
			System.out.println("FizzBuzz");
		}
		else
		{
			System.out.println("neither");
		}
	}

}
