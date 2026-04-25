package ArrayList;
import java.util.ArrayList;
public class Removelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(2);
		
		System.out.println("Before " +list);
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i)==2) {
				list.remove(i);
			}
		}
		System.out.println("After "+list);
	}

}
