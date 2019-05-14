package 반복문;

public class WhileTest01 {

	public static void main(String[] args) {
		
		int start = 1;
		int sum = 0; 
		while(start<=10) {
			sum=sum+start;
			System.out.println("start: "+start);
			System.out.println("sum: "+sum+"\r");
			start=start+1;			
			
		}
		
		 System.out.println("Last : "+sum);
	}

}
