package ex1111;

public class Student {
	
	// 필드
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;
	
	
	// 생성자 메소드
	// this : 자기 자신의 객체, 현재 실행되는 메소드가 속한 객체
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	

	
	// 출력문만 가지고 있으면 되기 때문에 return타입은 없어도 된다.
	// 다른 class에서 접근할 수 있도록 하기 위해 public
	public void show() {
		System.out.println(name + "님 안녕하세요.");  // /n, %n은 Enter역할을 한다.
	    System.out.println("[" + number + ", " + age + "살]");
	    System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
	    System.out.println(name + "님의 Web점수는 " + scoreWeb + "점 입니다.");
	    System.out.println(name + "님의 Android점수는 " + scoreAndroid + "점 입니다.");
	    System.out.println("====================================");
	}

	

}
