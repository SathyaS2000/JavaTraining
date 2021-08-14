package milestone1;

public class Activity10 {
	public static void main(String[] args) {
		int i=8;
		int val = i*i;
		while(true) {
			val = i*i;
			if(val%21==0 && val%36==0 && val%66==0)
				break;
			i++;
		}
		System.out.println(val);
	}
}
