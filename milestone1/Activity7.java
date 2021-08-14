package milestone1;
import java.util.*;

public class Activity7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed=0;
		int seconds =0;
		System.out.println("Enter the speed of the train");
		speed = sc.nextInt();
		System.out.println("Enter the time taken to cross the pole");
		seconds = sc.nextInt();
		double length = speed*5.0/18.0*seconds;
		System.out.println("The length of the train is "+length+"m");
	}
}
