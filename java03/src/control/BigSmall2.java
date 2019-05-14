package control;

import java.util.Scanner;

public class BigSmall2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int second = sc.nextInt();
		
		System.out.println(first+"+"+second+" = "+(first+second));		
		System.out.println(first+"-"+second+" = "+(first-second));		
		System.out.println(first+"*"+second+" = "+(first*second));		
		System.out.println(first+"/"+second+" = "+(first/second)+" 나머지는 : "+ (first%second));		
	}

}
