package java16;

import java.util.ArrayList;

public class MemberDAOUser2 {

	public static void main(String[] args) {
		BbsDAO2 dao = new BbsDAO2();
		ArrayList list = dao.selectAll();

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));			
//		}

		for (int i = 0; i < list.size(); i++) {
			BbsDTO dto = (BbsDTO) list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getEtc());
			System.out.println();

		}

	}

}
