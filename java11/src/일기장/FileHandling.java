package 일기장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		FileWriter w = new FileWriter("start.txt");
		JOptionPane.showInputDialog("이름 입력 : ");	
		JOptionPane.showInputDialog("전화번호 입력 : ");
		JOptionPane.showInputDialog("주소 : ");
		JOptionPane.showInputDialog("이름 입력 : ");
		w.write("안녕하세요/n");
		w.write("반갑습니다/n");
		w.close();
	}

}
