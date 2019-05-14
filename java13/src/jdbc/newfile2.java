package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class newfile2 {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); 

		String url = "jdbc:mysql://localhost:3306/myphone";
		String user = "root";
		String passwd = "1234";
		Connection con = DriverManager.getConnection(url, user, passwd);

		String id = JOptionPane.showInputDialog("ID입력 ");
		String title = JOptionPane.showInputDialog("title입력 ");
		int price = Integer.parseInt(JOptionPane.showInputDialog("price입력 "));		 // showinputdilog는 스트링만 받나보다 int로 바꿔주자
		String company = JOptionPane.showInputDialog("company입력 ");
		String sql = "insert into product values(?,?,?,?)"; 
		System.out.println(sql);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setInt(3, price);
		ps.setString(4, company); 

		ps.executeUpdate();
		System.out.println("Input OK");

	}
}
