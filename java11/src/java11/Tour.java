package java11;

public class Tour {

	public static void main(String[] args) {
		Car car1 = new Car(); //
		car1.color = "검정색"; //
		car1.convert = true; // 맨아래 1줄짜리와 동일한 역할
		
		System.out.println(car1);
		car1.change();
		int exSpeed = car1.speedup(100);
		System.out.println(exSpeed + "로 속도를 Up");
		

		Car car2 = new Car("빨강", false); 
		System.out.println(car2);
		Car car3 = new Car("주황");
		System.out.println(car3);
		
	}

}