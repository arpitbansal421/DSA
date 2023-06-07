package Recurssion;


import java.util.*;
public class Combination_Sum1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		boolean[]board=new boolean[n];
		List<Integer>list=new ArrayList<>();
		List<List<Integer>>ans=new ArrayList<>();
		
		combinationsum(board,k,0,list,ans,0);
		System.out.println(ans);
	}
	
	public static void combinationsum(boolean []board,int tq,int qpsf,List<Integer>list,List<List<Integer>>ans,int lastidx) {
		
		if(tq==qpsf) {
			ans.add(new ArrayList<>(list));
			return;
		}
		
		for(int i=lastidx;i<board.length;i++) {
			
			if(!board[i]) {
				board[i]=true;//first candidiate is place
				list.add(i+1);//first candidiate added
				combinationsum(board,tq,qpsf+1,list,ans,i+1);
				list.remove(list.size()-1);//last element removed
				board[i]=false;//undo
				
			}
			
		}
		return;
		
		
		
		
	}

}
