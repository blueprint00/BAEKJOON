import java.util.*;

public class Reverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		int[] arr = new int[1000000];
		
		str = sc.next(); int n = str.length();
		for(int i = 0;i < n; i ++){
			arr[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		
	}
}
