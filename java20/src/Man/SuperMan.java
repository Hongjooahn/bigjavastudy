package Man;

public class SuperMan extends Man{
	Boolean lasor;
	Boolean fly;
	
	public SuperMan(int height, int weight, Boolean lasor, Boolean fly) {
		super(height, weight);
		this.lasor = lasor;
		this.fly = fly;
	}

	@Override
	public String toString() {
		return "SuperMan [lasor=" + lasor + ", fly=" + fly + ", height=" + height + ", weight=" + weight + "]";
	}
	
	

}
	