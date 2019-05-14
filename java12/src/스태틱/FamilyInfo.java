package 스태틱;

import java.util.Random;

public class FamilyInfo {
	String name;
	int age;
	String hobby;
	static int daddyswallet = 10000;
	
	public FamilyInfo(String name, int age) {
		Random rd = new Random();
		
		this.name = name;
		this.age = age;
		int random = rd.nextInt(3);
		
		if(random == 0) {
			hobby = "놀아요";			
		}
		else if(random == 1) {
			hobby = "TV봐요";
		}
		else {
			hobby = "자요";
		}
		
		daddyswallet = daddyswallet - 1000;
		
	}

}
