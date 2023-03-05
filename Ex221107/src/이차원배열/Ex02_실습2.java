package 이차원배열;

public class Ex02_실습2 {

	public static void main(String[] args) {
		
		// 학생 3명의 국, 영, 수, 사, 과 점수를 저장하고 출력하기
		int[][] scores = { {50, 15, 80, 10, 45} , {70, 44, 12, 86, 34} , {80, 11, 44, 85, 56} };
		
		// 점수 -> 변수
		// 여러 과목의 점수 -> 일차원배열
		// 여러 학생의 과목 점수 -> 이차원배열
		
		// 학생들의 모든 점수 출력
		// 0번 학생 ~ 2번 학생
		// - 0번 학생 -> 0번 과목 ~ 4번 과목
		// - 1번 학생 -> 0번 과목 ~ 4번 과목
		// - 2번 학생 -> 0번 과목 ~ 4번 과목
		
		
		
		for(int b = 0; b < scores.length; b++) {
			
			int sum = 0;
			System.out.print(b + "번 학생 : ");
			
		for(int i = 0; i < scores[b].length; i++) {
			
			System.out.print(scores[b][i] + " ");
			sum += scores[b][i];
			
		}
		System.out.println();
		System.out.println("평균 : " + (sum / scores[b].length));
		
		}
		
		
		//System.out.print("1번 학생 : ");
		//for(int a = 0; a < scores[1].length; a++) {
		//	System.out.print(scores[1][a] + " ");
		//}
	} 
	

}
