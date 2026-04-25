package ArrayList;
import java.util.ArrayList;
public class FrequencyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> List=new ArrayList<>();

		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		
		list.sort(null);
		System.out.println(list);
		
		int count=0;
		int count1=0;
		int count2=0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==1) {
				count++;
			}
			else if(list.get(i)==2) {
				count1++;
			}
			else if(list.get(i)==3) {
				count2++;
			}
		}
		
		List.add("1--> "+count);
		List.add("2--> "+count1);
		List.add("3--> "+count2);
		
		System.out.println( List);
	}

}
