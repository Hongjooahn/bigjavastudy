package data;

import java.util.Scanner;

public class Me2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("당신의 취미는 ? : ");
		String hobby = sc.next();
		System.out.print("평소 TV시청 시간은?(시간) : ");
		int time = sc.nextInt();
		System.out.print("봄 여행을 다녀왔나요?(예,아니오) : ");
		String result = sc.next();
		
		System.out.print("제 취미는 "+hobby+"이고");
		System.out.print(time>= 3 ? "시간 씩이나 봐요":"밖에 보지 않아요");
		System.out.print(result == "예" ? "봄 여행은 true에요.":"봄 여행은 false에요.");
		
	}
	
}
