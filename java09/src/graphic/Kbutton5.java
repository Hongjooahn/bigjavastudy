package graphic;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kbutton5 {
	static int x = 3; // 액션 리스너에서 쓰고 싶어서

	public static void main(String[] args) {
		String[] btnlist = { "m1.PNG", "m2.PNG", "m3.PNG", "m4.PNG", "m5.PNG" };
		JFrame f = new JFrame();
		f.setSize(350, 400);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton picture = new JButton();

		JButton left = new JButton("왼쪽으로 !");
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { // 왼쪽 버튼 클릭시
				if (x == 0) { // X 값이 -1 로 가면 인덱스 에러
					x = 4; // 인덱스 에러 방지 하면서 제일 뒷부분 배열로 감
					ImageIcon icon = new ImageIcon(btnlist[x]);
					picture.setIcon(icon);
					System.out.println(x); // 이미지 세팅
				} else { // X값이 아직 1~4일때
					x = x - 1; // 배열 -1
					ImageIcon icon = new ImageIcon(btnlist[x]);
					picture.setIcon(icon);
					System.out.println(x); // 이미지 세팅
				}
			}
		});
		f.getContentPane().add(left);

		JButton right = new JButton("오른쪽으로 !");
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (x == 4) {
					x = 0;
					ImageIcon icon = new ImageIcon(btnlist[x]);
					picture.setIcon(icon);
					System.out.println(x);
				} else {
					x = x + 1;
					ImageIcon icon = new ImageIcon(btnlist[x]);
					picture.setIcon(icon);
					System.out.println(x);
				}
			}
		});
		f.getContentPane().add(right);
		f.getContentPane().add(picture);
		f.setVisible(true);
	}

}
