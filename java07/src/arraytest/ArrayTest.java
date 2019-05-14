package arraytest;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] name = new String[3];		
		for(int i = 0 ; i<3 ; i++) {
			System.out.print("원하는 과목을 입력해주세요 =>");
			name[i] = sc.next();
		}
		System.out.println(name[0]+" 보다는 "+name[2]+"\r");
		
		//1
		
		int[] num = new int[3];
		for(int i=0;i<num.length;i++) {
			System.out.print("숫자를 입력해주세요 : ");
			num[i]=sc.nextInt();
		}		
		System.out.println(num[0]+"+"+num[2]+"는 : "+(num[0]+num[2])+"입니다.\r");
		
		//2
		
		int[] onefive = new int[5];
		System.out.println("정수출력 !");
		for(int i = 1 ; i<=onefive.length; i++) {
			onefive[i-1]=i;
			System.out.print(onefive[i-1]);
		}
		System.out.println("\r");
		
		//3
		
		int[] search = {11,22,33,44};
		for(int i = 0 ; i<search.length; i++) {
			if(search[i]==33) {
				System.out.println(i+"번째 칸에 있습니다");
			}
		}
		System.out.println();
		
		//4
		
		int[] score = new int[5];
		int sum = 0;
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print("성적을 입력해주세요 : ");
			score[i]= sc.nextInt();
			sum = sum+score[i];
		}
		System.out.println("평균성적은 : "+sum/score.length);
		
		//5
	}
}
