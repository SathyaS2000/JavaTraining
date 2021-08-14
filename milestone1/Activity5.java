package milestone1;
import java.util.*;
public class Activity5 {

	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 elements to calculate average");
		int sum=0;
		float average=0.0f;
		for(int i=0;i<10;i++) {
			num = sc.nextInt();
			sum+=num;
		}
		average = sum/10.0f;
		System.out.printf("Average is %.2f",average);
	}

}
