package partsmake;

public class Phone {
//	클래스(부품)를 사용하는 방법
//
//	1.JDK안에 있는 4000개의 부품 이용
//	2.인터넷에서 다운로드 (mvnrepository , MVN)
//	3.직접 제작
//
//	EX) 전화기의 특징을 찾아서 부품을 만든다
//	전화기 => class
//	특징을 찾음(attribute, property)
//	정적특성 : 모양 크기 회사 -> 멤버변수
//	동적특성 : 전화하다, 문자보내다, 알람맞추다 -> 메소드
	String company = "사과";
	String shape = "네모";
	int size=11;
	
	public String call() {
		return "친구";
	}
	public void text() {
		System.out.println("문자하다");
	}
	public void alarm() {
		System.out.println("땡땡땡땡땡땡땡");
	}
	@Override
	public String toString() {
		return "Phone [toString()=" + super.toString() + "]";
	}
}
