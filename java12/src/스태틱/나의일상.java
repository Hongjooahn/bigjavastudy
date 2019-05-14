package 스태틱;

public class 나의일상 {
	public static void main(String[] args) {
		Day Day1 = new Day("자바공부",10,"강남");
		Day Day2 = new Day("여행",15,"강원도");
		Day Day3 = new Day("운동",20,"피트니스");
		System.out.println(Day1);
//		System.out.println(Day.count);
		System.out.println(Day2);
//		System.out.println(Day.count);
		System.out.println(Day3);
//		System.out.println(Day.count);
		Day1.alltime();
	}
}
