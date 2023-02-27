import java.util.Scanner;

public class Ex10_삼항연산자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 삼항연산자 : 간단한 조건식을 이용해서 식을 제어
		// 조건식 ? 조건식이 true일 때 실행문 : 조건식이 false일 때 실행문
		
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 > num2? true : false);

	}

}
