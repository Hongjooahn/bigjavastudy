package java20;

import java.util.Calendar;

public class Calandar_test {

	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.set(1994,4,24);
		System.out.println(today.get(Calendar.YEAR)+"년도"); // 연도 year
		System.out.println(today.get(Calendar.MONTH)+1+"월"); //달 0~11 month
		System.out.println(today.get(Calendar.DATE)+"일"); // 일 day
		System.out.println(today.get(Calendar.HOUR)+"시"); // 시 hour
		System.out.println(today.get(Calendar.MINUTE)+"분"); // 분 minute
		System.out.println(today.get(Calendar.SECOND)+"초"); // 초 second
		System.out.println(today.get(Calendar.DAY_OF_WEEK)+"번째 요일"); // 요일
		System.out.println(today.get(Calendar.AM_PM)+" /// 0이면 AM 1이면 PM"); //AM이냐 PM이냐 / 0:AM 1:PM
		
		  birth.set(1994, 3, 24);
		  
		  

		  // 1일 = 24 * 60 * 60
		  long diffSec = (today.getTimeInMillis() - birth.getTimeInMillis()) / 1000;       //초
		  long diffDay = diffSec/(60 * 60 * 24);                                                     //날
		  System.out.println("두 날자의 일 차이수 = " + diffDay);  
		 



		
//		System.out.println("내 나이는 : "+c.get(Calendar.YEAR)-birth.get(Calendar.YEAR)); 계산불가
		
		long mybir = today.getTimeInMillis() - birth.getTimeInMillis(); //계산은 getTimeInMillis()
		System.out.println("내 나이는 : "+((mybir/(1000*60*60*24))/365)+"살");
		System.out.println("내가 살아온 일은 : "+(mybir/(1000*60*60*24))+"일");
		System.out.println("내가 살아온 분은 : "+(mybir/(1000*60)/365)+"분");
		System.out.println("내가 살아온 초는 : "+(mybir/(1000)/365)+"초");
		//킹론상 맞지만 밀리 초 이기 때문에 오차 발생
		
		
		
		
		
		
		
	}
}
