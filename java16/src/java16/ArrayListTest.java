package java16;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		
		System.out.println(list);
		System.out.println("2등 "+list.get(1)+" 반칙으로 인하여 탈락");
		
		
		
		
	}

}
