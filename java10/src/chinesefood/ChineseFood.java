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

public class ChineseFood {
	static int index = 0;
	public static void main(String[] args) {
		MainMenu mm = new MainMenu();
		
		JFrame jf = new JFrame();
		jf.setTitle("중국집입니다");
		jf.setSize(600, 600);
		String[] pictures = { "1.jpeg", "2.jpeg", "3.jpg", "4.jpg" };
		FlowLayout flow = new FlowLayout();
		jf.getContentPane().setLayout(flow);

		JButton btn1 = new JButton("짬뽕");
		btn1.setFont(new Font("굴림", Font.PLAIN, 15));
		jf.getContentPane().add(btn1);

		JButton btn2 = new JButton("우동");
		btn2.setFont(new Font("굴림", Font.PLAIN, 15));
		jf.getContentPane().add(btn2);

		JButton btn3 = new JButton("짜장");
		btn3.setFont(new Font("굴림", Font.PLAIN, 15));
		jf.getContentPane().add(btn3);

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
		
		ImageIcon icon = new ImageIcon(pictures[3]);
		imgbtn.setIcon(icon);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				index++;
				ImageIcon icon = new ImageIcon(pictures[0]);
				imgbtn.setIcon(icon);
				String str = Integer.toString(index);
				tf1.setText(str);
				String str2 = Integer.toString(mm.FiveK(index));
				tf2.setText(str2);

			}

		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				index++;
				ImageIcon icon = new ImageIcon(pictures[1]);
				imgbtn.setIcon(icon);
				String str = Integer.toString(index);
				tf1.setText(str);
				String str2 = Integer.toString(mm.FiveK(index));
				tf2.setText(str2);

			}

		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				index++;
				ImageIcon icon = new ImageIcon(pictures[2]);
				imgbtn.setIcon(icon);
				String str = Integer.toString(index);
				tf1.setText(str);
				String str2 = Integer.toString(mm.FiveK(index));
				tf2.setText(str2);

			}

		});

	}

}
