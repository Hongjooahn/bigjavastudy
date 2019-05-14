package java19;

import java.util.HashSet;

public class TeamList {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("디자이너");
		hs.add("프로그래머");
		hs.add("DB관리자");
		hs.add("DB관리자");
		hs.add("DB관리자");
		
		System.out.println(hs);
		
		
		System.out.println("가방에 지갑이 있나요:"+hs.contains("DB관리자"));
		
		
	}

}
