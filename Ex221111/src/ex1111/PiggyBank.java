package ex1111;

public class PiggyBank {
	
	// 저금통 클래스
	
	// 필드
	int money; // (public) int money; public이 생략되어 있으므로 어느 필드에서나 사용할 수 있다.
	
	// 메소드
	
	// 1. 저금하는 메소드
	// 사용자가 입금할 돈을 입력하면(매개변수) 현재자산(money)에 추가하는 기능
	public void deposit(int input) {
		money+= input;
	}
	                                                                 	// 1, 2는 저장하는 기능
	// 2. 출금하는 메소드
	// 사용자가 출금할 돈을 입력하면(매개변수) 현재자산(money)에서 출금하는 기능
	public void withdraw(int output) {
		money -= output;
	}
	
	// 3. 잔액을 보여주는 메소드
	// 현재 재산을 출력하는 메소드                                           // 3은 출력하는 기능
	public void showMoney() {
		System.out.println("현재 잔액 " + money);
	}
	
	
}
