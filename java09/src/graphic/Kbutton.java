package graphic;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Kbutton {

	public static void main(String[] args) {
		JButton[] btnlist = new JButton[200];
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		for (int i = 0; i < btnlist.length; i++) {
			btnlist[i] = new JButton("나는 버튼"+i);
			f.add(btnlist[i]);
		}
		f.setVisible(true);
	}

}
