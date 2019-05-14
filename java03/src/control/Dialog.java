package control;

import javax.swing.JOptionPane;

public class Dialog {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "내가 바로 다이얼로그에요."); //출력용 다이얼로그
		String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요:");
		System.out.println("당신의 이름은 : "+name);
		String age = JOptionPane.showInputDialog("당신의 나이를 입력해주세요:");		
		int data = Integer.parseInt(age); //String인 age를 int형 변수 data로 변경.
		JOptionPane.showMessageDialog(null, "내년 나의 나이는 "+(data+1)+"입니다. "); //출력용 다이얼로그
		
		
	}

}
