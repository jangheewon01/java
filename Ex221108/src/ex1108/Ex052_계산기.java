package ex1108;

import java.util.Scanner;

public class Ex052_계산기 {

	public static void main(String[] args) {
		
		// 사용자로부터 숫자 2개, 연산자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+, -, *, /) >> ");
		String op = sc.next();
		
		System.out.println(cal(num1, num2, op));
		

}
	
	public static int cal(int num1, int num2, String op) {
		
		int result = 0;
		if(op.equals("+")) {
			result = num1 + num2;
		}else if(op.equals("-")) {
			result = num1 - num2;
		}else if(op.equals("*")) {
			result = num1 * num2;
		}else if(op.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}
}