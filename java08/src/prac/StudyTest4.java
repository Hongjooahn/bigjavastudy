package prac;

import java.util.Scanner;

public class StudyTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] reserv = new int[5];
		for (int i = 0; i < reserv.length; i++) {
			reserv[i] = 0;
		}

		while (true) {
			System.out.println("\r------------콘도 예약을 진행합니다---------------");
			System.out.println("원하는 지역을 선택 해주세요(각지역은 2명까지 신청 가능)");
			System.out.println("-----------------------------------------");
			System.out.println("1)강원도   2)전라도   3)경상도   4)충청도   5)경기도");
			System.out.println("-----------------------------------------");
			for (int i = 0; i < reserv.length; i++) {
				System.out.print(reserv[i] + "       ");
			}
			System.out.println("\r=========================================");

			System.out.print("원하시는 지역코드를 입력해주세요 : ");
			int select = sc.nextInt();
			if(select==0) {
				System.out.println("종료합니다.");
				break;
			}
			else if (reserv[select-1] >= 0 && reserv[select-1] < 2) {
				System.out.println("신청 가능합니다.");
				System.out.println("신청이 완료됐습니다.");
				reserv[select-1]++;
			} else {
				System.out.println("이미 마감되었습니다.");
			}

		}
	}
}