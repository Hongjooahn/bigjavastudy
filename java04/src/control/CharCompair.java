package control;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class CharCompair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("등급을 입력해주세요 : ");
			String grade = sc.next();
			char score = grade.charAt(0);

			switch (score) {
			case 'A':
				System.out.println("최우수입니다.");
				break;
			case 'B':
				System.out.println("우수입니다.");
				break;
			case 'C':
				System.out.println("보통입니다.");
				break;
			default:
				System.out.println("통과하지 못했습니다.");
				break;
			}
			if(score=='A'|| score=='B' || score=='C') {
				break;
			}//if				
		}//while
	}//main
}//class
