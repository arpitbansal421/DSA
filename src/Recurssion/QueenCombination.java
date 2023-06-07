package Recurssion;

import java.util.*;
public class QueenCombination {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	boolean[]board=new boolean[n];
	
	queencombination(board,2,0,"",0);
	
	
}

public static void queencombination(boolean[]board,int tq,int qpsf,String ans,int last_idx) {
	if(tq==qpsf) {
		System.out.println(ans+" ");
		return;
	}
	
	//iteration entire board length
	for(int i=last_idx;i<board.length;i++) {
		
		if(!board[i]) {
			board[i]=true;//first queen placed
			queencombination(board,tq,qpsf+1,ans+"b"+i+"Q"+qpsf+" ",i);
			board[i]=false;//undo
		}
		
	}
	return;
}
}
