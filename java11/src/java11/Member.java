package java11;

import java.util.Arrays;
import java.util.Scanner;

public class Member {

	String[] name = new String[3];
	int[] age = new int[3];
	String[] phone = new String[3];
	String[] address = new String[3];
	
	
	public void member_in() { 
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("\r--- 가입할 정보 입력 ---");
			System.out.print("이름 : ");
			this.name[i] = sc.next();
			System.out.print("나이 : ");
			this.age[i] = sc.nextInt();
			System.out.print("전화 : ");
			this.phone[i] = sc.next();
			System.out.print("주소 : ");
			this.address[i] = sc.next();	
			
		}	
	}
	public void member_out() {
		System.out.println("=====================================");
		System.out.println("이름\t나이\t연락처\t주소");
		System.out.println("-------------------------------------");
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println(name[i]+"\t"+age[i]+"\t"+phone[i]+"\t"+address[i]);
		}
	}
	
	public String toString() {
		return "Member \r[name=" + Arrays.toString(name) 
		+ "\r age=" + Arrays.toString(age) + "\r phone="
		+ Arrays.toString(phone) + "\r address=" + Arrays.toString(address) + "]";
	}


}