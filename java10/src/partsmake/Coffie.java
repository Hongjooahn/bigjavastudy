package partsmake;

public class Coffie {

	public static void main(String[] args) {
		Calcul cal = new Calcul();
		
		int result = cal.add(200, 200);
		cal.add("엄마", 1000);
		
		System.out.println(result - 1000+"원 입니다");
	}

}
