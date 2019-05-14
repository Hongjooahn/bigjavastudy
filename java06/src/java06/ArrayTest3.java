package java06;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] num = {444,666,777};
		
		int index = 0;
		index = num[0];
		num[0]=num[2];
		num[2]=index;
		//위치 변환
		
		
		System.out.println(num[0]);
		System.out.println(num[2]);
		
	}

}
