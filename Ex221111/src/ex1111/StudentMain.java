package ex1111;

public class StudentMain {

	public static void main(String[] args) {
		
		// Student 설계도 불러오기
		// 객체 생성하기
		// Student stu1 = new Student();
		Student student1 = new Student("홍길동", "20220614", 20, 60, 80, 55);
		Student student2 = new Student("이주희", "19961025", 27, 55, 36, 85);
		
		// 객체 생성하기
		// stu1.name = "홍길동";
		// stu1.number = "20220614";
		// stu1.age = 20;
		// stu1.scoreJava = 60;
		// stu1.scoreWeb = 80;
		// stu1.scoreAndroid = 55;
		
		// show() 메소드 호출
		student1.show();
		student2.show();
		// stu1.show();
		
		// Student stu2 = new Student();
		
		// stu2.name = "이주희";
		// stu2.number = "19961025";
		// stu2.age = 27;
		// stu2.scoreJava = 55;
		// stu2.scoreWeb = 36;
		// stu2.scoreAndroid = 85;
		// stu2.show();
	}

}
