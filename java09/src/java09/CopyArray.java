package java09;

public class CopyArray {

	public static void main(String[] args) {
		int[] num = {1,2,3}; // 참조형 ->주소
		int num2 = 100; // 기본형 ->값
		
		
		int[] num4 = num; // num4 배열 선언후 num 배열을 가져다 복사
		System.out.println("num2 : "+num[1]);
		System.out.println("num4 : "+num4[1]);
		
		
		num[1] = 555;
		System.out.println("num : "+num[1]);
		System.out.println("num4 : "+num4[1]); 
		// 새로운 배열을 복사해서 만들었는데 참조(포인터)가 일어나
		// num4[1]의 값도 바뀐 모습이다 (얕은복사)

		
		int[] num5 = num.clone();
		num[1] = 242;
		System.out.println("num : "+num[1]);
		System.out.println("num5 : "+num5[1]);
		//완전히 값을 가져와 분리시켰다 (깊은복사)
	}

}
