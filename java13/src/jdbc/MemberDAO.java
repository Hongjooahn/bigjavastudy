package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class MemberDAO {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String passwd;

	// 멤버

	public MemberDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); // 도메인 네임 거꾸로 , 파일을 읽어오는 것 이기 때문에 .. 에러처리가 필수

		url = "jdbc:mysql://localhost:3306/bigjavahello";
		user = "root";
		passwd = "1234";
		con = DriverManager.getConnection(url, user, passwd);

	}

	public void insert(MemberDTO dto) throws Exception { // C- 생성

		String sql = "insert into member values(?,?,?,?)"; // 따옴표 없이

		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel()); // sql의 ? 값에 넣어줌

		ps.executeUpdate();
	}
	public String[] select(String id) throws Exception {
		
		String sql = "select * from member where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		rs=ps.executeQuery();
		String[] mem = null;
		
		if(rs.next()) {
			mem = new String[4];
			String s1 = rs.getString(1); 
			String s2 = rs.getString(2); 
			String s3 = rs.getString(3); 
			String s4 = rs.getString(4); 
//			System.out.print("검색된 ID : "+s1);
//			System.out.print("검색된 PW : "+s2);
//			System.out.print("검색된 NAME : "+s3);
//			System.out.print("검색된 TEL : "+s4);
			mem[0] = s1;
			mem[1] = s2;
			mem[2] = s3;
			mem[3] = s4;
		}
		else {
			System.out.println("검색 결과가 없습니다.");
		}
		return mem;
	}

	public void update(String change, String changed) throws Exception { // U- 업데이트
		//앞에 change는 바뀌는 값 뒤에 changed는 누구를 바꿀것인가
		String sql = "update member set tel=? where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, change);
		ps.setString(2, changed);
		
		ps.executeUpdate();
	 	
	}

	public void delete(String del) throws Exception { // D- 삭제
		String sql = "delete from member where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, del);
		
		ps.executeUpdate();

	}

}
