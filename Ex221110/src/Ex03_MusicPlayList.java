
import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_MusicPlayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> ml = new ArrayList<String>();
		
		System.out.println("====Music Play List====");
		
		// 1, 2, 3, 4번 중에 4번을 누르면 while문 탈출
		
		
		while(true) {
			
			System.out.print("[1] 노래 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> ");
			int a = sc.nextInt();
			
			if(a == 1) {
				// 노래추가기능
				System.out.println("==========================================");
				System.out.print("[1] 원하는 위치에 추가 [2] 마지막 위치에 추가 >> ");
				int num = sc.nextInt();
				
				if(num == 1) {
					// 원하는 위치에 추가
					System.out.print("원하는 위치 입력 : ");
					int index = sc.nextInt();
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					
					ml.add(index-1, title);
					System.out.println("추가되었습니다~");
					
				} else if(num == 2) {
					// 마지막 위치에 추가
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					
					ml.add(title);
					System.out.println("추가되었습니다~");
					
				} else {
					System.out.println("잘못 입력하셨습니다!");
				}
			} else if(a == 2) {
				// 노래조회기능
				System.out.println("====== 현재 재생 목록 ======");
				if(ml.size() == 0) {
				System.out.println("재생 목록이 없습니다!");
				
				}else {
					for(int i = 0; i < ml.size(); i++) {
						System.out.println(i + 1 + ". " + ml.get(i));
					}
					
				}
			} else if(a == 3) {
				// 노래삭제기능
				System.out.println("===========================================");
				System.out.print("[1] 선택삭제 [2] 전체삭제 >> ");
				int num = sc.nextInt();
				
				if(num == 1) {
					// 선택삭제
					System.out.print("삭제할 번호 입력 : ");
					int index = sc.nextInt();
					ml.remove(index-1);
					System.out.println("삭제되었습니다~");
					
				} else if(num == 2) {
					// 전체삭제
					ml.clear();
					System.out.println("전체 삭제되었습니다~");
				} else {
					System.out.println("잘못 입력하셨습니다!");
				}
			} else if(a == 4) {
				// 종료
				System.out.println("프로그램을 종료합니다!");
				break;
			} else {
				System.out.println("다시 입력해주세요~");
			}
		}
		
		
		
		

	}

}
