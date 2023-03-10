package ex1111;

import java.util.ArrayList;

public class ContactMain {

	public static void main(String[] args) {
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		// 객체생성
//		Contact c1 = new Contact("장희원", 20, "010-1234-5678");
		contacts.add(new Contact("장희원", 20, "010-1234-5678"));
		contacts.add(new Contact("이주희", 21, "010-1234-5679"));
		contacts.add(new Contact("강로운", 22, "010-1234-5677"));
		contacts.add(new Contact("임소완", 23, "010-1234-5676"));
		
		for(int i = 0; i < contacts.size(); i++) {
		String name = contacts.get(i).getName();
		int age = contacts.get(i).getAge();
		String tel = contacts.get(i).getTel();
		
		// 장희원(20) : 010-1234-5678
		
		System.out.printf(i+1 + ". %s(%d) : %s%n", name, age, tel);
		}
	}

}
