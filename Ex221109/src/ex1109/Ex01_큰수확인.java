package ex1109;

import java.util.Scanner;

public class Ex01_큰수확인 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = lagreNumbers(num1, num2);
		
		System.out.println("큰 수 확인 : " + result);

	}
	
	public static int lagreNumbers(int a, int b) {
		int result = 0;
		if(a > b) {
			result = a;	
		} else if(a < b) {
			result = b;	
		}
		
		return result;
	}
	
	
	

}
