package ex1103;

public class Ex05_실습3 {

	public static void main(String[] args) {
		
		int[] intArray = {1, 8, 3, 4, 6};
		int max = intArray[0];
		
		System.out.print("가장 큰 수는 ");
		
		for(int i = 0; i < intArray.length; i++) {
			
			if(max < intArray[i]) {
				max = intArray[i];
				
			}
			
		} System.out.println(max + "입니다.");
	
		int[] intArray2 = {1, 8, 3, 4, 6};
		int min = intArray2[0];
		
		System.out.print("가장 작은 수는 ");
		
		for(int a = 0; a < intArray2.length; a++) {
			
			if(min > intArray2[a]) {
				min = intArray2[a];
			}
		} System.out.println(min + "입니다. ");
		
		
		
		
		
		

	}

}
