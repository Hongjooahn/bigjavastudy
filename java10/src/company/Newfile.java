package company;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Newfile {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("파일 경로");
		jf.getContentPane().add(label);
		
		TextField tf = new TextField();
		jf.getContentPane().add(tf);
		tf.setColumns(45);
		
		JButton btnNewButton = new JButton("파일경로 설정");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JFileChooser jfc = new JFileChooser();
		            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		            File dir = jfc.getSelectedFile();
		            tf.setText(dir==null?"":dir.getPath());
			}
		});
		jf.getContentPane().add(btnNewButton);
		
		JButton btnTxt = new JButton("txt파일로 입력");
		jf.getContentPane().add(btnTxt);
		
	}
}
