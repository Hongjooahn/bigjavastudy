package 형변환;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("나는 스트링"); // String(자식) -> Object(부모)
		list.add(100);

		System.out.println(list);
		String name = (String)list.get(0); // Object -> String
		

	}

}
