package 반복문;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0 ; i<input ; i++) {
			System.out.println("★");
		}

	}

}
