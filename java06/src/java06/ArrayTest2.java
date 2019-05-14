package java06;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] hello = { 44, 66, 22, 88 };

		System.out.println("전체출력");
		for (int i = 0; i < hello.length; i++) {
			System.out.print(hello[i] + "  ");
		}

		System.out.println("값들의 개수 : " + hello.length);

		hello[0] = 55;

		System.out.println("전체출력");
		for (int i = 0; i < hello.length; i++) {
			System.out.print(hello[i] + "  ");
		}

	}

}
