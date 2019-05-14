package arraytest;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int index = 0;
		for(int i = 0 ; i < 10 ; i++) {
		seat[i]=0;
		}		
		while(true) {
		System.out.println("**********************************************************************");
		for (int i = 0; i < 9; i++) {
			System.out.print(i + 1 + "\t");			
		}
		System.out.println("\r**********************************************************************");
		
		for(int i = 0 ; i < seat.length-1; i++) {			
			System.out.print(seat[i]+"\t");
		}
		System.out.println("\r**********************************************************************");
		
		System.out.print("계속하기 O,종료 X ==> ");
		String keep = sc.next();
		
		if(keep.equals("X")) {
			System.out.println("\r**********************************************************************");
			System.out.println("좌석 예매수 : "+index);
			System.out.println("전체 금액 : "+index*10000+"원");
			break;
		}
		
		System.out.print("예매할 번호를 입력해주세요 : ");

		int input = sc.nextInt();
		if (seat[input-1]!= 1) {
			seat[input-1] = 1;
			index++;
		}
		else {
			System.out.println("이미 예매가 됐습니다.");
		}
		
		
		
		}
}	
}
