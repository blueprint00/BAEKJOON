import java.util.*;

public class OneLine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; // �Է� ���� �迭
		int[] line = new int[10]; // ���� ��
		int n, blank; // ����
		
		n = sc.nextInt();
		for(int i = 0; i < n; i ++){
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i ++){
			blank = 0;
			for(int j = 0; j < n; j ++){
				if(arr[i] == blank && line[j] == 0){
					//������ Ű ū ��� ���� ���� ������ ����
					//���� ��ġ�� ������ ���
					line[j] = i + 1; break;
				} else if(line[j] == 0)
					//���� ��ġ�� ��������Ƿ�
					blank ++;
			}
		}
		
		for(int i = 0; i < n; i ++)
			System.out.print(line[i] + " ");
	}
}