import java.util.*;

public class Gwalho {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //총 입력 받을 문자열
		String tmp = new String(); //숫자 구분할 문자열
		int t = 0, result = 0;
		boolean minus = false;
		
		str = str.concat("\0");
		
		for(int i = 0; i < str.length(); i ++){
			if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '\0'){ // 연산자일때
				t = Integer.parseInt(tmp); // 숫자로 바꿔주기
			
				if(minus) result -= t;
				else result += t;
				tmp = "";
				
				if(str.charAt(i) == '-') minus = true;
			} else  //숫자
				tmp = tmp.concat(str.substring(i, i + 1));
		}
		System.out.println(result);
	}
}
