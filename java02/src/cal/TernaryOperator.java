package cal;

public class TernaryOperator {
	public static void main(String args[]) {
		
		char sex = '남';
		System.out.println("삼항연산자 출력");
		System.out.println(sex=='남'? "남자입니다.":"여자입니다");
		System.out.println("----------------------");
		
		int hour = 4;
		int min = 17;
		int tem = 25;
		
		System.out.println("지금은 "+hour+"시 "+min+"분  입니다.");
		System.out.println("오늘의 기온은 "+tem+"도 입니다.");
		System.out.println(tem >= 30 ? "오늘은 정말 덥습니다." : "오늘은 덥진 않겠습니다.");
		System.out.println("----------------------");
		
		
		
	}
}
