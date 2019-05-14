package 반복문;

import java.util.Scanner;

import javax.swing.JFrame;

public class WhileTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		JFrame jf = new JFrame();
		
		
		System.out.print("첫 수를 입력하세요:");
		int first = sc.nextInt();
		System.out.print("두 번째  수를 입력하세요:");
		int second = sc.nextInt();
		int sum = 1;

		while (first <= second) {
			sum = sum*first;
			first++;
		}
		System.out.println(sum);
		
//		jf.setVisible(true);
	}

}
