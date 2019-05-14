package 반복문;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WhileTest3 {
	private static JTextField tf1;
	private static JTextField tf2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JFrame jf = new JFrame();
		jf.setSize(186, 300);
		jf.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel you = new JLabel("first");
		jf.getContentPane().add(you);

		tf1 = new JTextField();
		jf.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		
		
		JLabel you2 = new JLabel("second");
		jf.getContentPane().add(you2);
		you2.setVisible(true);


		tf2 = new JTextField();
		jf.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JLabel sumcheck = new JLabel("값은 ?");
		jf.getContentPane().add(sumcheck);
		
		JButton cal = new JButton("계산");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int sum = 0;
				String s1 = tf1.getText();
				int first = Integer.parseInt(s1);
				String s2 = tf2.getText();
				int second = Integer.parseInt(s2);
				
				while (first <= second) {
					sum =sum+first;
					first++;					
				}
				
				String result = Integer.toString(sum);
				sumcheck.setText("값 : "+result);
			}
		});
		jf.getContentPane().add(cal);
		
		
		int sum = 0;
		jf.setVisible(true);
	
		
		
		
		
		
	

	}

}
