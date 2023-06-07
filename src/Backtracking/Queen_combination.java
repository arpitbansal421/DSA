package Backtracking;
import java.util.*;

public class Queen_combination {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int board_length=sc.nextInt();
		boolean []board=new boolean[board_length];
		int tq=sc.nextInt();
		
		print_all_combination(board,tq,0,"",0);//Id will keep track for last placed queen
		
	}

	private static void print_all_combination(boolean[] board, int tq, int qpsf, String ans,int idx) {
		
		
		// TODO Auto-generated method stub
		
		//base condition
		if(qpsf==tq) {
			System.out.println(ans+" ");
			return;
			
		}
		
		//now we will iterate over the length of board
		for(int i=idx;i<board.length;i++) {
			if(!board[i]) {
				board[i]=true;//first queen placed
				print_all_combination(board,tq,qpsf+1,ans+"b"+i+"Q"+qpsf,i);//i+1 because it is not a infinite supply
				board[i]=false;
			}
		}
		
	}

}
