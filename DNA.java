import java.util.*;
/*
public class DNA {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dLength = sc.nextInt();
		String[] dna = new String[n];
		String str = new String();
		
		for(int i = 0; i < n; i ++) dna[i] = sc.next();
		
		int cnt = 0; int s = 0;
		for(int i = 0; i < n; i ++){
			for(int j = i; j < n - i - 1; j ++){
				for(int k = 0; k < dLength; k ++){
					if(i == j) continue;
					else {
						if(dna[i].charAt(k) != dna[j].charAt(k)){
							cnt ++;
						}
					}//else
				}//for k
				if(cnt < s){
					s = cnt;
					str = dna[i];
				}
				//System.out.println(s);
			}//for j
		}//for i
		System.out.println(s);
	}//main
}
*/

public class DNA{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0, hd = 0;
		String[] dna = new String[n];
		for(int i = 0; i < n; i ++) dna[i] = sc.next();
		
		for(int i = 0; i < m; i ++){
			int a = 0, t = 0, g = 0, c = 0;
			for(int j = 0; j < n; j ++){
				switch(dna[j].charAt(i)){
					case 'A' : a ++; break;
					case 'T' : t ++; break;
					case 'G' : g ++; break;
					case 'C' : c ++; break;
				}
			}
			max = Math.max(a > c? a : c, g > t? g : t);
			hd += (n - max);
			System.out.print(toChar(a, t, g, c, max));
		}
		System.out.println("\n" + hd);
	}

	private static char toChar(int a, int t, int g, int c, int max) {
		if (max == a) return 'A';
		else if(max == c) return 'C';
		else if(max == g) return 'G';
		else return 'T';
	}

}