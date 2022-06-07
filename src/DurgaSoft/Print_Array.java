package DurgaSoft;

public class Print_Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int i=0;
		
		while(i<a.length){
			if(a[i] >3) {
				
			break;
			}
          i++;
          System.out.println("" +a[i]);
        }
		System.out.println("" +a[i]);
	}

}
