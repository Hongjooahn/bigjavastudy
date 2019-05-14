package java09;

public class DoubleArrayprac {

	public static void main(String[] args) {
		int[][]score = {{44,55,66},{77,88,99,100}};
		
		for(int i = 0 ; i<score.length ; i++) {
			for(int j = 0 ; j<score[i].length; j++) {
				System.out.println(i+1+"반은 "+score[i][j]+"명 입니다.");
				
			}
		}
	}

}
