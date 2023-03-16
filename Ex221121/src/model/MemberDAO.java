package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	boolean result;
	
	String nick;
	
	public boolean login(String id, String pw) {
		connect();
		
	}

		try {
		String sql = "select id from mc_member where id = ? and pw = ?"
		
		
	} catch(ClassNotFoundException e) {
		System.out.println("동적 로딩 실패 !");
	} catch(SQLException e) {
		System.out.println("sql 문제 !");
	}
	
	
}
	


