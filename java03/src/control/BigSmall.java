package control;

import java.util.Scanner;

public class BigSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int first = sc.nextInt();
		System.out.print("\r두번째 숫자를 입력하세요 : ");
		int second = sc.nextInt();
		
		if(first>second) {
			System.out.println("첫번째 숫자가 두번째 숫자보다 큽니다.");
		}
		else if(second>first) {
			System.out.println("첫번째 숫자가 두번째 숫자보다 큽니다.");			
		}
		else {
			System.out.println("두 수는 같습니다.");
		}
		
		
	}

}
