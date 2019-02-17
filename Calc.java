import java.util.*;

public class Calc {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = 0; //계산기 누르는 횟수
		int n = sc.nextInt(); //입력 갯수
		int[] coe = new int[10000]; //계수 저장배열
		
		for(int i = 0; i < n; i ++){
			coe[i] = sc.nextInt();
			if(coe[i] == 0){
				n ++; continue;
			} cnt ++; // +, = 갯수
		} sc.close();
		System.out.println(cnt + "/" + n);
		/*for(int i = 0; i < n/2; i ++){
			int tmp = coe[i];
			coe[i] = coe[n - 1 - i];
			coe[n - 1 - i] = tmp;
		} // 뒤집어주기..
		
		for(int i = 0; i < n; i ++){
			if(i == 0){
				while(coe[i] > 0){
					cnt ++;
					coe[i] = coe[i] / 10;
				} // 상수 자릿수
			} else { //변수
				if(coe[i] != 0){
					cnt += 2 * i - 1; if(coe[i] > 1) cnt += 2; //변수 계수가 2 이상일 경우 2번 (계수, *) 추가
					if(i == n - 2) {
						cnt ++;
						break;
					}
				}
			}
		}*/
		for(int i = 0; i < n; i ++){
			if(i == 0){ // 최고차수 일 때
				if(n > 3){
					if(coe[i + 1] != 0){ // 바로 전 차수가 존재하면
						cnt ++; // 하나만 입력해도 가능
						//continue;
					} else cnt = cnt + 2 * (n - 1) - 1; 
				} else cnt = cnt + 2 * (n - 1) - 1;
			} else if(i == n - 1){ // 상수 일 때
				while(coe[i] > 0){
					cnt ++;
					coe[i] = coe[i] / 10;
				} //상수 자릿수
			} else {
				if(coe[i] != 0){ // 계수가 존재하면
					cnt += 2 * (n - 1 - i) - 1; //x갯수(i) + * 갯수(i - 1)
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
