package java16;

import java.util.ArrayList;

public class MemberDAO {
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		// id pw name tel
		MemberDTO mdto1 = new MemberDTO("hong", "1234", "홍주안", "01012341234");
		MemberDTO mdto2 = new MemberDTO("jang", "4321", "장건희", "01000000000");
		MemberDTO mdto3 = new MemberDTO("kin", "1324", "김기훈", "01041514151");

		list.add(mdto1);
		list.add(mdto2);
		list.add(mdto3);

		return list;
	}

}
