package ex1103;

public class Ex03_실습 {

	public static void main(String[] args) {
		
		// 선언
		String[] arrStr;
		
		// 생성
		arrStr = new String[10];
		
		// 초기화
		arrStr[0] = "JAVA";
		arrStr[1] = "HTML";
		arrStr[2] = "DB";
		arrStr[3] = "PYTHON";
		arrStr[4] = "CSS";
		
		// 출력
		for(int i = 0; i < arrStr.length; i++) {
			System.out.print(arrStr[i] + " ");
		}

	}

}
