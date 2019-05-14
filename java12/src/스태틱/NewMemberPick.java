package 스태틱;

public class NewMemberPick {

	public static void main(String[] args) {
		
		WorkerInfo wi1 = new WorkerInfo("홍아무개", "남", 3);
		WorkerInfo wi2 = new WorkerInfo("김아무개", "여", 6);
		WorkerInfo wi3 = new WorkerInfo("장아무개", "남", 10);
		
		System.out.println("전체 직원 수는 : "+WorkerInfo.count+"명");
		wi1.average();
		System.out.println("첫번째 직원의 나이는 : "+wi1.age+"살");
		System.out.println("전체 나이는 : "+WorkerInfo.sum+"살");
		
		System.out.println(wi1);
		System.out.println(wi2);
		System.out.println(wi3);
		
	}

}
