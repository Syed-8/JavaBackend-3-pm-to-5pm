package Pattern1;

public class Increase_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5; // user input
		
		for (int i=1;i<=n;i++) //loop for a each rows (controls new )
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
		}
			System.out.println();
		}
	}

}
