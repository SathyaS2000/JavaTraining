package milestone1;
import java.util.*;

public class Activity9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of votes");
		double totalvotes = sc.nextInt();
		double validvotes = totalvotes * 80/100;
		double votesforsecondcandidate = validvotes * 45/100;
		System.out.println("The votes obtained by second candidate is "+(int)votesforsecondcandidate);
	}
}