package java06;

public class ArrayTest4 {

	public static void main(String[] args) {

		double[] sight = { 1.0, 1.5, 2.0, 0.05, -1.5 };
		char[] sex = { '남', '여', '남', '남', '여' };
		char[] grade = { 'A', 'F', 'B', 'B', 'C' };
		String[] name = { "홍길동", "김민아", "강감찬", "을지문덕", "잔다르크" };
		int[] score = { 100, 40, 80, 85, 75 };

		for (int i = 0; i < sight.length; i++) {
			System.out.print(sight[i]+",");
		}
		System.out.println();
		for (int i = 0; i < sex.length; i++) {
			System.out.print(sex[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"  ");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+"점");
		}
		System.out.println();

	}

}
