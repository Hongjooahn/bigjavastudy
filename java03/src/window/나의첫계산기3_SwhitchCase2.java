package window;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 나의첫계산기3_SwhitchCase2 {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField n3;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(new Color(105, 105, 105));
		f.getContentPane().setFont(new Font("돋움", Font.BOLD, 26));
		f.setSize(500, 400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel title = new JLabel("<***** 나의 계산기 *****>");
		title.setForeground(Color.MAGENTA);
		title.setBackground(Color.LIGHT_GRAY);
		title.setFont(new Font("굴림", Font.BOLD, 36));
		f.getContentPane().add(title);

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

		JButton b1 = new JButton("계산!");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				String cal = n3.getText();
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);

				int index = 0;

				switch (cal) {
				case "+":
					index = number1 + number2;
					break;
				case "-":
					index = number1 - number2;
					break;
				case "*":
					index = number1 * number2;
					break;
				case "/":
					index = number1 / number2;
					break;
				default:
					System.out.println("연산불가능 기호 입니다.");
					break;					
				}
				System.out.println("값 : "+index);

			}
		});

		n2 = new JTextField();
		n2.setFont(new Font("돋움", Font.BOLD, 32));
		n2.setColumns(10);
		f.getContentPane().add(n2);

		JLabel label_2 = new JLabel("연산자 입력해주세요 >>");
		label_2.setForeground(new Color(255, 255, 0));
		label_2.setFont(new Font("돋움", Font.BOLD, 26));
		label_2.setBackground(Color.WHITE);
		f.getContentPane().add(label_2);

		n3 = new JTextField();
		n3.setFont(new Font("돋움", Font.BOLD, 32));
		n3.setColumns(4);
		f.getContentPane().add(n3);
		b1.setFont(new Font("돋움", Font.BOLD, 30));

		f.getContentPane().add(b1);

		f.setVisible(true);
	}
}
