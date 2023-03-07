package ex1109;

import java.util.Scanner;

public class Ex06_완전수 {

	public static void main(String[] args) {
		
		// 완전수 : 약수를 나열했을 때 자기자신을 빼고 나머지의 합이 자기자신인 경우
		
		Scanner sc = new Scanner(System.in);
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
	}
	 
	public static void getPerfectNumber(int startValue, int endValue) {
	// return타입이 없으면 void	
		System.out.print(startValue + " ~ " + endValue + "까지의 완전수 : ");
		for(int i = 2; i <= 1000; i++) {
			
			int sum = 0;
			for(int k = 1; k < i; k++) {
				
				if(i % k == 0) {
					sum += k;
				}
			}
			
			
			if(sum == i) {
				
				System.out.print(i + " ");
			}
		}
		
		
		
	}
}
