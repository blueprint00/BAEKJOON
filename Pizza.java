import java.util.*;

public class Pizza {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 토핑 갯수
		int priceD = sc.nextInt(); // 도우 가격
		int priceT = sc.nextInt(); // 토핑 가격
		int calD = sc.nextInt(); // 도우 열량
		//int[] calT = new int[n]; // 토핑 열량
		Integer[] calT = new Integer[n];
		
		for(int i = 0; i < n; i ++) calT[i] = sc.nextInt();
		Arrays.sort(calT, Collections.reverseOrder());
		/*for(int i = 0; i < n / 2; i ++){
			int tmp = calT[i];
			calT[i] = calT[n - 1 - i];
			calT[n - 1 - i] = tmp;
		} // 뒤집어주기...*/
		
		int sumC = calD; // 칼로리 합
		int sumP = priceD; // 가격 합
		double max = (double)sumC / sumP, sum = 0;
		
		for(int i = 0; i < n; i ++){
			//sumC += calT[i];
			//sumP += priceT;
			//sum = sumC / sumP;
			//if(max < sumC/sumP) max = sumC/sumP;
			//System.out.println(sumC + " " + sumP + " " + max);
			if((double)calT[i]/priceT > max){
				max = (double)(max * sumP + calT[i]) / (sumP + priceT);
				sumP += priceT;
			}else break;
		}
		System.out.println((int)max);
	}
}
