package 복습;

import java.util.Scanner;

public class 입출력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello~");
		
		System.out.print("이름 : ");
		// 변수 선언 및 초기화
		// 선언
		// 데이터 타입 변수명;
		String name;
		
		// 초기화
		name = sc.next();
		
		int num = 20;
		
		System.out.println(name); // 변수나 숫자는 "" 을 사용하지 않아도 된다.
	}

}
