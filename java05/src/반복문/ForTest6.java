package 반복문;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("계절을 입력해주세요 (1.봄 2.여름 3.가을 4.겨울) : ");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("봄입니다");
				break;
			} else if (select == 2) {
				System.out.println("여름입니다");
				break;
			} else if (select == 3) {
				System.out.println("가을입니다");
				break;
			} else if (select == 4) {
				System.out.println("겨울입니다");
				break;
			}
			System.out.println("올바른 계절을 다시 입력해주세요(1~4)");
		}

	}

}
