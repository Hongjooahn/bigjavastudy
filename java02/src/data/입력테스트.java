package data;

import java.util.Scanner;

public class 입력테스트 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
//		System.out.print("이름이 무엇입니까 ? >> ");
//		String name = sc.next();
//		System.out.println("이름은 : "+name);
		
		
		System.out.print("당신의 이름은? : ");
		String name = sc.next();
		System.out.print("당신의 태어난 연도? : ");
		int born = sc.nextInt();
		int age = 2019 - born + 1;
		System.out.print("당신의 관심과목은? : ");
		String grade = sc.next();
		
		System.out.println(name+"님은 "+age+"살 이고, "+grade+"에 관심 있습니다.");
	}
}
