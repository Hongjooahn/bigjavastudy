package java11;

import java.util.Arrays;
import java.util.Scanner;

public class Member2 {

	String[] id = new String[3];
	String[] pw = new String[3];
	String[] grade = new String[3];
	int[] mile = new int[3];
	
	
	public void member_in() { 
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("\r--- 가입할 정보 입력 ---");
			System.out.print("아이디 : ");
			this.id[i] = sc.next();
			System.out.print("비밀번호 : ");
			this.pw[i] = sc.next();
			System.out.print("등급 : ");
			this.grade[i] = sc.next();
			System.out.print("마일리지 : ");
			this.mile[i] = sc.nextInt();				
		}	
	}
	public void member_out() {
		System.out.println("=====================================");
		System.out.println("아이디\t비밀번호\t등급\t마일리지");
		System.out.println("-------------------------------------");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(id[i]+"\t"+pw[i]+"\t"+grade[i]+"\t"+mile[i]);
		}
		System.out.println("총 마일리지는 : "+milesum(mile));
	}
	
	public int milesum(int[] x){
		int y = 0;
		for(int i = 0 ; i < 3 ; i++) {
			y = y+x[i];
		}
		System.out.println("합은 : "+y);		
		return y/(x.length);
		
	}
	



}