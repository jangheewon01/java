package ex1028;

public class Ex06_형변환 {
	              // 연산결과를 다른 타입으로 출력하고 싶을 때

	public static void main(String[] args) {
		
		// int는 4byte, double은 8byte
		
		// 자동 형변환, 묵시적 형 변환 (아무것도 하지 않아도 암묵적으로 바꾸어 준다.)
		int num = 5;
		System.out.println(num);
		
		double num2 = num; // =(double)num;으로 써도 되지만, 써주지 않아도 알아서 바뀌기 때문에 쓰지 않는다.
		System.out.println(num2);
		
		// 강제 형변환, 명시적 형 변환 (실수 형태를 정수 형태로 바꿀 때 명시를 해 주어야 하기 때문)
		
		double num3 = 5.3;
		System.out.println(num3);
		
		int num4 = (int)num3; // Ex05_자료형 참고 // 수행하는 행동 : 소수점은 그냥 버리기
		System.out.println(num4);
		
		
		
		
		
		

	}

}
