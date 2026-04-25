package Map_set;
import java.util.*;

public class Task3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String s = "aabbc";

		        ArrayList<Character> list = new ArrayList<>();
		        ArrayList<String> outList = new ArrayList<>();

		        // store characters in list
		        for(int i = 0; i < s.length(); i++) {
		            list.add(s.charAt(i));
		        }

		        System.out.println(list);

		        // main logic
		        for(int i = 0; i < list.size(); i++) {

		            int count = 0;

		            // count frequency
		            for(int j = 0; j < list.size(); j++) {
		                if(list.get(i) == list.get(j)) {
		                    count++;
		                }
		            }

		            // check already added
		            boolean alreadyAdded = false;

		            for(int k = 0; k < i; k++) {
		                if(list.get(i) == list.get(k)) {
		                    alreadyAdded = true;
		                    break;
		                }
		            }

		            if(!alreadyAdded) {
		                outList.add(list.get(i) + " --> " + count);
		            }
		        }

		        System.out.println(outList);
		    }
		}
	