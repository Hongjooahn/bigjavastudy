package control;

import java.util.Random;
import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int target = random.nextInt(100);// 0~99범위 100개
		int count = 1;

		while (true) {
			
			System.out.print("생각한 숫자를 입력해주세요 ==> ");
			int guess = sc.nextInt();

			if (target == guess) {
				System.out.println("정답입니다!!\r"+count+"번 만에 맞추었습니다!!");
				break;
			}

			else {
				if (target > guess) {
					System.out.println("정답보다 작습니다\r");
				} else if (guess > target) {
					System.out.println("정답보다 큽니다\r");
				}
			count = count + 1;
			}//else

		} //while

	}
}
