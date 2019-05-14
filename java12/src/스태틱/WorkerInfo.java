package 스태틱;

public class WorkerInfo {
	String name;
	String sex;
	int age;
	
	static int sum;
	static int count;
	
	public WorkerInfo(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		count++;
		sum = sum+age;
	}
	public void average() {
		int avg = sum/count;
		System.out.println("직원들의 평균 나이 : "+avg);
	}
	@Override
	public String toString() {
		return "WorkerInfo [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
