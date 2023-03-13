package 상속4;

public class MyMain {

	public static void main(String[] args) {
		
		Machine m = new Machine();
		
		SunChip s1 = new SunChip();
		m.eatSnack(s1);
		
		Honey s2 = new Honey();
		m.eatSnack(s2);
		
		YacheTime s3 = new YacheTime();
		m.eatSnack(s3);
		
		SwingChip sw = new SwingChip();
		m.eatSnack(sw);
		
		// 만약 먹는 과자가 야채타임이라면
		// ---> 야채타임으로부터 업캐스팅 된 객체라면 ! => instanceof
		// 케찹을 찍어 먹고 싶어요 !
		
//		if(sanck instanceof YacheTime) { // YacheTime 에서 업캐스팅 된 객체라면
			// 다운캐스팅을 해서
			// 하위클래스명 객체명 = (하위클래스명) 업캐스팅된 객체명
//			YacheTime ya = (YacheTime) snack;
		// 케찹 찍기
		// ya.ketchup();
		}
			
		

	}


