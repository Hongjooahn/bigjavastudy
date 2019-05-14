package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DBTest {

	public static void main(String[] args) throws Exception {
//		1. 드라이버 셋팅 (db마다 다름)
		Class.forName("com.mysql.jdbc.Driver"); //도메인 네임 거꾸로 , 파일을 읽어오는 것 이기 때문에 .. 에러처리가 필수
		System.out.println("1. 드라이버 설정 OK "); // mysql connector(MVN에서 가져옴)
		
//		2. db연결 (인증정보 필요{DB명, ID , passwd}) 스트림생성
		String url = "jdbc:mysql://localhost:3306/bigjavahello";
		String user = "root";
		String passwd = "1234";
		Connection con = DriverManager.getConnection(url, user, passwd);
		System.out.println("2. DB 연결 OK");
		
//		3. SQL 결정
		String id = JOptionPane.showInputDialog("ID입력 ");
		String pw = JOptionPane.showInputDialog("PW입력 ");
		String name = JOptionPane.showInputDialog("NAME입력 ");
		String tel = JOptionPane.showInputDialog("TEL입력 ");
//		String sql = "insert into member values('"+id+"','"+pw+"','"+name+"','"+tel+"')";
		String sql = "insert into member values(?,?,?,?)"; // 따옴표 없이 
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel); // sql의 ? 값에 넣어줌
		
		System.out.println("3. SQL문 결정 OK");
//		URL url2 = new URL(url); // 객체화를 시켜야 url로 인정을 해줌
		
		
//		4. SQL 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");
		
	}

}
