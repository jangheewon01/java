package 이차원배열;

public class Ex04_실습4 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		int cnt = 1;
		
		// 입력부
		for(int k = 0; k < array.length; k++) {		
			for(int i = 0; i < array[k].length; i++) {
				array[k][i] = cnt++;
				}
				
		}
		
		// 출력부
		for(int k = 0; k < array.length; k++) {		
			for(int i = 0; i < array[k].length; i++) {
				System.out.print(array[i][k] + "\t");
				}
				System.out.println();
		}
		//array[0][1] = 26;
		//array[0][2] = 31;
		//array[0][3] = 36;
		//array[0][4] = 41;
		
		//array[1][0] = 22;
		//array[1][1] = 27;
		//array[1][2] = 32;
		//array[1][3] = 37;
		//array[1][4] = 42;

	}

}
