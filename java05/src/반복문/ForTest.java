package 반복문;

public class ForTest {
		int check;				// 전역변수(Global)
	public static void main(String[] args) {
		
		int sum = 0,start = 1; // 지역변수(Local)
		
		for(start = 1; start<=10 ; start++){
			sum = sum+start;
			System.out.println(sum);			
		}
		System.out.println(start+"까지 진행됐다");
		System.out.println("1 부터 "+(start-1)+"까지의 합은"+sum+"입니다.");
		
	}

}
