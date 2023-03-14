package 추상클래스;

public class 자동차Main {

	public static void main(String[] args) {
		
		// 휘발유로 자동차가 달립니다
		휘발유자동차 c1 = new 휘발유자동차();
		c1.run();
		c1.name = "스포티지";
		c1.print();
		
		// 수소 자동차를 만들어서
		// 이름을 붙여준 다음에
		// run, print를 실행시켜주세요 !
		
		수소자동차 c2 = new 수소자동차();
		c2.run();
		c2.name = "넥소";
		c2.print();
		
		// 추상 클래스는 기본적으로 객체 생성이 불가능하다 !
		// 왜 ? --> 추상클래스는 구현하지 않은 부분도 있을 수 있기 때문에(ex. 추상메소드)
		// 자동차 c3 = new 자동차(); : 오류
		자동차 c3 = new 자동차() {
			
			@Override
			public void run() {
				
			}
		};

	}

}
