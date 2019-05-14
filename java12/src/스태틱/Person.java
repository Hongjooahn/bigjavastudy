package 스태틱;

public class Person {
	int height;
	int weight;
	String secret;
	String address;
	double goodweight;

	public Person(int height, int weight, String secret, String address) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
		this.address = address;
		
	}

	public Person(int height, int weight, String secret) {
	}

	public double getWeight() {
		
		return weight;
	}

	public String getSecret(double b) {
		double a;
		a = (weight * 0.9)-100;
			if(b+10>weight) {
				return("비만입니다.");
			}
			else if(b-10<weight){
				return("경량입니다.");
			}
			else {
				return("정상입니다.");
			}
	}

}
