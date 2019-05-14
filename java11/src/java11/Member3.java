package java11;

import java.util.Arrays;
import java.util.Scanner;

public class Member3 {

	String[] name = new String[3];
	String[] owner = new String[3];
	int[] price = new int[3];

	
	public void member_in() { 
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("\r--- 가입할 정보 입력 ---");
			System.out.print("이름 : ");
			this.name[i] = sc.next();
			System.out.print("비밀번호 : ");
			this.owner[i] = sc.next();
			System.out.print("등급 : ");
			this.price[i] = sc.nextInt();
							
		}	
	}
	public void member_out() {
		System.out.println("=====================================");
		System.out.println("아이디\t비밀번호\t등급\t마일리지");
		System.out.println("-------------------------------------");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(name[i]+"\t"+owner[i]+"\t"+price[i]);
		}
		System.out.println("총 마일리지는 : "+milesum(price));
	}
	
	public int milesum(int[] x){
		int y = 0;
		for(int i = 0 ; i < 3 ; i++) {
			y = y+x[i];
		}
		return y;
		
	}
	



}