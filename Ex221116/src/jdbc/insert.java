package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자 화면
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NAME : ");
		String name = sc.next();
		
		// JDBC 연결순서(4단계)
				// 선행작업 필요 : ojdbc6.jar -> 프로젝트에 라이브러리로 추가
				// 프로젝트 우클릭 -> build path -> configure build path
				
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			// 1. JDBC 동적로딩
			// 동적로딩을 위한 메소드 사용
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB랑 연결
			// DB에 접근 할 때 -> 변수를 사용해서 url, id, pw를 전송
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // = @localhost
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			if(conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			
			// 3. sql문 작성 및 전송
			String sql = "insert into member values(?, ?, ?)";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			
			// CRUD : Create(생성), Read(읽기, 조회), Update(갱신, 수정), Delete(삭제)
			// insert, update, delete : excuteUpdate()
			// select : excuteQuery()
			int cnt = psmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("회원가입 성공 !");
			} else {
				System.out.println("회원가입 실패 !");
			}
			
			

			
		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패 ~");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패 ~");
		} finally {
			// 4. 통로 닫아주기(종료)
			
			
				try {
					if(psmt != null) {
					psmt.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		
		
	}


