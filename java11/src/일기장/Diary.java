package 일기장;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Diary {
	

	public Diary() {
		JFrame jf = new JFrame();
		jf.setSize(450,500);
		jf.getContentPane().setLayout(null);
		JLabel lbl1;
		JLabel lbl2;
		JLabel lbl3;
		JTextField tf;
		JTextField tf2;
		
		
		lbl1 = new JLabel("<<<<일기작성날짜>>>>");
		lbl1.setBounds(48, 10, 136, 30);
		jf.getContentPane().add(lbl1);
		
		tf = new JTextField();
		tf.setColumns(15);
		tf.setBounds(196,11,145,30);
		jf.getContentPane().add(tf);
		
		lbl2 = new JLabel("<<<<일기작성제목>>>>");
		lbl2.setBounds(48, 50, 136, 30);
		jf.getContentPane().add(lbl2);
		
		tf2 = new JTextField();
		tf2.setColumns(15);
		tf2.setBounds(196, 51, 145, 30);
		jf.getContentPane().add(tf2);
		
		
		lbl3 = new JLabel("<<<<일기작성내용>>>>");
		lbl3.setBounds(132, 85, 145, 42);
		jf.getContentPane().add(lbl3);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 119, 410, 233);
		jf.getContentPane().add(textArea);
		
		JButton button = new JButton("파일에 저장하기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter w = new FileWriter("start.txt");					
					String time = tf.getText();
					String title = tf2.getText();
					String contents = textArea.getText();
					w.write("일기 작성 날짜 : "+time);
					w.write("\r일기 작성 제목 : "+title);
					w.write("\r일기 작성 내용 : "+contents);
					w.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(132, 362, 167, 42);
		jf.getContentPane().add(button);
		
		JButton button_1 = new JButton("파일에서 읽어오기");
		button_1.setBounds(132, 408, 167, 42);
		jf.getContentPane().add(button_1);
		
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		
	
		
	}
}
