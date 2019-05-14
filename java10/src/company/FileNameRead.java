package company;

import java.awt.FlowLayout;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FileNameRead extends JFrame {
	static String filepath = "";

	public FileNameRead() {
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        JLabel label = new JLabel("출력경로 : ");
        this.getContentPane().add(label);
        JTextField TF = new JTextField();
        TF.setColumns(30);
//        TF.setEnabled(false); 텍스트 파일경로 건들수 있게 ? on/off
        this.getContentPane().add(TF);
      
        
        JRadioButton rbtn1 = new JRadioButton("깊이1");
        JRadioButton rbtn2 = new JRadioButton("깊이2");
        ButtonGroup  group = new ButtonGroup(); 
        group.add(rbtn1);
        group.add(rbtn2);
        
        JButton btn = new JButton("파일검색");
        btn.addActionListener(e -> {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jfc.showDialog(this, null);
            File dir = jfc.getSelectedFile();
            TF.setText(dir==null?"":dir.getPath());
//            String filename = dir.getName();
            filepath = dir.getPath(); //파일경로          
        });
        this.getContentPane().add(btn);
        
        
        JButton btn2 = new JButton("입력");
        btn2.addActionListener(e -> {
        	Calculator c = new Calculator();        	
            c.Cal_2(filepath);
            JOptionPane.showMessageDialog(null, "입력 완료 ");
        });
        this.getContentPane().add(btn2);
       
        getContentPane().add(rbtn1);
        getContentPane().add(rbtn2);
        
        
        
        setSize(394, 202);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null); 무슨 기능이야 ?
    }

	public static void main(String[] args) {
		new FileNameRead();
	}

}