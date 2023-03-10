package ex1111;

public class PiggyBankMain {

	public static void main(String[] args) {
		
		// 저금통 설계도 불러오기
		PiggyBank pig1 = new PiggyBank();
		
		pig1.deposit(1500);
		pig1.showMoney();
		pig1.deposit(700);
		pig1.showMoney();
		pig1.withdraw(500);
		pig1.showMoney();

	}

}
