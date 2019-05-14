package control;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String goodmorning = "오늘 아침에 대한 정보 출력";
		String cut = "-------------------------";
		System.out.println(goodmorning);
		System.out.println(cut);
		
		System.out.print("오늘 아침을 먹었습니까?(예,아니오) : ");
		String torf = sc.next();
		System.out.print("오늘 타고온 버스의 번호나 지하철 노선은 ? : ");
		int bus = sc.nextInt();
		System.out.print("어제 온도와 오늘 온도를 적어주세요 ? : ");
		Double tem = sc.nextDouble();
		Double tem2 = sc.nextDouble();
		System.out.print("앞으로 함께할 조원의 이름은 ? : ");
		String name = sc.next();
		
	}

}
