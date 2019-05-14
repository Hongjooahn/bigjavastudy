package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 나의첫계산기3_SwhitchCase {

	public static void main(String[] args) {
		Random random = new Random();
		int com = random.nextInt(3);
		int win = 0;
		String comrsp = null;
		String humrsp = null;
		JLabel lbl = new JLabel("");
		lbl.setForeground(new Color(255, 0, 0));
		lbl.setBackground(new Color(192, 192, 192));
		lbl.setFont(new Font("굴림", Font.BOLD, 18));

		JFrame f = new JFrame("가위 바위 보");
		f.getContentPane().setBackground(new Color(128, 128, 128));
		f.setSize(371, 228);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btn0 = new JButton("결과는?!");
		btn0.setForeground(new Color(0, 0, 255));
		btn0.setFont(new Font("굴림", Font.PLAIN, 40));

		JButton btn1 = new JButton("가위");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int human = 0;
				String result = null;
				if (com == 1) {
					lbl.setText("컴퓨터 : 바위");
					result = "컴퓨터 승리";
				} else if (com == 2) {
					lbl.setText("컴퓨터 : 보");
					result = "내가 승리";
				} else {
					lbl.setText("컴퓨터 : 가위");
					result = "무승부!";
				}
				btn0.setText(result);
			}
		});
		btn1.setFont(new Font("굴림", Font.PLAIN, 34));
		f.getContentPane().add(btn1);

		// 가위

		JButton btn2 = new JButton("바위");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int human = 1;
				String result = null;
				if (com == 2) {
					lbl.setText("컴퓨터 : 보");
					result = "컴퓨터 승리";
				} else if (com == 0) {
					lbl.setText("컴퓨터 : 바위");
					result = "내가 승리";
				} else {
					lbl.setText("컴퓨터 : 가위");
					result = "무승부!";
				}
				btn0.setText(result);
			}
		});
		btn2.setFont(new Font("굴림", Font.PLAIN, 34));
		f.getContentPane().add(btn2);

		// 바위

		JButton btn3 = new JButton("보");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int human = 2;
				String result = null;
				if (com == 0) {
					lbl.setText("컴퓨터 : 가위");
					result = "컴퓨터 승리";
				} else if (com == 1) {
					lbl.setText("컴퓨터 : 바위");
					result = "내가 승리";
				} else {
					lbl.setText("컴퓨터 : 보");
					result = "무승부!";
				}
				btn0.setText(result);
			}
		});
		btn3.setFont(new Font("굴림", Font.PLAIN, 34));
		f.getContentPane().add(btn3);

		f.getContentPane().add(lbl);
		f.getContentPane().add(btn0);

		f.setVisible(true);
	}
}
