package cal;

public class ThreeHundered {
	public static void main(String args[]) {
		int first = 200;
		int second = 100;
		
		if((first+second)>300) {
			System.out.println(first+second-100);
		}
		else {
			System.out.println((first+second)*0.1);		
		}			
		
		
		System.out.println("\n-----------------------\r");
		System.out.println("정수 400이 짝수일까요?");
		int third = 400;
		
		if(third%2==0) {
			System.out.println("맞습니다");
		}
		else {
			System.out.println("아닙니다");			
		}
		
	}
}


