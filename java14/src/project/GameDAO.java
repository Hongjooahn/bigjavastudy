package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GameDAO {
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String passwd;
	
	
	// 멤버

	public GameDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); // 도메인 네임 거꾸로 , 파일을 읽어오는 것 이기 때문에 .. 에러처리가 필수

		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		passwd = "1234";
		con = DriverManager.getConnection(url, user, passwd);

	}

	public void insert(GameDTO gdto) throws Exception { // C- 생성

		String sql = "insert into game values(?,?,?,?,?)"; // 따옴표 없이

		ps = con.prepareStatement(sql);
		ps.setString(1, gdto.getGname());
		ps.setString(2, gdto.getGtheme());
		ps.setInt(3, gdto.getGprice());
		ps.setInt(4, gdto.getGspec());
		ps.setInt(5, gdto.getGrate()); // sql의 ? 값에 넣어줌

		ps.executeUpdate();
	}

	public void update(String gname, String gtheme, int gprice, int gspec, String gnamechange) throws Exception { // U- 업데이트
		// 앞에 change는 바뀌는 값 뒤에 changed는 누구를 바꿀것인가
		String sql = "update game set gname=?,gtheme=?,gprice=?,gspec=? where gname = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, gname);
		ps.setString(2, gtheme);
		ps.setInt(3, gprice);
		ps.setInt(4, gspec);
		ps.setString(5, gnamechange);

		ps.executeUpdate();

	}

	public void delete(String del) throws Exception { // D- 삭제
		String sql = "delete from game where gname = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, del);
		
		ps.executeUpdate();

	}
	
	
	
} 
