package control;

import java.util.Date;

public class DayOfMonth {
	public static void main(String[] args) {
		
		Date date = new Date();
		int month = date.getMonth()+1;
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println("31일까지 있는 달입니다.");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("30일까지 있는 달입니다.");
			break;
		case 2:
			System.out.println("28일까지 있는 달입니다.");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
		
		
	}
}
