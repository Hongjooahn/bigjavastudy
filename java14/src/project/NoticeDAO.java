package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class NoticeDAO {
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String passwd;

	public NoticeDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); // 도메인 네임 거꾸로 , 파일을 읽어오는 것 이기 때문에 .. 에러처리가 필수

		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		passwd = "1234";
		con = DriverManager.getConnection(url, user, passwd);

	}

	public void insert(NoticeDTO ndto) throws Exception { // C- 생성

		String sql = "insert into notice values(?,?,?,default)"; // 따옴표 없이

		ps = con.prepareStatement(sql);
		ps.setString(1, ndto.getTitle());
		ps.setString(2, ndto.getContents());
		ps.setString(3, ndto.getTime());

		ps.executeUpdate();
	}

	public void update(String title, String contents, String time, int changenum) throws Exception { // U- 업데이트
		// 앞에 change는 바뀌는 값 뒤에 changed는 누구를 바꿀것인가
		String sql = "update notice set title=?,contents=?,time=? where num = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, contents);
		ps.setString(3, time);
		ps.setInt(4, changenum);

		ps.executeUpdate();

	}

	public void delete(String del) throws Exception { // D- 삭제
		String sql = "delete from notice where num = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, del);

		ps.executeUpdate();

	}
}
