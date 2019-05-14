package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	private static JTextField n1;
	private static JTextField n2;
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(new Color(105, 105, 105));
		f.getContentPane().setFont(new Font("돋움", Font.BOLD, 26));
		f.setSize(500,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("<***** 나의 계산기 *****>");
		label.setForeground(Color.MAGENTA);
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("숫자 1 >>");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 26));
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setFont(new Font("돋움", Font.BOLD, 32));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label_1 = new JLabel("숫자 2 >>");
		label_1.setForeground(new Color(0, 0, 255));
		label_1.setFont(new Font("돋움", Font.BOLD, 26));
		label_1.setBackground(Color.WHITE);
		f.getContentPane().add(label_1);
		
		JButton b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num1 = n1.getText();
				 String num2 = n2.getText();
				 int number1 = Integer.parseInt(num1);
				 int number2 = Integer.parseInt(num2);
				 System.out.println(number1+number2);
			}
		});
		JButton b2 = new JButton("-");
		b2.setFont(new Font("돋움", Font.BOLD, 30));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				System.out.println(number1-number2);
			}
		});
		JButton b3 = new JButton("*");
		b3.setFont(new Font("돋움", Font.BOLD, 30));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				System.out.println(number1*number2);
			}
		});
		JButton b4 = new JButton("/");
		b4.setFont(new Font("돋움", Font.BOLD, 30));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				System.out.println(number1/number2);
			}
		});
		
		n2 = new JTextField();
		n2.setFont(new Font("돋움", Font.BOLD, 32));
		n2.setColumns(10);
		f.getContentPane().add(n2);
		b1.setFont(new Font("돋움", Font.BOLD, 30));
		
		
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		
		
		f.setVisible(true);
	}
}
