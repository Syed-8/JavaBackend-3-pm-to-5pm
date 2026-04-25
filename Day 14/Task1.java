package Map_set;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {

		ArrayList<String> email = new ArrayList<>();
		
				email.add("kishore@gmail.com");
				email.add("abdullah@gmail.com");
				email.add("surra@gmail.com");
				email.add("abdullah@gmail.com");
				email.add("ifaa@gmail.scom");

		Set<String> uniqueEmails = new HashSet<>(email);

		System.out.println(uniqueEmails);
}
}