import java.util.*;

public class Pizza {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ���� ����
		int priceD = sc.nextInt(); // ���� ����
		int priceT = sc.nextInt(); // ���� ����
		int calD = sc.nextInt(); // ���� ����
		//int[] calT = new int[n]; // ���� ����
		Integer[] calT = new Integer[n];
		
		for(int i = 0; i < n; i ++) calT[i] = sc.nextInt();
		Arrays.sort(calT, Collections.reverseOrder());
		/*for(int i = 0; i < n / 2; i ++){
			int tmp = calT[i];
			calT[i] = calT[n - 1 - i];
			calT[n - 1 - i] = tmp;
		} // �������ֱ�...*/
		
		int sumC = calD; // Į�θ� ��
		int sumP = priceD; // ���� ��
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
