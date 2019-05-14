package jdbc;

import javax.swing.JOptionPane;

public class Search {

	public static void main(String[] args) throws Exception {
		MemberDAO db = new MemberDAO();
		String id = JOptionPane.showInputDialog("ID 입력");
		String[] mem = db.select(id);
		for(String s: mem){
		System.out.println(s);
		}
		db.select(id);
	}

}
