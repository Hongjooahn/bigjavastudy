package 일기장;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class login {
	
	public login() {
		
		String id = "hongja007";
		String pw = "javagood";

		JFrame f = new JFrame("나의 일기장 로그인 화면");

		f.setSize(490, 640);
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("diary.jpg");
		l.setIcon(icon);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l);

		JTextField tf = new JTextField();
		tf.setColumns(10);
		JTextField tf2 = new JTextField();
		tf2.setColumns(10);


		JLabel lblId = new JLabel("ID : ");
		f.getContentPane().add(lblId);
		f.getContentPane().add(tf);

		JLabel lblPw = new JLabel("PW : ");
		f.getContentPane().add(lblPw);
		f.getContentPane().add(tf2);
		
		JLabel error = new JLabel("잘못된 입력입니다!!!!!");
		error.setVisible(false);
		
		JButton btnNewButton = new JButton("로그인 처리");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String input_id = tf.getText();
				String input_pw = tf2.getText();
				
				if (input_id.equals(id) && input_pw.equals(pw)) {
					Diary dia = new Diary();
				} else {
					error.setVisible(true);

				}
			}
		});
		f.getContentPane().add(btnNewButton);
		
		f.getContentPane().add(error);
		f.setVisible(true);
	}
	public static void main(String[] args) {		
		login lg = new login();
		}
}
