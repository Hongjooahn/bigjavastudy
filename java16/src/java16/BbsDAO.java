package java16;

import java.util.ArrayList;

import java16.BbsDTO;

public class BbsDAO {
	public ArrayList selectAll() {
		BbsDTO b1 = new BbsDTO("100","java","fun java","fun java");
		BbsDTO b2 = new BbsDTO("200","jsp","fun jsp","fun jsp");
		BbsDTO b3 = new BbsDTO("300","Spring","fun Spring","fun Spring");
		BbsDTO b4 = new BbsDTO("400","android","fun android","fun android");
		ArrayList list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		
//		System.out.println(list);
//		System.out.println(list.get(0));
//		BbsDTO dto = (BbsDTO)list.get(0);
//		System.out.println(dto.getId());
//		System.out.println(dto.getTitle());
//		System.out.println(dto.getContent());
//		System.out.println(dto.getEtc());
		return list;
	}
}
