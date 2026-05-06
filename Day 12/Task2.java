package Assignment12;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
	
String s1="aabbbccccdd";


int count=1;
char temp=s1.charAt(0);

for(int i=1;i<s1.length();i++) {
	if(temp==s1.charAt(i)) {
		count++;
	}
	else {
		System.out.println(temp+"->"+count);
		temp=s1.charAt(i);
		count=1;
	}
	
}
System.out.println(temp+"->"+count);


	}

}