package ex1111;

public class PersonMain {

	public static void main(String[] args) {
		
		// Person 설계도 클래스를 이용해서 실제 사람(객체)이 만들어지는 클래스
		
		// 1. 사람(객체) 생성하기
		//int a = 5;
		//String b = "?";
				
		Person p1 = new Person(); // 데이터 타입은 Person //매개변수를 받지 않는 메소드
		Person p2 = new Person();
		Person p3 = new Person("박인성", 19, 500); // 매개변수를 3개 받는 메소드
		
		p1.name = "장희원";
		p1.age = 25;
		p1.height = 164;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		
		p1.name = "김희원";
		System.out.println(p1.name);
		p2.name = "이주희";
		p2.age = 20;
		p2.height = 165;
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		
		
		
		
		
		
		
		

	}

}
