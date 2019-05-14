package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cut = "------------------------";

		System.out.println("저기요!!\r" + cut);
		System.out.println("메뉴를 고르세요");
		while (true) {
			System.out.println(cut +"\r1)짜장면,2)짬뽕,3)볶음밥 \r" + cut);
			System.out.print("당신의 선택은 ? \r");
			int food = sc.nextInt();

			if (food == 1) {
				System.out.println("짜장면을 선택하였습니다");
			} else if (food == 2) {
				System.out.println("짬뽕을 선택하였습니다");
			} else if (food == 3) {
				System.out.println("볶음밥을 선택하였습니다");
			} else {
				System.out.println("올바른 번호를 입력 하여 주세요");
			}

		} // while
	}
}
