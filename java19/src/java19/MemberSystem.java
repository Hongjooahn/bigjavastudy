package java19;

import java.util.HashMap;

public class MemberSystem {

	public static void main(String[] args) {
		HashMap member = new HashMap();

		member.put(100, "김데이");
		member.put(200, "김사전");
		member.put(300, "김구조");
		member.put(400, "김자료");
		System.out.println(member);

		member.remove(200);
		member.put(300, "김충성");
		System.out.println(member);

	}

}
