package java17;

public class SuperMan extends Man{
	//정적속성
	boolean fly;
	
	//동적속성
	public void flyspeed() {
		sleep();
		System.out.println("500으로 날아요");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", eye=" + eye + ", height=" + height + ", weight=" + weight + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
