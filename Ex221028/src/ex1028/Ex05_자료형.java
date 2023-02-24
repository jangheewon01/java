package ex1028;

public class Ex05_자료형 {

	public static void main(String[] args) {
		
		// 1. 논리형
		// boolean : 1bit or 1byte (1과 0)
		// 참 혹은 거짓 (true of false)
		// 1byte = 8bit = 2^8 = 256가지의 경우의 수
		
		// 지금 더운 상태를 저장하는 변수
		boolean isHot = false; // true, 참 또는 거짓 두 가지 값만 가질 수 있다.
		System.out.println(isHot);
		
		// 2. 문자형 
		// char : 2byte = 2^16 = 65536가지의 경우의 수
		// -> 모든 유니코드 문자 표현 가능
		char grade = 'A';
		char num = '4'; // 이때의 4는 문자 취급
		char single = '\'';
		// char single = '\'; \t (탭기능) : 일정한 간격으로 \n = ln (println)(엔터기능)
		
		// 3. 정수형
		// byte (-128 ~ 127)
		byte age = 25;
		//short (2byte 대략 -30000 ~ 30000)
		short lunch = 5500;
		// int : 제일 많이 쓰이는 것
		int account = 2000000000;
		// long
		long microbe = 1000000000000L;
		// long 데이터 타입임을 알려주기 위해 맨 끝에 l(L)을 붙인다.
		// = (long)1000000000000;는 불가능
		// 붙이지 않으면 int형으로 인식한다.
		
		// 4. 실수형
		// float
		float height = 162.2f; // 또는 = (float)162.2; 도 가능
		// long과 같은 형태
		
		// double
		double a = 123.123;
		
		char A = '장';
		char B = '희';
		char C = '원';
		System.out.print(A);
		System.out.print(B);
		System.out.println(C);
		
		// 레퍼런스 타입 : 기본 데이터 타입 8개 이외의 타입
		// 자바 책 : 65p
		// 문자열을 담는 타입 -> String
		String name = "장희원";
		System.out.println("나의 이름은 " + name);
		// 문자 하나만 담는다고 해도 String 사용할 것이다 !
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
