package control;

import javax.swing.JOptionPane;

public class Square {

	public static void main(String[] args) {
		double pi = 3.14;
		
		String sr = JOptionPane.showInputDialog("반지름을 입력해주세요");		
		int r = Integer.parseInt(sr);		
		double result = pi*r*r;
		
		
		
		String width = JOptionPane.showInputDialog("가로 길이는 ");		
		String height = JOptionPane.showInputDialog("세로 길이는");		
		int iwidth = Integer.parseInt(width);	
		int iheight = Integer.parseInt(height);	
		
		int result2 = iwidth*iheight;
		
		
		JOptionPane.showMessageDialog(null, "반지름이 "+r+"인 원의 면적은"+result);
		JOptionPane.showMessageDialog(null, "가로가 "+iwidth+"세로가 "+iheight+"인 사각형의 면적은 "+result2);
		JOptionPane.showMessageDialog(null, "사각형의 가로 세로가 같은가요?");
		if (iwidth == iheight) {
			JOptionPane.showMessageDialog(null, "가로 세로가 같아요");			
		}
		else {
			JOptionPane.showMessageDialog(null, "가로 세로가 틀려요");						
		}
		if (r > 10) {
			JOptionPane.showMessageDialog(null, "반지름은 10보다 큽니다");			
		}
		else {
			JOptionPane.showMessageDialog(null, "반지름은 10보다 작습니다.");						
		}	
				
	}

}
