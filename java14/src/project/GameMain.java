package project;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class GameMain {

	public static void main(String[] args) throws Exception {
		GameDAO gdao = new GameDAO();
		GameDTO gdto = new GameDTO();

		String select = JOptionPane.showInputDialog("실행할 명령은?(CRUD)");
		if (select.equals("C") || select.equals("c")) {
			gdto.setGname(JOptionPane.showInputDialog("게임 이름 입력 "));
			gdto.setGtheme(JOptionPane.showInputDialog("테마 입력 "));
			gdto.setGprice(Integer.parseInt(JOptionPane.showInputDialog("가격 입력 ")));
			gdto.setGspec(Integer.parseInt(JOptionPane.showInputDialog("게임 사양 입력(세자리)")));
			gdto.setGrate(Integer.parseInt(JOptionPane.showInputDialog("별점 입력(0~5) ")));

			try {
				gdao.insert(gdto);
			} catch (Exception e) {
				System.out.println("에러발생!!!");
				e.printStackTrace(); // 에러정보 찍기
			}
			System.out.println("success");
		}

		else if (select.equals("R") || select.equals("r")) {

		}

		else if (select.equals("U") || select.equals("u")) { // update
			String gnamechange = JOptionPane.showInputDialog("바꿀 게임 이름 입력 ");
			String gname = JOptionPane.showInputDialog("새로운 게임 이름 입력 ");
			String gtheme = JOptionPane.showInputDialog("새로운 게임 테마 입력 ");
			int gprice = Integer.parseInt(JOptionPane.showInputDialog("바꿀 가격 입력 "));
			int gspec = Integer.parseInt(JOptionPane.showInputDialog("바꿀 게임 사양 입력 "));
			try {
				gdao.update(gname, gtheme, gprice, gspec, gnamechange);
				System.out.println("success");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("fail");
			}
		}

		else if (select.equals("D") || select.equals("d")) {
			String del = JOptionPane.showInputDialog("삭제하고싶은 게임 이름은 ? : ");
			try {
				gdao.delete(del);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("success");

		}
	}

}
