package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DB입력2 {
	public static void main(String[] args) throws Exception {

		MemberDAO db = new MemberDAO();
		String select = JOptionPane.showInputDialog("C R U D 중 어떤 명령을 실행하시겠습니까?");
		System.out.println(select);

		if (select.equals("C")||select.equals("c")) {
			String id = JOptionPane.showInputDialog("ID입력 ");
			String pw = JOptionPane.showInputDialog("PW입력 ");
			String name = JOptionPane.showInputDialog("NAME입력 ");
			String tel = JOptionPane.showInputDialog("TEL입력 ");

			
			MemberDTO mdto = new MemberDTO();
			mdto.setId(id);
			mdto.setPw(pw);
			mdto.setName(name);
			mdto.setTel(tel);			
			try {
				db.insert(mdto);
			} catch (Exception e) {
				System.out.println("에러발생!!!");
				e.printStackTrace(); // 에러정보 찍기
			}
		}
		
		else if (select.equals("R")||select.equals("r")) {
			
		}
		
		else if (select.equals("U")||select.equals("u")) { // update
			String changed = JOptionPane.showInputDialog("바꾸고 싶은 ID : ");
			String change = JOptionPane.showInputDialog("바꾸고 싶은 TEL : ");
			try {
				db.update(change, changed);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if (select.equals("D")||select.equals("d")) {
			String del = JOptionPane.showInputDialog("삭제하고싶은 ID는 ? : ");
			try {
				db.delete(del);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}
}
