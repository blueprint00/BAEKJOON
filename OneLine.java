import java.util.*;

public class OneLine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; // 입력 받을 배열
		int[] line = new int[10]; // 최종 줄
		int n, blank; // 공백
		
		n = sc.nextInt();
		for(int i = 0; i < n; i ++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i ++){
			blank = 0;
			for(int j = 0; j < n; j ++){
				if(arr[i] == blank && line[j] == 0){
					//왼쪽의 키 큰 사람 수와 공백 갯수가 같고
					//현재 위치가 공백일 경우
					line[j] = i + 1; break;
				} else if(line[j] == 0)
					//현재 위치가 비어있으므로
					blank ++;
			}
		}
		
		for(int i = 0; i < n; i ++)
			System.out.print(line[i] + " ");
	}
}