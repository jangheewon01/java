package 이차원배열;

public class Ex03_실습3 {

	public static void main(String[] args) {
		
		// 5행 5열의 이차원배열 생성
		int[][] array = new int[5][5];
		
		
		int cnt = 1;
		for(int k = 0; k < array.length; k++) {
		for(int i = 0; i < array[k].length; i++ ) {
			array[k][i] = cnt++;
			
			System.out.print(array[k][i] + "\t");
		}
		System.out.println();
		}
		
		// 0번 행
		//array[0][0] = 1;
		//array[0][1] = 2;
		//array[0][2] = 3;
		//array[0][3] = 4;
		//array[0][4] = 5;
		
		// 1번 행
		//array[1][0] = 6;
		//array[1][1] = 7;
		//array[1][2] = 8;
		//array[1][3] = 9;
		//array[1][4] = 10;

	}

}
