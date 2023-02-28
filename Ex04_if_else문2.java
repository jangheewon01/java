import java.util.Scanner;

public class Ex04_if_else문2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 일의자리에서 반올림한 값 출력하기
		// 반올림 : 0~4까지는 버림, 5~9까지는 올림
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("반올림한 수 : ");
		
		if(num % 10 <= 4) {
			System.out.println(num / 10 * 10);
			
		}else {
			System.out.println(num / 10 * 10 + 10);
			
		}

	}

}
