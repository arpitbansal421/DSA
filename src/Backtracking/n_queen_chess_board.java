package Backtracking;
///very very important must look before digital exam
import java.util.*;

public class n_queen_chess_board {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int tq=sc.nextInt();
		boolean[][]grid=new boolean[tq][tq];//a board on which the queen will be placed
		int k=print_different_ways(grid,tq,0);
		
		System.out.println(k);
		
		
		
	}
	static int val=0;
	public static int print_different_ways(boolean[][]grid,int tq,int row) {
		
		
		if(tq==0) {
//			System.out.println("hi "+(++val));
			return 1;
		}
		
		if(row<0  || row>=grid.length) {
			return 0;
		}
		

		int ans=0;
		for(int col=0;col<grid.length;col++) {
			if(itispossible(grid,col,row)) {
				grid[row][col]=true;//first queen placed
				ans+=print_different_ways(grid,tq-1,row+1);
				grid[row][col]=false;
			};
			
			
			
		}
		return ans;
		
		
		
		
	}

	private static boolean itispossible(boolean[][] grid, int col, int row) {
		// TODO Auto-generated method stub
		int r=row;
		int c=col;
		// upper rowise check karenge
		
		while(r>=0) {
			
			if(grid[r][c]) {
				return false;
			}
			r--;
		}
		
		//coloumnwise backward
		r=row;
		while(c>=0) {
			if(grid[r][c]) {
				return false;
			}
			c--;
			
		}
		//left diognal
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(grid[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		//right diognal
		r=row;
		c=col;
		while(r>=0 &&c>=0 && c<grid.length) {
			if(grid[r][c]) {
				return false;
			}
			r--;
			c++;
		}
	
		
		return true;
	}

}
