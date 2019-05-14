package project;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class UserMain {

	public static void main(String[] args) throws Exception {
		UserDAO udao = new UserDAO();
		UserDTO udto = new UserDTO();

		String select = JOptionPane.showInputDialog("실행할 명령은?(CRUD)");
		if (select.equals("C") || select.equals("c")) {
			

			try {
				udto.setUname(JOptionPane.showInputDialog("유저 이름 입력 "));
				udto.setUid(JOptionPane.showInputDialog("유저 아이디 입력 "));
				udto.setPw(JOptionPane.showInputDialog("PW입력 "));
				udto.setUspec(Integer.parseInt(JOptionPane.showInputDialog("유저 스펙 입력 (3자리 숫자)")));
				udto.setUemail(JOptionPane.showInputDialog("유저 이메일 입력"));
				udto.setUtheme(JOptionPane.showInputDialog("원하는 테마 입력"));
				udao.insert(udto);
			} catch (Exception e) {
				System.out.println("에러발생!!!");
				e.printStackTrace(); // 에러정보 찍기
			}
		}

		else if (select.equals("R") || select.equals("r")) {

		}

		else if (select.equals("U") || select.equals("u")) { // update
			String uidchange = JOptionPane.showInputDialog("바꾸고 싶은 ID 입력");
			String uname = JOptionPane.showInputDialog("새로운 유저 이름 입력 ");
			String uid = JOptionPane.showInputDialog("새로운 유저 ID 입력 ");
			String pw = JOptionPane.showInputDialog("새로운 유저 비밀번호 입력 ");
			int uspec = Integer.parseInt(JOptionPane.showInputDialog("새로운 사양 입력 "));
			String uemail = JOptionPane.showInputDialog("새로운 유저 이메일 입력 ");
			String utheme = JOptionPane.showInputDialog("원하는 테마 입력");
			
			try {				
				udao.update(uname, uid, pw, uspec,uemail, utheme, uidchange);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (select.equals("D") || select.equals("d")) {
			String del = JOptionPane.showInputDialog("삭제하고싶은 유저 ID는 ? : ");
			try {
				udao.delete(del);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
