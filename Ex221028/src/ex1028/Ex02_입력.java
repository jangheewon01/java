package ex1028;

import java.util.Scanner;

public class Ex02_입력 {

	public static void main(String[] args) {
		
		// 키보드를 통해(console창을 통해) 데이터를 입력!
		// Scanner
		
		// import : 외부에 있는 도구(라이브러리)를 사용하기 위해 설정
		// 문장 완성 후 Scanner 자리에 마우스 커서 놓고 Ctrl + Space -> 자동완성!!
		
		Scanner sc = new Scanner(System.in);
		
		// sc 안에있는 기능을 사용하겠다 -> .
		// 콘솔창에 우리가 입력한 정수를 받아오자!
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("입력한 정수 : " + num);

	}

}
