package control;

import javax.swing.JOptionPane;

public class Question_1 {

	public static void main(String[] args) {
		String fav = JOptionPane.showInputDialog("먹고 싶은 음식을 입력하세요.");
		String hate = JOptionPane.showInputDialog("먹기 싫은 음식을 입력하세요.");

		JOptionPane.showMessageDialog(null, "먹고 싶은 음식은 " + fav);
		JOptionPane.showMessageDialog(null, "먹기 싫은 음식은 " + hate);

		String CK = JOptionPane.showInputDialog("오늘의 치킨 가격은 얼마인가요? ");
		int price = Integer.parseInt(CK);

		if (price > 9000) {
			JOptionPane.showMessageDialog(null, "내일 다시 전화할게요");
		} else {
			JOptionPane.showMessageDialog(null, "주문할게요");

		}
		String age = JOptionPane.showInputDialog("나의 나이는 : ");
		String age2 = JOptionPane.showInputDialog("동생 나이는 : ");

		int rice = Integer.parseInt(age);
		int rice2 = Integer.parseInt(age2);

		if (rice >= rice2) {
			JOptionPane.showMessageDialog(null, "내가 떡2개를 먹어요");
		} else {
			JOptionPane.showMessageDialog(null, "동생이 떡2개를 먹어요");
		}
	}
}
