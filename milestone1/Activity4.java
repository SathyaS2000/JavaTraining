package milestone1;
import java.util.*;
public class Activity4 {

	public static int fact(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		return num*fact(num-1);
	}
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		number = sc.nextInt();
		System.out.println(fact(number));
	}

}
