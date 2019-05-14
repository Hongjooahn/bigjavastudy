package chinesefood;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;

public class ChineseFood2 {
	static int i = 0;
	public static void main(String[] args) {
		MainMenu mm = new MainMenu();
		int index = 0;
		JFrame jf = new JFrame();
		jf.setTitle("중국집입니다");
		jf.setSize(600, 600);
		String[] pictures = { "1.jpeg", "2.jpeg", "3.jpg", "4.jpg" };
		FlowLayout flow = new FlowLayout();
		jf.getContentPane().setLayout(flow);

		JButton[] btn = new JButton[3];

		JLabel lbl1 = new JLabel("개수");
		jf.getContentPane().add(lbl1);

		JTextField tf1 = new JTextField();
		jf.getContentPane().add(tf1);
		tf1.setColumns(8);

		JLabel lbl2 = new JLabel("금액");
		jf.getContentPane().add(lbl2);

		JTextField tf2 = new JTextField();
		jf.getContentPane().add(tf2);
		tf2.setColumns(8);
		jf.setVisible(true);

		JButton imgbtn = new JButton();
		jf.getContentPane().add(imgbtn);

		for (i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ImageIcon icon = new ImageIcon(pictures[i]);
					imgbtn.setIcon(icon);
					String str = Integer.toString(index);
					tf1.setText(str);
					String str2 = Integer.toString(mm.FiveK(index));
					tf2.setText(str2);

				}

			});
		}
	}

}
