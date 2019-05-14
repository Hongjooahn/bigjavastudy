package graphic;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Kbutton2 {

	public static void main(String[] args) {
		JButton[] btnlist = new JButton[50];
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(null);
		for (int i = 0; i < btnlist.length; i++) {
			btnlist[i] = new JButton("버튼" + i);
		}
		
		
		for (int i = 0; i < btnlist.length; i++) {
			btnlist[i].setBounds(i*100, i*50 , 100, 100);
			f.add(btnlist[i]);			
		}		
		
		
		

		f.setVisible(true);
	}

}
