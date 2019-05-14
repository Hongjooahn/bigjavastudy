package control;

import java.util.Date;

public class DayOfTheWeek {
	public static void main(String[] args) {
		Date date = new Date();

		int day = date.getDay();
		String dayname = null;

		switch (day) {
		case 1:
			dayname = "월요일";
			System.out.println(dayname + ": 학원가는날");
			break;
		case 2:
			dayname = "화요일";
			System.out.println(dayname + ": 친구 만나는날");
			break;
		case 3:
			dayname = "수요일";
			System.out.println(dayname + ": 운동하는날");
			break;
		case 4:
			dayname = "목요일";
			System.out.println(dayname + ": 게임하는날");
			break;
		case 5:
			dayname = "금요일";
			System.out.println(dayname + ": 맛있는 것 먹는 날");
			break;
		case 6:
			dayname = "토요일";
			System.out.println(dayname + ": 주말시작!");
			break;
		case 0:
			dayname = "일요일";
			System.out.println(dayname + ": 주말끝!");
			break;
		default:
			break;
		}

	}
}
