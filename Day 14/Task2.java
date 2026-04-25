package Map_set;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,4,6,7,9};
		int N= 10;
		
		Set<Integer> set = new HashSet<>();
		
		for(int num :arr) {
			set.add(num);
		}
		
		for(int i=0;i<=N;i++) {
			if(!set.contains(i)) {
				System.out.println(i+" ");
			}
		}
	
	} 
}
