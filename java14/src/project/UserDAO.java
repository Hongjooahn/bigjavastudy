package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO {
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String passwd;

	// 멤버

	public UserDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); // 도메인 네임 거꾸로 , 파일을 읽어오는 것 이기 때문에 .. 에러처리가 필수

		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		passwd = "1234";
		con = DriverManager.getConnection(url, user, passwd);

	}

	public void insert(UserDTO dto) throws Exception { // C- 생성

		String sql = "insert into user values(?,?,?,?,?,default,?)"; // 따옴표 없이

		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getUname());
		ps.setString(2, dto.getUid());
		ps.setString(3, dto.getPw());
		ps.setInt(4, dto.getUspec());
		ps.setString(5, dto.getUemail()); 
		ps.setString(6, dto.getUtheme()); 

		ps.executeUpdate();
	}

	public void update(String uname, String uid, String pw, int uspec, String uemail, String utheme, String uidchange) throws Exception { // U- 업데이트
		String sql = "update user set uname=?,uid=?,pw=?,uspec=?, uemail =?, ucash=?, utheme =?) where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, uname);
		ps.setString(2, uid);
		ps.setString(3, pw);
		ps.setInt(4, uspec);
		ps.setString(5, uemail); 
		ps.setString(6, utheme); 
		ps.setString(7, uidchange);

		ps.executeUpdate();

	}

	public void delete(String del) throws Exception { // D- 삭제
		String sql = "delete from user where uid = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, del);
		
		ps.executeUpdate();

	}
}
