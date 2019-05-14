package Car;

public class Truck extends Car {
	int weight;
	int length;

	public Truck() {
//		super();  // 안에 super가 숨어있어요.
		System.out.println("트럭객체 생성");
		
	}

	public Truck(int weight, int length) {
		super();	// 자식클래스 생성시 부모의 기본생성자를 무조건 호출하게 되어있다.
		this.weight = weight;
		this.length = length;
	}

	public Truck(String color, int speed, int weight, int length) {
		super(color, speed);
		this.weight = weight;
		this.length = length;
	}	
	
}
