package project;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class NoticeMain {

	public static void main(String[] args) throws Exception {
		NoticeDAO ndao = new NoticeDAO();
		NoticeDTO ndto = new NoticeDTO();
		
		String select = JOptionPane.showInputDialog("실행할 명령은?(CRUD)");
		if (select.equals("C") || select.equals("c")) {
			ndto.setTitle(JOptionPane.showInputDialog("글 제목 입력 "));
			ndto.setContents(JOptionPane.showInputDialog("글 내용 입력 "));
			ndto.setTime(JOptionPane.showInputDialog("시간 입력"));
			try {
				ndao.insert(ndto);
			} catch (Exception e) {
				System.out.println("에러발생!!!");
				e.printStackTrace(); // 에러정보 찍기
			}
		}

		else if (select.equals("R") || select.equals("r")) {

		}

		else if (select.equals("U") || select.equals("u")) { // update
			int changenum = Integer.parseInt(JOptionPane.showInputDialog("바꿀 글 번호 입력 "));
			String title = JOptionPane.showInputDialog("글 제목 입력 ");
			String contents = JOptionPane.showInputDialog("글 내용 입력 ");
			String time = JOptionPane.showInputDialog("시간 입력");
			try {
				ndao.update(title, contents, time, changenum);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		else if (select.equals("D") || select.equals("d")) {
			String del = JOptionPane.showInputDialog("삭제하고싶은 글번호는 ? : ");
			try {
				ndao.delete(del);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
