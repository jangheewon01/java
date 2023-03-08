import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_Team출력 {

	public static void main(String[] args) {
		
		// ArrayList 생성
		// 변수명 = team // ArrayList는 import해야 한다.
		ArrayList<String> team = new ArrayList<String>();
		
		
		// Scanner를 이용해서 0번 인덱스부터 순서대로 값 넣기
		Scanner sc = new Scanner(System.in);
		String a;
		for(int i = 0; i < 5; i++) {
		System.out.print("이름을 입력하세요 : ");
		 a = sc.next();
		 team.add(a);
		} 
		// ArrayList에 들어있는 메소드를 사용해서 팀원들 출력
		System.out.print("연구개발팀의 팀원은 ");
		for(int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다.");
		
		// 팀원 탈퇴 시키기
		// 내가 입력한 이름이 있을 경우, 해당 이름 삭제하고 나머지 팀원 출력
		// 만약 없다면 전체 팀원 출력
		System.out.print("탈퇴 시킬 팀원 : ");
		String b = sc.next();
		
		for(int i = 0; i < team.size(); i++) {
			if(team.get(i).equals(b)) {				// get는 메소드이기 때문에 [] 대괄호가 아닌 () 소괄호를 넣어야 한다.
				team.remove(i); // = team.remove(b)
				
			}
			
		}
		for(int i = 0; i < team.size(); i++) {
		System.out.print(team.get(i) + " ");
		
		
		}
		
		
		
	}

}
