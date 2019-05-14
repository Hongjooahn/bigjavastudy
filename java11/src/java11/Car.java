package java11;

public class Car {
	
	String color;
	boolean convert; //<--멤버변수, 전역변수
	

	public Car() {
		System.out.println("객체 생성시 초기화 할 처리를 실행");
	}
	
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, boolean convert) {
		this.color = color;
		this.convert = convert;
	}
	
	public void change() {
		System.out.println("기어변속");
	}
	public int speedup(int speed) {//<--매개변수(파라메터)
		return speed+30;
	}
	
	public static void main(String[] args) {
		
	}
	
	public String toString() {
		return "Car [color=" + color + ", convert=" + convert + "]";
		//객체 이름[안에 속성 값1,값2]
	}

}
