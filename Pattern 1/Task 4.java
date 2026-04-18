package Pattern1;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int row = 5;
		
		for(int  i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				
				if(i==1||i==row||j==1||j==row) {
				System.out.println("*");
				}else {
					System.out.println(" ");
				}
		}
			System.out.println();
		}
		
	}

}
