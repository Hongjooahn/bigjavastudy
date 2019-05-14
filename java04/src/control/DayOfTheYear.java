package control;

import java.util.Date;

public class DayOfTheYear {

	public static void main(String[] args) {
		Date date = new Date();
		
		int year = date.getYear();
		int leftyear = 0;
		
		year = year+1900;
		leftyear = 2222-year;
		System.out.println("현재 연도는 : "+year+"년");
		System.out.println("앞으로 2222년이 되려면 "+leftyear+"년 남았습니다.");
		
	}

}
