package Backtracking;

import java.util.*;

///Given n size board you have to find all the possible combination of two integer in the board

public class Combination_2 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		boolean[]board=new boolean[4];
		int k=2;
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		ArrayList<Integer>list=new ArrayList<>();
		
		combination(board,k,0,ans,list);
		System.out.println(ans);
		
	}

	private static void combination(boolean[] board, int tq, int qpsf, ArrayList<ArrayList<Integer>> ans,
			ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
		//base case
		if(qpsf==tq) {
			ans.add(new ArrayList<>(list));
			return;
		}
		
		for(int i=0;i<board.length;i++) {
			if(!board[i]) {
				board[i]=true;//first queen is place
				list.add(i+1);// we are doing i+1 because we have to start from 1 to n both inclusive
				
				combination(board,tq,qpsf+1,ans,list);//n-1 queen would placed by recusion
				board[i]=false;//back track
				list.remove(list.size()-1);//back track
				
				
			}
		}
		
	}
	
	

}
