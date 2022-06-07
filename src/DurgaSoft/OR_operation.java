package DurgaSoft;




public class OR_operation {

	public static void main(String[] args) {
		
		boolean b1 = true;
		if(f1(true) || b1==true) {
			System.out.println("C");
		}

	}

	
	public static boolean f1(boolean cond) {
		if(cond== true){
			System.out.println("A");
		}
		
		System.out.println("B");
		
		return true;
	}
}
