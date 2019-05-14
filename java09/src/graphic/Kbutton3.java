package graphic;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Kbutton3 {

	public static void main(String[] args) {
		JButton[] btnlist = new JButton[200];
		JFrame f = new JFrame();
		Random rc = new Random();
		
		f.setSize(1000, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(null);
		for (int i = 0; i < btnlist.length; i++) {
			btnlist[i] = new JButton("버튼" + i);
		}
		
		
		for (int i = 0; i < btnlist.length; i++) {
			int x = rc.nextInt(800);
			int y = rc.nextInt(800);
			btnlist[i].setBounds(x, y , 100, 70);
			f.add(btnlist[i]);			
		}		
		
		
		

		f.setVisible(true);
	}

}
