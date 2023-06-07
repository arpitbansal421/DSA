package Backtracking;
import java.util.*;

public class Coin_combination {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n_coin=sc.nextInt();
		int[]coin=new int[n_coin];
		for(int i=0;i<coin.length;i++) {
			coin[i]=sc.nextInt();
		}
		int amount=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<>();
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		
		combination(coin,amount,list,ans,0);
		System.out.println(ans);
		
		
		
		
	}

	private static void combination(int[] coin, int amount, ArrayList<Integer> list,
			ArrayList<ArrayList<Integer>> ans,int idx) {
		// TODO Auto-generated method stub
		//base condition
		if(amount==0) {
			ans.add(new ArrayList<>(list));
			return;
		}
		
		//now applying recursive call over the total no of coins
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				list.add(coin[i]);//adding element to the coin
				combination(coin,amount-coin[i],list,ans,i);//we have written i because the coins are infinite
				list.remove(list.size()-1);//return statement
			}
					
				
				
			
			
		}
	}

}
