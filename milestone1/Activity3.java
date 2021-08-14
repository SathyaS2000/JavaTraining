package milestone1;
import java.util.*;

public class Activity3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i,j;
		int var=1,rvar=2;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j<n-i-1) {
					System.out.print(" ");
				}
				else {
					System.out.print(var);
					var++;
					if(var==10)
						var=0;
				}
			}
			if (var==1)
				rvar = 9;
			else
				rvar = var - 2;
			for(j=0;j<i;j++) {
				System.out.print(rvar);
				rvar--;
				if(rvar==-1)
					rvar=9;
			}
			System.out.println();
		}
	}
	
}
