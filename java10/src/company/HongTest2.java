package company;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HongTest2 extends JPanel implements ActionListener {
	JButton search;
	JButton save;
	JFileChooser chooser;

	public HongTest2() {
		search = new JButton("SearchDirectory");
		save = new JButton("SaveName");
		search.addActionListener(this);
		add(search);
		}
	public void actionPerformed(ActionEvent e) {
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //<- 디렉only
		
		chooser.setAcceptAllFileFilterUsed(false);
		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			System.out.println("현재 디렉토리는 : " + chooser.getCurrentDirectory());
			//System.out.println("선택된 파일은 : " + chooser.getSelectedFile()); <=디렉X 파일O
		} else {
			System.out.println("No Selection ");
		}
	}

	

	public static void main(String s[]) {
		JFrame frame = new JFrame();
		HongTest2 panel = new HongTest2();	
		frame.getContentPane().add(panel, "Center");
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}