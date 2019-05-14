package 형변환;

public class 형변환테스트1 {

	public static void main(String[] args) {
		//기초형 형변환(type change)
		
		//큰것 = 작은것 (자동 형변환 : UpCasting)
		byte a = 127;
		int b = a;
		System.out.println(b);
		
		//작은것 = 큰것 (강제 형변환 : DownCasting)
		int c = 127;
		byte d = (byte) c;
		System.out.println(d);
		
		//참조형 형변환(클래스의 형변환)
		//상속관계에 있는 클래스들만 가능		
		//큰것(부모) = 작은것(자식) : 자동형변환(UpCasting)
		
//		Car car = new Car();
//		Truck truck = new Truck();		
		
//		car = truck;
//		truck = car;
		//작은것(자식) = 큰것(부모) : 강제형변환(DownCasting)
		
	}

}
