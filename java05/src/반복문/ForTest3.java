package 반복문;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력해주세요 : ");
		int first = sc.nextInt();
		System.out.print("두번째 수를 입력해주세요 : ");
		int second = sc.nextInt();
		System.out.print("세번째 수를 입력해주세요 : ");
		int third = sc.nextInt();
		
		int result = first+second+third;
		
		System.out.println("전부 더한 값 : "+result);
		
	}

}
