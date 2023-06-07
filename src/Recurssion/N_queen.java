package Recurssion;


import java.util.*;
public class N_queen {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	int tq=sc.nextInt();
	
	int n=sc.nextInt();
	
	boolean[][]board=new boolean[n][n];
	int k=Nqueen(tq,0,board);
	System.out.println(k);
	
}

public static int Nqueen(int tq,int row,boolean[][]board) {
	//positive base condition
	if(tq==0) {
		return 1;
	}
	if(row>=board.length) {
		return 0;
	}
	int ans=0;
	for(int col=0;col<board[0].length;col++) {
		
		if(isitpossible(tq,board,row,col)) {
			board[row][col]=true;//first queen placed
			ans+=Nqueen(tq-1,row+1,board);//n-1 queen
			board[row][col]=false;//undo
			
		}
		
	}
	return ans;
}

private static boolean isitpossible(int tq, boolean[][] board, int row, int col) {
	// TODO Auto-generated method stub
	
	int r=row;
	
	int c=col;
	//right diognal
	while(c<board[0].length && r>=0) {
		if(board[r][c]) {
			return false;
		}
		r--;
		c++;
		
		
	}
	
	//left diognal
	r=row;
	c=col;
	while(r>=0 && c>=0) {
		if(board[r][c]) {
			return false;
		}
		r--;
		c--;
	}
	//rowise
	r=row;
	c=col;
	while(r>=0) {
		if(board[r][c]) {
			return false;
		}
		r--;
	}
	//coloumn wise
	r=row;
	c=col;
	while(c>=0) {
		if(board[r][c]) {
			return false;
		}
		c--;
	}
	return true;
}

}
