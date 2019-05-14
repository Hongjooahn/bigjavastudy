package java17;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sman = new SuperMan();
		sman.height = 200; // person
		sman.weight = 100; // person
		sman.eye = 3;
		sman.fly = true;
		
		sman.eat();
		sman.sleep();
		sman.army();
		sman.flyspeed(); 
		System.out.println(sman);
	}

}
