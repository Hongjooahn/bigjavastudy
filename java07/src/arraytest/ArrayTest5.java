package arraytest;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[] java = new int[3];
		int[] spring = new int[3]; 

		for (int i = 0; i < name.length; i++) {
			System.out.print("학생 이름 입력: ");
			name[i] = sc.next();
			System.out.print("학생점수(자바): ");
			java[i] = sc.nextInt();
			System.out.print("학생점수(스프링): ");
			spring[i] = sc.nextInt();
			System.out.println("");
		}
		System.out.println("*************************************");

		int[] index1 = {0,0};
		int[] index2 = {100,0};
		System.out.print("세 학생의 이름은 "+name[0]+", "+name[1]+", "+name[2]);
		
		for (int i = 0 ; i < java.length ; i++) {
			if (index1[0]<java[i]) {
				index1[0]=java[i];
				index1[1]=index1[1]+1;
			}
		}
		for (int i = 0 ; i < spring.length ; i++) {
			if (index2[0]>spring[i]) {
				index2[0]=spring[i];
				index2[1]=index2[1]+1;
			}
		}
		System.out.println("\r학생 점수중 제일 높은 자바 점수는 : "+index1[0]+" / 이름 : "+name[index1[1]-1]);
		System.out.println("학생 점수중 제일 낮은 스프링 점수는 : "+index2[0]+" / 이름 : "+name[index2[1]-1]);

	}
}
