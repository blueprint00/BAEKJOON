import java.util.*;

public class Gwalho {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //�� �Է� ���� ���ڿ�
		String tmp = new String(); //���� ������ ���ڿ�
		int t = 0, result = 0;
		boolean minus = false;
		
		str = str.concat("\0");
		
		for(int i = 0; i < str.length(); i ++){
			if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '\0'){ // �������϶�
				t = Integer.parseInt(tmp); // ���ڷ� �ٲ��ֱ�
			
				if(minus) result -= t;
				else result += t;
				tmp = "";
				
				if(str.charAt(i) == '-') minus = true;
			} else  //����
				tmp = tmp.concat(str.substring(i, i + 1));
		}
		System.out.println(result);
	}
}
