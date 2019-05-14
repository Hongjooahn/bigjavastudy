package arraytest;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] maximum = {66,77,88,99,42,68};
		int index = 0;
		for(int i = 0; i<maximum.length ; i++) {
			System.out.print(maximum[i]+" ");
			if(index<maximum[i]) {
				index = maximum[i];
			}
		}
		System.out.println("최대값은 : "+index+"입니다.");
		
		index = maximum[0];
		maximum[0]= maximum[3];
		maximum[3] = index;
		
		for(int i = 0; i<maximum.length ; i++) {
			System.out.print(maximum[i]+" ");		
			}		
		
		}	
}
