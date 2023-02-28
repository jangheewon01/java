import java.util.Scanner;

public class Ex09_가위바위보switch {

	public static void main(String[] args) {
		
		// 가위바위보 프로그램 만들기
		
		Scanner sc = new Scanner(System.in);
		
		// user1, user2 이름 입력 받기
		System.out.print("USER1 : ");
		String user1 = sc.next();
		
		System.out.print("USER2 : ");
		String user2 = sc.next();
				
		// user1, user2가 낸 가위 바위 보 입력 받기
		System.out.print(user1 + "님 >>");
		String rsp1 = sc.next();
		System.out.print(user2 + "님 >>");
		String rsp2 = sc.next();
		
		// user1, user2가 낸 가위 바위 보를 순서대로 담기
		String rsp = rsp1 + rsp2;
		
		switch(rsp) {
		// 무승부일 경우
		case "바위바위":
		case "가위가위":
		case "보보":
			System.out.println("무승부!!");
			break;
		
		// user1이 승리할 경우
		case "바위가위":
		case "가위보":
		case "보바위":
			System.out.println(user1 + "님 승리!");
			break;
		
		// user2가 승리할 경우
		case "바위보":
		case "가위바위":
		case "보가위":
			System.out.println(user2 + "님 승리!");
		
		
		
		
		
		
		
		
		
		
		}
				
		
	}

}
