import java.util.*;

public class Calc {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = 0; //���� ������ Ƚ��
		int n = sc.nextInt(); //�Է� ����
		int[] coe = new int[10000]; //��� ����迭
		
		for(int i = 0; i < n; i ++){
			coe[i] = sc.nextInt();
			if(coe[i] == 0){
				n ++; continue;
			} cnt ++; // +, = ����
		} sc.close();
		System.out.println(cnt + "/" + n);
		/*for(int i = 0; i < n/2; i ++){
			int tmp = coe[i];
			coe[i] = coe[n - 1 - i];
			coe[n - 1 - i] = tmp;
		} // �������ֱ�..
		
		for(int i = 0; i < n; i ++){
			if(i == 0){
				while(coe[i] > 0){
					cnt ++;
					coe[i] = coe[i] / 10;
				} // ��� �ڸ���
			} else { //����
				if(coe[i] != 0){
					cnt += 2 * i - 1; if(coe[i] > 1) cnt += 2; //���� ����� 2 �̻��� ��� 2�� (���, *) �߰�
					if(i == n - 2) {
						cnt ++;
						break;
					}
				}
			}
		}*/
		for(int i = 0; i < n; i ++){
			if(i == 0){ // �ְ����� �� ��
				if(n > 3){
					if(coe[i + 1] != 0){ // �ٷ� �� ������ �����ϸ�
						cnt ++; // �ϳ��� �Է��ص� ����
						//continue;
					} else cnt = cnt + 2 * (n - 1) - 1; 
				} else cnt = cnt + 2 * (n - 1) - 1;
			} else if(i == n - 1){ // ��� �� ��
				while(coe[i] > 0){
					cnt ++;
					coe[i] = coe[i] / 10;
				} //��� �ڸ���
			} else {
				if(coe[i] != 0){ // ����� �����ϸ�
					cnt += 2 * (n - 1 - i) - 1; //x����(i) + * ����(i - 1)
					if(coe[i] > 1) {
						while(coe[i] > 0){
							cnt ++;
							coe[i] = coe[i] / 10;
						} cnt ++; // *
					}
				}
			}
			System.out.println(i + " " + cnt);
		}
	}
}
