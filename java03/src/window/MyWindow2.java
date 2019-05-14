package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow2 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(300,300);
		jf.setTitle("자바자바");
		
		JButton b1 = new JButton("자바 프로젝트");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("자바 프로젝트 눌렀습니다~");
			}
		});
		jf.getContentPane().add(b1);
		
		jf.setVisible(true);		
	}

}
