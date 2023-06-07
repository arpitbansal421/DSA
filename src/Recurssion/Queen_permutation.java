package Recurssion;

import java.util.*;
public class Queen_permutation {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		boolean[]board=new boolean[n];
		
//		queenPermutation(board,2,0,"");
		QueenPermutation2(board,2,0,0,"");
		
		
		
	}
	
	
	public static void queenPermutation(boolean[]board,int tq,int qpsf,String ans) {
		
		//base case
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		};
		
		//an loop for entire length of the board
		for(int i=0;i<board.length;i++) {
			if(!board[i]) {
				board[i]=true;//first queen placed
				queenPermutation(board,tq,qpsf+1,ans+"b"+i+"Q"+qpsf+" ");//n-1 queen will placed by recurssion
				board[i]=false;//uncaped
			}
			
		}
		return;
	}
	
	
	//2nd method
	
	public static void QueenPermutation2(boolean []board,int tq,int qpsf,int i,String ans) {
		//base case
		//neqative base condition
		if(i==board.length) {
			return ;
		}
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		
			if(!board[i]) {
				board[i]=true;
				QueenPermutation2(board,tq,qpsf+1,i,ans+"B"+i+"Q"+qpsf+" ");//queen will sit
				board[i]=false;
				
			}
		
		
		QueenPermutation2(board,tq,qpsf,i+1,ans);//queen will not sit
		
		return;
	}

}
