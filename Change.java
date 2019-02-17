import java.util.*;

public class Change {
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		int[] money  = {500, 100, 50, 10, 5, 1};
		int cnt = 0, i = 0;
		int change = sc.nextInt();
		change = 1000 - change;
		
		while(change > 0){
			cnt += change / money[i];
			change = change % money[i ++];
		}
		System.out.println(cnt);
		sc.close();
	}
}
/*
import java.util.*;
public class Change {
   public static void main(String[] ar){
        int cost, N = 0, sum = 0, index = 0;
        int[] coins = {500,100,50,10,5,1};
        int[] included = new int[50];
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            cost = scanner.nextInt();
            int rest = 1000 - cost;
            while(true){
                if(sum == rest) break;
                for(index = 0; index<6; ){
                    included[N] = coins[index];
                    if(rest < (sum+included[N])){ //거슬러줄 돈보다 많으면
                        index++;
                        continue;
                    }else{ //적으면, 포함
                        sum = sum + included[N];
                        N++;
                        break;
                    }
                }
            }
        } finally{
            if(scanner!=null)
                scanner.close();
        }
        System.out.println(N);
    }
}*/