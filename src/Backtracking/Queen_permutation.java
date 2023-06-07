package Backtracking;
import java.util.*;
public class Queen_permutation {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int board_length=sc.nextInt();
		boolean[] board=new boolean[board_length];
		int n_queen=sc.nextInt();
		print_all_permutation(board,n_queen,0,"");
	}

	private static void print_all_permutation(boolean[] board, int tq, int qpsf, String ans) {
		//base condition
		if(qpsf==tq) {
			System.out.println(ans+" ");
			return;
		}
		// TODO Auto-generated method stub
		
		for(int i=0;i<board.length;i++) {
			
			if(!board[i]) {
				board[i]=true;//first queen is placed on board
				print_all_permutation(board,tq,qpsf+1,ans+"b"+i+"Q"+qpsf);
				board[i]=false;
			}
		}
		
	}

}
