package 스태틱;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person(170, 70, "눈병");
		Person p2 = new Person(180,100,"비만","고양시 덕양구 화정동");
		
		System.out.println(p1.getSecret(p1.getWeight()));
		
	}

}
