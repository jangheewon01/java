package ex1104;

import java.util.Scanner;

public class Ex01_실습 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int[] array = new int[5];
		// 점수 5개 입력받아서 배열에 넣기
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(i+1 + "번째 입력 : ");
			array[i] = sc.nextInt();
			
		}
			
		// 입력된 점수 모두 출력
		System.out.print("입력된 점수 : ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// 최고점수 출력
		int max = array[0];
		
		System.out.print("최고 점수 : ");
		for(int i = 0; i < array.length; i++) {
			
			if(max < array[i]) {
				max = array[i];
			}
		}System.out.println(max);
		
		// 최저점수 출력
		int min = array[0];
		
		System.out.print("최저 점수 : ");
		for(int i = 0; i < array.length; i++) {
			
			if(min > array[i]) {
				min = array[i];
			}
		}System.out.println(min);
		
		// 점수총합 출력
		int sum = 0;
		
		System.out.print("점수 총합 : ");
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			
		} System.out.println(sum);
		// 평균점수 출력
		System.out.print("점수 평균 : ");
		
		System.out.println(sum / array.length);
			}

}
