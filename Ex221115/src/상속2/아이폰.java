package 상속2;

public class 아이폰 extends 스마트폰 {
	
	public void camera() {
		System.out.println("화질");
	}
	
	// 오버라이딩(재정의)
//	@Override
	public void call() {
		System.out.println("특별");
	}

}
