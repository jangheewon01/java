package 이차원배열;

public class Ex05_실습5 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		int cnt = 1;
		
		for(int k = 0; k < array.length; k++) {
			for(int i = 0; i < array[k].length; i++) {
				array[k][i] = cnt++;
		}
		
		}

		
		for(int k = 0; k < array.length; k++) {
			for(int i = 0; i < array[k].length; i++) {
				
				
				System.out.print(array[k][4-i] + 20 + "	");
			}
			System.out.println();
			}
	}

}
