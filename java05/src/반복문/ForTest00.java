package 반복문;

public class ForTest00 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				if(j==0||j==9||i==0||i==9) {
				System.out.print("★");
				}
				else {
					System.out.print("◇");					
				}
				
				
			}
			System.out.println();

		}
			

	}

}
