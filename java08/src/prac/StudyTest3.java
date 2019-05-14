package prac;

import java.util.Scanner;

public class StudyTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 이름 학년 학점
		String[] name = new String[5];
		int[] age = new int[5];
		System.out.println("이름과 나이를 입력하세요");
		for(int i = 0 ; i<5 ; i++) {
			System.out.print(i+1+") 이름 >>>> ");
			name[i]=sc.next();
			System.out.print(i+1+") 나이 >>>> ");
			age[i]=sc.nextInt();
		}
		
		System.out.println("\r전체 인원은 ? : "+name.length);
		System.out.println("전체 참석명단");
		int sum = 0;
		for(int i = 0 ; i <name.length;i++) {
			System.out.println("이름은 : "+name[i]+" 나이는 : "+age[i]);
			sum= sum+age[i];
		}
		
		System.out.println("파티 참석자의 평균 나이는 : "+sum/age.length+"세 입니다.");
		
		
	}

}
