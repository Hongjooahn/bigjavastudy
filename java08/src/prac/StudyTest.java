package prac;

import java.util.Scanner;

public class StudyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = {"자바","스프링","안드로이드","파이썬","제이쿼리"};
		int[] index = {0,0,0,0,0};
		int select = 0;
		
		while(true) {
		System.out.println("수강신청을 진행합니다.");
		System.out.println("원하시는 과목을 신청해주세요.");
		System.out.println("-----------------------------------------");
		for(int i = 0 ; i < name.length ; i++) {
			System.out.println(i+1+") "+name[i]);
		}
		System.out.println("-----------------------------------------");
		for(int i = 0 ; i < index.length ; i++) {
			System.out.print(index[i]+"   ");
		}
		
		System.out.println("\r=========================================");
		System.out.print("원하시는 과목(종료:0) : ");
		select = sc.nextInt();
		
		if(select==0) {
			System.out.println("신청을 종료합니다!! 안녕히 계세요!");
			break;
		}
		else if(index[select-1]==1) {
			System.out.println("신청 불가능합니다 !!  다른 번호를 입력해주세요!!\r");
		}
		else if(index[select-1]==0) {
			System.out.println("신청 가능합니다 ");
			index[select-1] = 1;
			System.out.println("신청 완료! \r ");
		}
		else {
			System.out.println("ERROR!!");
			break;
		}	
		
		
	
		
		}
	}

}
