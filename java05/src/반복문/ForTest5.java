package 반복문;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + " = " + (i * j) + " ");
			}
			System.out.println();
		}
	}
}
