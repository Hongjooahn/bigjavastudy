package control;

import java.util.Date;

public class DayTest {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		int hour = d.getHours();
		int min = d.getMinutes();
		int sec = d.getSeconds();
		
		System.out.println("현재 시각은 ===>> "+hour+":"+min+":"+sec );
		
		
	}
}
