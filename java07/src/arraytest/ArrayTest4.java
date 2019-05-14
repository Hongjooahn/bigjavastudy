package arraytest;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] singers = new String[3];

		for (int i = 0; i < singers.length; i++) {
			System.out.print("가수 이름 입력 : ");
			singers[i] = sc.next();
		}
		System.out.println("*************************************");

		for (String i : singers) {
			System.out.print(i + " ");
		}
		System.out.println();

		int[] index = new int[singers.length];
		for (int i = 0; i < singers.length * 2; i++) {
			int select = 0;
			System.out.print("1)" + singers[0] + " 2)" + singers[1] + " 3)" + singers[2]);
			System.out.print("\r투표번호 : ");
			select = sc.nextInt();
			
			if(select>singers.length) {
				System.out.println("무효표 처리 됐습니다.");				
			}
			else {
			index[select - 1] = index[select - 1] + 1;
			}
			
		}

		System.out.println("*************************************");
		for (int i = 0; i < singers.length; i++) {
			System.out.print(i + 1 + ") " + singers[i] + " : " + index[i] + "표\r");
		}

	}
}
