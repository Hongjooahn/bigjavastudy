package control;

import java.util.Date;

public class HelloDate {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		
		if(hour<12) {
			System.out.println("굿모닝");
		}
		else if(hour<17) {
			System.out.println("굿애프터 눈 ");
		}
		else if(hour<21) {
			System.out.println("굿이브닝");
		}
		else {
			System.out.println("굿나잇");
		}
		
		
		
	}

}
