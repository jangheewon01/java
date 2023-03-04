package ex1104;

import java.util.Scanner;

public class Ex02_실습2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] team = {"이주희", "이은비", "박수현", "나예호"};
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print(name + "님은 ");
		
		for(int i = 0; i < team.length ; i++) {
			if(name.equals(team[i])) {
				System.out.print(i);
				
			}
		}System.out.println("번 인덱스에 있습니다.");
		
		
		

	}

}
