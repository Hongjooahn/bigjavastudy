package arraytest;

public class String_Array {
	public static void main(String[] args) {
		
		
		int[] ages = {50,100,10};
		String[] names = {"홍길동","박길동","김길동"	};
		names[2] = "김동길";
		names[names.length-1] = "김동순";
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		for (String imsi : names) {
			System.out.println(imsi);
		}
	}

}
