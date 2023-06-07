package Recurssion;
//Given a collection of candidate numbers (candidates) and a target number (target), 
//find all unique combinations in candidates where the candidate numbers sum to target.

//Each number in candidates may only be used once in the combination.

//note: The solution set must not contain duplicate combinations.

import java.util.*;
public class Combination_sum11 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]candites=new int[n];
		
		for(int i=0;i<candites.length;i++) {
			candites[i]=sc.nextInt();
		
		}
		
		int target=sc.nextInt();
		List<Integer>list=new ArrayList<Integer>();
		List<List<Integer>>ans=new ArrayList<>();
		Arrays.sort(candites);
		CombinationSum(list,ans,candites,target,0);
		System.out.println(ans);
	}
	
	public static void CombinationSum(List<Integer>list,List<List<Integer>>ans,int[]candites,int target,int lastidx) {
		
		if(target==0) {
			ans.add(new ArrayList<Integer>(list));
			return;
			
		}
		
		//iteration for entire length
		for(int i=lastidx;i<candites.length;i++) {
			/*draw recurssion tree for this question by example 8,1,1,2,3,5,10
			 * 
			 * 
			 */
			
			if(i!=lastidx &&candites[i]==candites[i-1]) {
			
			
				continue;
			}
			 
			if(target>=candites[i]) {
				target-=candites[i];
				list.add(candites[i]);
				CombinationSum(list,ans,candites,target,i+1);
				target+=candites[i];
				list.remove(list.size()-1);
				
				
				
			}
			
		}
	}

}
