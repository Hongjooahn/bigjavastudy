package control;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("1)짜장면,2)짬뽕,3)볶음밥 선택 ");
		int food = sc.nextInt();		
		
		if(food==1) {
			System.out.println("짜장면을 선택하였습니다");		
		}
		else if(food==2){
			System.out.println("짬뽕을 선택하였습니다");			
		}
		else if(food==3){		
			System.out.println("볶음밥을 선택하였습니다");
		}
		else {
			System.out.println("올바른 번호를 입력 하여 주세요");
		}	
	}
}
