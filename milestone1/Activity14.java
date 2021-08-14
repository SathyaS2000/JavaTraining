package milestone1;

public class Activity14 {
	public static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}
		return gcd(y,x%y);
	}
	public static void main(String[] args) {
		int x=43;
		int y=91;
		int z=183;
		int res=gcd(y-x,z-y);
		System.out.println("The greatest number that will divide 43,91 and 183 leaving same remainder is "+gcd(res,z-x));
	}
}
