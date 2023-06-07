package leetcode_question;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		
		public List<List<Integer>> permute(int[] nums) {
			List<List<Integer>>list=new ArrayList<>();
			List<List<Integer>>ans=new ArrayList<>();
			coinpermutation(nums,list,ans);
			return ans;
			
		}
		 public static void  coinpermutation(int[]coin,List<List<Integer>> list,List<List<Integer>>ans){
			//base condition
			if(coin.length==0){
				ans.add(new ArrayList<Integer>(list));
				return;
				
			}
			
			for(int i=0;i<coin.length;i++){
				list.add(coin[i]);//first coin is picked
				
				coinpermutation(coin,list,ans);
				List.remove(List.size()-1);//undo
				
			}
			
			return;
		}
	}
    

