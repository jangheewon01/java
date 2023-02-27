import java.util.Scanner;

public class Ex04_산술연산자4 {

	public static void main(String[] args) {
		
		// Scanner는 딱 한번만 불러오면 된다 !
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int b = sc.nextInt();
		
		System.out.println("두 수의 더하기 : " + (a + b));
		System.out.println("두 수의 빼기 : " + (a - b));
		System.out.println("두 수의 곱하기 : " + (a * b));
		System.out.println("두 수의 나누기(몫) :" + (a / b));
		

	}

}
