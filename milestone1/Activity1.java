package milestone1;
import java.util.*;
public class Activity1 {

	public static void main(String[] args) {
		
		int [] arr = new int[25];
		Scanner sc = new Scanner(System.in);
		int max=0;
		System.out.println("Enter the 25 elements");
		for(int i=0;i<25;i++) {
			arr[i]=sc.nextInt();
			if(i==0) {
				max=arr[i];
			}
			else {
				if(max<arr[i])
					max=arr[i];
			}
		}
		System.out.println("The maximum value is "+max);

	}

}
