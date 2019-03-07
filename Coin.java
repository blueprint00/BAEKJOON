import java.util.*;

public class Coin {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] coin = new Integer[n];
		
		for(int i = 0; i < n; i ++){
			coin[i] = sc.nextInt();
		}
		
		Arrays.sort(coin, Collections.reverseOrder());
		
		int sum = 0; int cnt = 0;
		for(int i = 0; i < n; i ++){
			if(k < coin[i]) continue;
			
			sum += k / coin[i];
			k = k % coin[i];
			if(k > 0) cnt ++;
			if(k == 0) break;
		}
		System.out.println(sum);
	}
}
