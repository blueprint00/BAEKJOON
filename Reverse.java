import java.util.*;

public class Reverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		String[] arr = new String[1000000];
		
		str = sc.next(); int n = str.length();
		for(int i = 0;i < n; i ++){
			arr[i] = str.substring(i, i + 1);
		}
		
		int cnt = 0; int zero = 0; int one = 0;
		
		if(arr[0].equals("0")) zero ++;
		else one ++;
		
		for(int i = 0; i < n; i ++){
			if(!arr[i].equals(arr[i - 1])){
				if(arr[i].equals("0")) zero ++;
				else one ++;
			}
		}
		
		if(zero < one) System.out.println(zero);
		else System.out.println(one);
	}
}
