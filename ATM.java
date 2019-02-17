//*
import java.util.Scanner;
import java.util.Arrays;

public class ATM {
	public static void main(String[] args){
		Scanner sc = null;
		//try{
			sc = new Scanner(System.in);
			
			int N = sc.nextInt(); // �ټ��ִ� ��� ��
			int[] P = new int[N]; // �� ����� �� �̴µ� �ɸ��� �ð�
			
			for(int i = 0; i < N; i ++){
				P[i] = sc.nextInt();
			}
			
			solution(N, P);
		//}
		//finally{
			if(sc != null) sc.close();
		//}
	}
	
	public static void solution(int N, int[] P){
		int min[] = new int[N]; // ��
		int sum = 0;
		
		for(int i = 0; i < N; i ++){
			int minIdx = i;
			for(int j = i + 1; j < N; j ++){
				if(P[minIdx] > P[j]) minIdx = j;
			}
			int tmp = P[i];
			P[i] = P[minIdx];
			P[minIdx] = tmp;			
		}
		//for(int i = 0; i < N; i ++) System.out.print(P[i] + " ");System.out.println("");
		//Arrays.sort(P);
		//for(int i = 0; i < N; i ++) System.out.print(P[i] + " ");System.out.println("");
		
		sum = min[0] = P[0];
		for(int i = 1; i < N; i ++){
			min[i] = min[i - 1] + P[i];
			sum += min[i]; 
		}
		System.out.println(sum);
	}
}//*/
/* ������
import java.util.Scanner;
import java.util.*;
public class Main {
   public static void main(String[] ar){
        int N, sum = 0, finSum = 0;
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            N = scanner.nextInt();
            int[] P = new int[N];
            
            for(int i=0; i<N; i++)
                P[i] = scanner.nextInt();
            
            Arrays.sort(P);
            
            for(int i=0; i<N; i++){
                finSum = finSum + sum + P[i];
                sum = sum + P[i];
            }
        } finally{
            if(scanner!=null)
                scanner.close();
        }
        System.out.println(finSum);
    }
}*/