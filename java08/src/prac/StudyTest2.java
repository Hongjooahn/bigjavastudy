package prac;

import java.util.Scanner;

public class StudyTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 이름 학년 학점
		String[] name = {"김아무개","박아무개","송아무개","정아무개","장아무개"};
		int[] gradelvl = {1,2,3,1,1};
		char[] grade = {'A','B','C','A','B'};
		System.out.println("동아리 명단의 이번학기 성적은 ? ");
		
		System.out.println("이름\t학년\t학점\t");
		System.out.println("=======================================");
		for(int i = 0 ; i<name.length; i++ ) {
			System.out.println(name[i]+"\t"+gradelvl[i]+"\t"+grade[i]+"\t\r");
		}	//동아리 명단 출력
		
		int[] gradelvlindex = {0,0,0,0};
		int[] gradeindex = {0,0,0,0,0};
		
		System.out.println("전체 인원은 ? : "+name.length);
		
		for(int i = 0 ; i < name.length ; i++) {
			switch (gradelvl[i]) {
			case 1:				
				gradelvlindex[0]++;
				break;
			case 2:				
				gradelvlindex[1]++;
				break;
			case 3:				
				gradelvlindex[2]++;
				break;
			case 4:				
				gradelvlindex[3]++;
				break;
			default:
				break;
			}
			
			switch (grade[i]) {
			case 'A':				
				gradeindex[0]++;
				break;
			case 'B':				
				gradeindex[1]++;
				break;
			case 'C':				
				gradeindex[2]++;
				break;
			case 'D':				
				gradeindex[3]++;
				break;
			case 'F':				
				gradeindex[4]++;
				break;
			
			default:
				break;
			}
			//학년 학점 숫자 세기
		}
		
		for(int i = 0 ; i < gradelvlindex.length;i++) {
			System.out.println(i+1+"학년 : "+gradelvlindex[i]+"명");			
		}
		
		char[]abc = {'A','B','C','D','F'};//int->char 형변환 안하려고 배열 선언
	
		for(int i = 0 ; i < gradeindex.length;i++) {
		
			System.out.println(abc[i]+"학점 "+gradeindex[i]+"명");			
		}
		
		// 세었던 숫자들 출력
		
		System.out.print("정보를 찾을 이름을 입력해주세요 : ");
		String namesearch = sc.next();
		int index = 0;
		for(int i = 0 ; i < name.length ; i++) {
			if(namesearch.equals(name[i])) { //문자형 비교때 equals
				index = i;
			}
		}
		System.out.println(name[index]+"의 위치는 "+index);
		System.out.println("학년은 : "+gradelvl[index]);
		System.out.println("학점은 : "+grade[index]);
	}

}
