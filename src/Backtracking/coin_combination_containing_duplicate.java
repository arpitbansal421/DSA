package Backtracking;
import java.util.*;

public class coin_combination_containing_duplicate {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int[]coin= {1,1,1,2,2,3,4,5,6,7};
		Arrays.sort(coin);
		
		int amount=8;
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		ArrayList<Integer>list=new ArrayList<>();
		combination(coin,amount,0,list,ans);
		System.out.println(ans);
		
		
		
		
	

}

	private static void combination(int[] coin, int amount,int idx,ArrayList<Integer> list,
			ArrayList<ArrayList<Integer>> ans) {
		// TODO Auto-generated method stub
		if(amount==0) {
			ans.add(new ArrayList<Integer>(list));
			return;
			
		}
		for(int i=idx;i<coin.length;i++) {
			amount-=coin[i];//amount of first is decreased from total amount
			list.add(coin[i]);//first coin is picked by user
			combination(coin,amount,i+1,list,ans);//n-1 coin are picked
			amount+=coin[i];
			list.remove(list.size()-1);//backtracking
			//now removing duplication
			while(i+1<coin.length && coin[i]==coin[i+1]) {
				i++;
			}
			
			
			
		}
		
		
		
	}
	
}
