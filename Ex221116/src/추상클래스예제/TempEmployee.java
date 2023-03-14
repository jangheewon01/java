package 추상클래스예제;

public class TempEmployee extends Employee {
	
	// empno
	// name
	// pay
	
	public TempEmployee (String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	int 연봉;
	
	// 연봉 / 12 --> 월 급여
	
	// 월 급여를 반환해 주는 역할 !
	@Override
	public int getMoneyPay() {
		
		return pay / 12;
	}
	
	
	

}
