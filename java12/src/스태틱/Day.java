package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	public Day() {
	}

	public Day(String doing, int time, String location) {

		this.doing = doing;
		this.time = time;
		this.location = location;
		
		count++;
		sum = sum + this.time;

	}

	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

	public void alltime() {
		System.out.println("전체 하는 일의 시간 : " + sum);
		System.out.println("평균 하는 일의 시간 : " + sum / count);
		double d = (double) sum / 24;
		System.out.println("몇일간 했나요 : " + d);
	}
}
