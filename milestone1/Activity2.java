package milestone1;
import java.util.*;
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		Scanner sc  = new Scanner(System.in);
		Map<Integer, Integer> hashmap = new HashMap<Integer,Integer>();
		System.out.println("Enter the 10 elements");
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++)
        {
            int key = arr[i];
            if(hashmap.containsKey(key))
            {
                int freq = hashmap.get(key);
                freq++;
                hashmap.put(key, freq);
            }
            else
            {
                hashmap.put(key, 1);
            }
        }
		int maxfreq=0;
		for(Integer freq: hashmap.values()) {
			if(freq>maxfreq)
				maxfreq = freq;
		}
		System.out.println("The frequency of the maximum occurred element is "+maxfreq);
	}

}