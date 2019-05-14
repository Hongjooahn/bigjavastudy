package control;

import java.util.Random;
import java.util.Scanner;

public class Rsp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int com = random.nextInt(3);
		int win = 0;
		String comrsp = null;
		String humrsp = null;

		do {

			System.out.print("가위 바위 보를 하겠습니다\r 0)가위 1)바위 2)보  =>");
			int human = sc.nextInt();

			if ((com == 0 && human == 1) || (com == 1 && human == 2) || (com == 2 && human == 0)) {
				win = 0;
			} else if ((com == 0 && human == 0) || (com == 1 && human == 1) || (com == 2 && human == 2)) {
				win = 1;
			} else if ((com == 0 && human == 2) || (com == 1 && human == 0) || (com == 2 && human == 1)) {
				win = 2;
			}

			if (com == 0) {
				comrsp = "가위";
			} else if (com == 1) {
				comrsp = "바위";
			} else if (com == 2) {
				comrsp = "보";
			}
			// 컴퓨터

			if (human == 0) {
				humrsp = "가위";
			} else if (human == 1) {
				humrsp = "바위";
			} else if (human == 2) {
				humrsp = "보";
			}

			if (win == 0) {
				System.out.println("컴퓨터:" + comrsp + " / 나:" + humrsp + "  ===>승리!!");
			} else if (win == 1) {
				System.out.println("컴퓨터:" + comrsp + " / 나:" + humrsp + "  ===>무승부!! 다시!!");
			} else if (win == 2) {
				System.out.println("컴퓨터:" + comrsp + " / 나:" + humrsp + "  ===>패배!!");
			}

		} while (win == 1);
	}
}
