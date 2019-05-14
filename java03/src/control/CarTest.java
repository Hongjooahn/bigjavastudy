package control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result = 0;

		while (true) {
			System.out.print("속도를 입력해주세요(만점100점) : ");
			int speed = sc.nextInt();
			if (speed <= 100 && speed >= 0) {
				result = result + (speed * (0.5));
				break;
			} else {
				System.out.println("올바른 값을 입력해주세요");
			}
		}
		
//		
		while (true) {
			System.out.print("안정성를 입력해주세요(만점100점) : ");
			int compli = sc.nextInt();
			if (compli <= 100 && compli >= 0) {
				result = result + (compli * (0.3));
				break;
			} else {
				System.out.println("올바른 값을 입력해주세요");
			}
		}
//		
		while (true) {
			System.out.print("연비를 입력해주세요(만점100점) : ");
			int price = sc.nextInt();
			if (price <= 100 && price >= 0) {
				result = result + (price * (0.2));
				break;
			} else {
				System.out.println("올바른 값을 입력해주세요");
			}
		}

		if (result >= 80) {
			System.out.println((int)result + "점 -> 우수");
			JOptionPane.showMessageDialog(null, (int)result+"점 -> 우수합니다");
		} else if (result >= 70) {
			System.out.println((int)result + "점 -> 보통");
			JOptionPane.showMessageDialog(null, (int)result+"점 -> 보통입니다");
		} else {
			System.out.println((int)result + "점 -> 불량");
			JOptionPane.showMessageDialog(null, (int)result+"점 -> 불량합니다");
		}

	}

}
