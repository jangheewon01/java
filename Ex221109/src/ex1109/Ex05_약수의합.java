package ex1109;

import java.util.Scanner;

public class Ex05_약수의합 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = getSum(num);
		
		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(num);

	}
	
	public static int getSum(int num) {
		
		int result = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				result += i;
			}
		}
		return result;
	}
	
	 public static void getDivisor(int num) {
		 System.out.print(num + "의 약수 : ");
		
		 for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					System.out.print(i + " ");
					
				}
			
				}
		
		 
	 }
}
