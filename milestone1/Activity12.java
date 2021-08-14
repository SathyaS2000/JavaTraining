package milestone1;
import java.util.*;

public class Activity12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime number");
		int n = sc.nextInt();
		boolean flag = true;
		if(n==1 || n==0)
			System.out.println("Not a Prime number");
		else if(n==2) {
			System.out.println("Prime number");
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println("Not a Prime number");
					flag = false;
					break;
				}
			}
			if(flag == true)
				System.out.println("Prime number");
		}
	}
}
