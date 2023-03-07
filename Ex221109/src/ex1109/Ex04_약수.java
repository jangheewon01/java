package ex1109;

import java.util.Scanner;

public class Ex04_약수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		

	}
	public static boolean isDivisor(int num1, int num2) {
		
		if(num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
		
		
	
	}

}
