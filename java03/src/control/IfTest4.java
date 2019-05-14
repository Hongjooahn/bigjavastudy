package control;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("점수를 입력해주세요");
			int gradepoint = sc.nextInt();
			char result = 0 ;
			
			if(100>=gradepoint && gradepoint >= 90) {
				result = 'A';
			}
			else if(gradepoint >= 80) {
				result = 'B';		
			}
			else if(gradepoint >= 70) {
				result = 'C';
			}
			else if(gradepoint >= 60) {
				result = 'D';
			}
			else if(gradepoint < 60 ) {
				result = 'F';
			}
			else {
				System.out.println("올바른 점수를 입력해주세요.");
			}
			
			System.out.println("당신의 학점은"+result+"입니다");
		}
		
	}
}
