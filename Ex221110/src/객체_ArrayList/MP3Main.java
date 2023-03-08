package 객체_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MP3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();
		
	      MP3 music1 = new MP3("2002", "Anne Marie", ".\\music\\Anne Marie - 2002.mp3"); 
	      MP3 music2 = new MP3("깡", "Rain", ".\\music\\Rain - 깡.mp3"); 
	      MP3 music3 = new MP3("bad guy", "Billie Eilish", ".\\music\\Billie Eilish - bad guy.mp3");
		
		ArrayList<MP3> m1 = new ArrayList<MP3>();
		
		m1.add(music1);
		m1.add(music2);
		m1.add(music3);
		
		int index = 0;
		while(true) {
			
			System.out.print("[1]재생  [2]정지  [3]이전곡  [4]다음곡  [5]종료 >>");
	         int menu = sc.nextInt();
	         
	         if(menu == 1) {
	        	 // 재생
	        	 // 제목 - 가수
	        	 String title = m1.get(index).getTitle();
	        	 String singer = m1.get(index).getSinger();
	        	 String path = m1.get(index).getPath();
	        	 
	        	 System.out.printf("%s - %s%n",title, singer);
	        	 
	        	 mp3.play(path);
	        	 
	         } else if(menu == 2) {
	        	 // 정지
	        	 if(mp3.isPlaying() == true) {
	        		 mp3.stop();
	        	 }
	        	 
	         } else if(menu == 3) {
	        	 // 이전곡
	        	 if(mp3.isPlaying() == true) {
	        		 mp3.stop();
	        	 }
	        	 
	        	 index--;
	        	 if(index < 0) {
	        		 index = m1.size()-1;
	        	 }
	        	 
	        	 String title = m1.get(index).getTitle();
	        	 String singer = m1.get(index).getSinger();
	        	 String path = m1.get(index).getPath();
	        	 
	        	 System.out.printf("%s - %s%n", title, singer);
	        	 
	        	 mp3.play(path);
	         } else if(menu == 4) {
	        	 // 다음곡
	        	 if(mp3.isPlaying() == true) {
	        		 mp3.stop();
	        	 }
	        	 index++;
	        	 
	        	 if(index >= m1.size()) { // >= 대신 == 도 가능
	        		 
	        	 }
	        	 
	        	 String title = m1.get(index).getTitle();
	        	 String singer = m1.get(index).getSinger();
	        	 String path = m1.get(index).getPath();
	        	 
	        	 System.out.printf("%s - %s%n", title, singer);
	        	 
	        	 mp3.play(path);
	        	 
	         } else if(menu == 5) {
	        	 // 종료
	        	 mp3.stop();
	        	 System.out.println("프로그램 종료");
	        	 break;
	         } else {
	        	 System.out.println("다시 입력해 주세요.");
	         }
		}
		
		
		
		
		

	}

}
