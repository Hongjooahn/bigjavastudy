package graphic;

import java.awt.FlowLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GraphicArray {
	public static void main(String[] args) { // 자바는 필요한 부분(class)을 복사해 조립하여 코딩함
												// 부품 조립식 프로그램 = 객체지향형 프로그래밍(Object Oriented Program)
//		File file = new File("c:/temp/test.txt");
//		 URL url = new URL("http://naver.com");
//		 SQL sql = new ("select * from member");

		String[] movies = { "m1.PNG", "m2.PNG", "m3.PNG", "m4.PNG", "m5.PNG" };
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화 정보 시스템:");
		f.setSize(255, 752);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton imgbtn = new JButton();		

		f.getContentPane().add(imgbtn);
		
		JButton btn1 = new JButton("<<<생일>>>");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(movies[0]);
				imgbtn.setIcon(icon);
			}
		});
		btn1.setBackground(Color.ORANGE);
		btn1.setForeground(Color.RED);
		btn1.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btn1);

		JButton btn2 = new JButton("<<헬보이>>");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(movies[1]);
				imgbtn.setIcon(icon);
			}
		});
		btn2.setBackground(Color.ORANGE);
		btn2.setForeground(Color.RED);
		btn2.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btn2);

		JButton btn3 = new JButton("<돈(money)>");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(movies[2]);
				imgbtn.setIcon(icon);
			}
		});
		btn3.setBackground(Color.ORANGE);
		btn3.setForeground(Color.RED);
		btn3.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btn3);

		JButton btn4 = new JButton("<<파이브피트>>");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(movies[3]);
				imgbtn.setIcon(icon);
			}
		});
		btn4.setBackground(Color.ORANGE);
		btn4.setForeground(Color.RED);
		btn4.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btn4);

		JButton btn5 = new JButton("<<<어스>>>");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(movies[4]);
				imgbtn.setIcon(icon);
			}
		});
		btn5.setBackground(Color.ORANGE);
		btn5.setForeground(Color.RED);
		btn5.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(btn5);

		f.setVisible(true);

	}
}
