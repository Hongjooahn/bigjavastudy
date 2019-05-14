package partsmake;

public class MyRoom {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		
		p1.alarm();
		p1.alarm();
		
		System.out.println("TV1 =====================================");
		Television t1 = new Television();
		
		t1.color = "검정색";
		t1.power = true;
		t1.size = 50;
		System.out.println(t1.color);
		System.out.println(t1.power);
		System.out.println(t1.size);
		t1.changeChannel();
		t1.connect();
		t1.sound();
		
		System.out.println("TV 2 ===================================");
		
		Television t2 = new Television();
		System.out.println(t2.color);
		System.out.println(t2.power);
		System.out.println(t2.size);
		System.out.println(t2+"\rToString으로 위 println3개를 합친다.");
		
		Calcul c1 = new Calcul();
		
		c1.add(5, 5.5);
		c1.add(5, 6.5);;
	}
	
}
