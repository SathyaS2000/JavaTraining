package milestone1;
import java.util.*;

public class Activity8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the train");
		double len = sc.nextDouble();
		System.out.println("Enter the time taken to pass the man");
		double sec = sc.nextDouble();
		double relspeed = (len/sec*18.0/5.0);
		double speed = relspeed + 5;
		System.out.println("The speed of the train is "+speed+"kmph");
	}
}