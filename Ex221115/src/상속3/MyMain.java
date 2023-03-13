package 상속3;

public class MyMain {

	public static void main(String[] args) {
		
		// 파이리 인형
		// 꼬부기 인형
		// 피카츄 인형을 머신을 통해 뽑아주세요 !!
		
		Machine m = new Machine();
		// 파이리 인형을 뽑겠습니다
		Piri p1 = new Piri();
		m.pickPokect(p1);
		
		// 꼬부기 인형을 뽑겠습니다
		Kkobuck p2 = new Kkobuck(); // p2는 자식 클래스 객체 p1, 2, 3, 4는 모두 Machine클래스의 pokect으로 간다.
		                            // 하위 클래스에서 자동으로 상위 클래스로 업캐스팅
		m.pickPokect(p2);
		
		// 피카츄 인형을 뽑겠습니다
		Pika p3 = new Pika();
		m.pickPokect(p3);
		
		Meta p4 = new Meta();
		m.pickPokect(p4);
		

	}

}
