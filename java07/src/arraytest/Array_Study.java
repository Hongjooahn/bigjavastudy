package arraytest;

import java.util.Scanner;

public class Array_Study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int anum[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("숫자 입력 : ");
			anum[i]=sc.nextInt();
		}
		for(int i : anum) {
			System.out.println(anum[i]);
		}
		//자동
		
		
		System.out.print("값 3개를 넣으세요 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		//수동
	}
	

}
