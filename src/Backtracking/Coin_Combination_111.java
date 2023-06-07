package Backtracking;
import java.lang.reflect.Array;
import java.util.*;

//find all the valid combination of k that add sum to n such that foolowing condition are met only number from 1 
//1 to 9 are used
//Each number is used almost once

//for combination start the loop with id

public class Coin_Combination_111 { 
	public static void main(String[]args) {
		
//		Scanner =new Scanner(System.in);
		int k=3;
		int n=7;
		boolean []board=new boolean [9];
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		ArrayList<Integer>list=new ArrayList<>();
		
		
		combinations(board,k,0,n,0,0,list,ans);
		System.out.println(ans);
		
		
	}

	private static void combinations(boolean[] board, int tq, int qpsf, int amount, int sum, int idx, ArrayList<Integer> list,
			ArrayList<ArrayList<Integer>> ans) {
		// TODO Auto-generated method stub
		
		//base condition
		if(qpsf==tq) {
//			System.out.println("hi");
			if(sum==amount)
				
				ans.add(new ArrayList<Integer>(list));
				return;
			}
			for(int i=idx;i<board.length;i++) {
				if(!board[i]) {
					list.add(i+1);
					board[i]=true;//first placed has been filled
					combinations(board,tq,qpsf+1,amount,sum+i+1,i+1,list,ans);//i+1 because we do not have infinite choices
					list.remove(list.size()-1);//removing last index for a written call
					board[i]=false;
				}
			}
		}
		
	}


