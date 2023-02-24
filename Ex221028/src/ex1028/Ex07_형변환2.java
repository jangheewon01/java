package ex1028;

public class Ex07_형변환2 {

	public static void main(String[] args) {
		
		byte num1 = 3; // -128 ~ 127 : 256 8000을 256으로 나누고 나머지 64 console : 64
															// 8000 / 256 = 31 ... 64
		int num2 = 8000;
		
		num1 = (byte)num2;
		System.out.println(num1);
		
		int num3 = 128;
		num1 = (byte)num3;
		System.out.println(num1);
		// 값이 양의 방향으로 넘어가는 형상 : Overflow
		// 사이클 형태로 시계 방향으로 숫자가 커지게 놓고 돌려보면 127 다음이 -128 console : -128
		
		int num4 = -129;
		num1 = (byte)num4;
		System.out.println(num1);
		// 값이 음의 방향으로 넘어가는 현상 : Underflow
		// -이기 때문에 사이클 형태로 시계 반대방향으로 돌려놓고 보면 -128 다음이 127 console : 127
		
		// short는 2byte 대략 -32000 ~ 32000
		int num5 = 30000;
		short num6 = 0;
		
		num6 = (short)num5;
		// 범위 내에 있다고 하더라도 들어있는 값과는 상관없음, 자료형이 일치해야 함 -> 명시적 형 변환
		
		
		
		
		
		
		
		
		
		

	}

}
