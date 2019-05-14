package java15;

import java.sql.*;

public class BbsDAO {
	String url = "jdbc:mysql://localhost:3306/bigjavahello";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	// CRUD
	// 각각을 메소드로 만들기
	public BbsDTO select(String inputId) {
		BbsDTO dto = null;
		// 1. 드라이버설정
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 완료");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 완료");

			// 3. SQL문 결정(객체화)
			String sql = "select * from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL문 객체화 완료");

			// 4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 완료");

			if (rs.next()) {
				dto = new BbsDTO();
//				String id = rs.getString("id");
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
			} else {
				System.out.println("검색결과가 없습니다.");
			}

		} catch (Exception e) {
			System.out.println("DB처리중 에러발생");
			System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {// 에러발생 여부에 상관없이 무조건 실행시키는 코드
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("자원 해제중 에러 발생!!");
			} // catch
		} // finally

		return dto;
	}// method

	public void insert(BbsDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 완료");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 완료");

			// 3. SQL문 결정(객체화)
			String sql = "insert into bbs values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());
			System.out.println("3. SQL문 객체화 완료");

			// 4. SQL문 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(BbsDTO dto ,String wantchange) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 완료");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 완료");

			// 3. SQL문 결정(객체화)
			String sql = "update Bbs set id=?,title=?,content=?,etc=? where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());
			ps.setString(5, wantchange);
			System.out.println("3. SQL문 객체화 완료");

			// 4. SQL문 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(BbsDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 완료");

			// 2. DB연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 완료");

			// 3. SQL문 결정(객체화)
			String sql = "delete from Bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			System.out.println("3. SQL문 객체화 완료");

			// 4. SQL문 전송
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
