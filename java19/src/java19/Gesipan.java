package java19;

import java.util.LinkedHashMap;

public class Gesipan {

	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		Gay g1 = new Gay("안녕", "오늘 지각함", "게시판이용자", "호이호이");
		Gay g2 = new Gay("왜지각했어", "열심히해", "충고만100년", "둘리둘리");
		Gay g3 = new Gay("윗사람", "지각가지고 인생포기라니", "선비", "천자문");
		map.put(100, g1);
		map.put(200, g2);
		map.put(300, g3);
		
		for (int i = 1; i < map.size()+1; i++) {
			System.out.println(map.get(i*100));
		}
		
		
	}

}
