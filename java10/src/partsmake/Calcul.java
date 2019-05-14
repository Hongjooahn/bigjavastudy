package partsmake;

public class Calcul {
	public int add(int x, int y) {
		return (x + y);
	}
	//변수 x y 두개 다 써야함
	public void add(int x, double y) {
		System.out.println(x + y);
		System.out.println("두번째 add");

	}
	public void add(String x, int y) {
		System.out.println(x + y);
		System.out.println("세번째 add");
		
	}
	
	

}
