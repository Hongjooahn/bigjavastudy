package java16;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) { // 순서가 중요함
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		int size = list.size();
		System.out.println("리스트의 개수는 "+ size);
		System.out.println(list); //toString 재정의
		list.remove(1);
		System.out.println(list); //toString 재정의
		list.add(1, "new인물");
		System.out.println(list); //toString 재정의
		list.set(1, "old인물");
		System.out.println(list); //toString 재정의
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+"등 :"+list.get(i));			
		}
//		list.remove(0);
//		System.out.println(list); //toString 재정의
//		list.remove(1);	     // 주소로 지움
//		System.out.println(list); //toString 재정의
//		list.remove("정스키"); // 값으로 지움
//		System.out.println(list); //toString 재정의
//		
	}

}
