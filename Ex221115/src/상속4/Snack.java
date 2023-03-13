package 상속4;

public abstract class Snack {
	
	// 추상 메소드를 가지기 위해서는 반드시 클래스가 추상클래스여야 한다 그렇기 때문에 위에 abstract를 써준 것
	
	// abstract : 추상 -> 구현되어있지 않고 선언만 되어있는 것 !!
	
		//public void eat() {
			
			// eat 메소드에 강제성 부여 !
			// 추상메소드 : 내용이 구현되어있지 않은 메소드
			// 자식한테 구현할 수 있도록 강제성 부여 !
			public abstract void eat();
		//	System.out.println("과자를 먹습니다");
	//	}


	}

