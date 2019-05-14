package 스태틱;

public class Family {

	public static void main(String[] args) {
		FamilyInfo fi1 = new FamilyInfo("홍길동", 15);
		FamilyInfo fi2 = new FamilyInfo("고길동", 30);
		System.out.println("첫째 이름 : "+fi1.name+"/ 둘째 이름 : "+fi2.name);
		System.out.println("첫째 취미 : "+fi1.hobby+"/ 둘째 취미 : "+fi2.hobby);
		System.out.println("아부지 지갑엔 : "+FamilyInfo.daddyswallet+"원");
		
	}

}
