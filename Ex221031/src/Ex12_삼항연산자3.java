import java.util.Scanner;

public class Ex12_삼항연산자3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		
		System.out.print("두 수의 차 : ");
		System.out.println(a > b ? a - b : b - a);
		
		

	}

}
