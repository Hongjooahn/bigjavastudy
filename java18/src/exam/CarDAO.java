package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CarDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String passwd;

	// 멤버

	public CarDAO() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		url = "jdbc:mysql://localhost:3306/car";
		user = "root";
		passwd = "1234";
		con = DriverManager.getConnection(url, user, passwd);

	}

	public void create(CarDTO cdto) {
		String sql = "insert into carsale values(?,?,?,?)"; // 따옴표 없이

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cdto.getId());
			ps.setString(2, cdto.getName());
			ps.setString(3, cdto.getContent());
			ps.setString(4, cdto.getPrice());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "데이터 삽입 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList selectall(CarDTO cdto) {
		ArrayList list = new ArrayList();
		String sql = "select * from carsale";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				cdto = new CarDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				System.out.println("레코드 가져왔습니다.");
				
				cdto.setId(id);
				cdto.setName(name);
				cdto.setContent(content);
				cdto.setPrice(price);
				list.add(cdto);
			}
			JOptionPane.showMessageDialog(null, "전체 데이터 검색완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	public void select(CarDTO cdto,String input_id) {

		String sql = "select * from carsale where id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, input_id);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				cdto.setId(rs.getString(1));
				cdto.setName(rs.getString(2));
				cdto.setContent(rs.getString(3));
				cdto.setPrice(rs.getString(4));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(CarDTO cdto, String input_id) {
		String sql = "update carsale set id=?,name=?,content=?,price=? where id=?";
		
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, cdto.getId());
			ps.setString(2, cdto.getName());
			ps.setString(3, cdto.getContent());
			ps.setString(4, cdto.getPrice());
			ps.setString(5, input_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void delete(String input_id) {
		String sql = "delete from carsale where id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, input_id);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "삭제 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
