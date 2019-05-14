package 스태틱;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "DEF";
		// 메서드 정의 보기 ctrl + L click
		System.out.println(s1.charAt(1)); // 1 칸에 뭐가 있을까요 (B)
		System.out.println(s1.concat(s2)); // 문자 합치기
		System.out.println(s1.compareTo(s2)); // a와 d가 4가 차이납니다
		System.out.println(s1.equals(s2)); // 대소문자 인식하며 비교
		System.out.println(s1.equalsIgnoreCase(s2)); // 대소문자 무시하고 비교
		System.out.println(s1.isEmpty()); // 비어있나요 (""얘는 true " "얘는 false // 공백도 문자로 침)
		System.out.println(s1.length()); // 문자열의 길이
	}
}
