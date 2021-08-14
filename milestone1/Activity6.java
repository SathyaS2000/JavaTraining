package milestone1;
import java.util.*;

public class Activity6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter the string");
		str = sc.next();
		String newstr = new String();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(newstr.indexOf(ch)<0) {
				newstr+=ch;
			}
		}
		System.out.println("The resulting string is "+newstr);
	}
}
