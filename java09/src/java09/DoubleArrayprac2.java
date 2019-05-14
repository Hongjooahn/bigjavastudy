package java09;

import java.util.Scanner;

public class DoubleArrayprac2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] seat = new int[3][10];

		while (true) {
			System.out.println("───┬────────────────────────────────────────────────────┐");
			System.out.print("   │  ");
			for (int i = 0; i < seat[0].length-1; i++) {
				System.out.print(i + 1 + "    ");
			}
			System.out.print("10   │");
  
			System.out.println("\r───┼────────────────────────────────────────────────────┤");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  │  ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "    ");
				}
				System.out.println("│");
			}
			System.out.println("───┴────────────────────────────────────────────────────┘");
			int halt;
			
			while (true) {
				System.out.print("실행/종료(1/0) : ");
				int do_halt = sc.nextInt();
				if (do_halt != 0 && do_halt != 1) {
					System.out.println("올바른 값을 입력해주세요!");
				}
				else {
					halt = do_halt;
					break;
				}
			}
			
			
			if (halt == 0) {
				System.out.println("시스템 종료!!");
				break;
			}

			System.out.print("행을 입력해주세요 : ");
			int row = sc.nextInt();
			System.out.print("열을 입력해주세요 : ");
			int col = sc.nextInt();

			seat[row - 1][col - 1] = seat[row - 1][col - 1] + 1;

			System.out.println("예약완료!");
		}

	}
}