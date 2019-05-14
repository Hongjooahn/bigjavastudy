package java19;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap memberlist = new HashMap();
		Member m1 = new Member("Kim", 26 , '남' , "고양시", "01029527219");
		Member m2 = new Member("bora", 25 , '여' , "파주시", "01067867212");
		Member m3 = new Member("jang", 26 , '남' , "고양시", "01018181818");
		
		
		memberlist.put("m100", m1);
		memberlist.put("m200", m2);
		memberlist.put("m300", m3);
		
		for (int i = 0; i < memberlist.size(); i++) {
			
		}
		
		
	}

}
