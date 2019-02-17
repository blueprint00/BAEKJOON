import java.util.*;
//*
public class Chocolate {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = 1, cnt = 0, length= 0 ;
		int[] arr = new int[1000000];
		int sum = 0;
		
		while(n < k) {
			n = n * 2; // 최소 필요한 초콜릿조각
			length++;
		}
		
		if(n != k){ 
			int tmp = n;
			int i = 0;
			while((tmp = tmp / 2) > 0) arr[i ++] = tmp;
			
			for(i = 0; i < length; i ++){
				if((sum + arr[i]) <= k){
					sum += arr[i];
					cnt ++;
					if(sum == k) break;
				} else if ((sum + arr[i]) > k){
					if(i != n - 1) cnt++;
				}
			}
		} System.out.println(n + " " + cnt);
	}
}
/*
public class Chocolate{
	public static void main(String[] args){
		int K, chocolate = 1, pow = 0;
		int cut = 0;
		
		Scanner sc = new Scanner(System.in);
	}
}*/