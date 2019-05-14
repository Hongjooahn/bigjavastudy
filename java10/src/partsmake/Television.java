package partsmake;

public class Television {

	boolean power = false;
	int size = 10;
	String color = "무색";

	public void changeChannel() {
		System.out.println("채널을 변경합니다.");
	}

	public void sound() {
		System.out.println("소리 조절합니다.");
	}

	public void connect() {

	}
	public String toString() {
		return power + " "+ size + " " + color;
	}
	
	
}
