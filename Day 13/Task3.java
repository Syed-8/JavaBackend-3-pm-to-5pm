package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the K");
		int k= sc.nextInt();
		
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.sort(null);
		System.out.println(list);
		
		int size = list.size();
		int temp;
		for (int i=0;i<=k;i++) {
			temp=list.get(size-1);
			list.remove(size-1);
			list.add(0, temp);
		}
		System.out.println(list);
		
	}

}
