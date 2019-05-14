package java09;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] num = {11,33,22,55,44,66,77,99}; // 참조형 ->주소
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"  ");			
		}
		
		
	}

}
