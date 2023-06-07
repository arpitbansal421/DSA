package level_up;
import java.util.*;
public class Sudoku_solver {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]grid=new int[n][n];

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				grid[i][j]=sc.nextInt();
			}
		}
		
//		Sudoku(grid,0,0);
		solvesudoku(grid,0,0);
	}

	public static void solvesudoku(int[][]grid,int row,int col){
		if(col==9){
			row++;
			col=0;
		}

		if(row>=9){
		
			display(grid);
			return;
		}

		if(grid[row][col]!=0){
			solvesudoku(grid,row,col+1);
			
		}
		else{
			for(int val=1;val<=9;val++){
				if(itispossible(grid,row,col,val)){
					grid[row][col]=val;
					solvesudoku(grid,row,col+1);
					grid[row][col]=0;
				}
			}
		}


	}
	
	public static boolean itispossible(int[][]grid,int row,int col,int val){
		int r=0;

		//checking rowise 
		while(r<9){
			if(grid[r][col]==val){
				return false;
			}
			r++;
		}

		int c=0;
		while(c<9){
			if(grid[row][c]==val){
				return false;
			}

			c++;
		}

		//checking 3X3 matrix
		r=row-row%3;
		c=col-col%3;
		for(int i=r;i<r+3;i++){
			for(int j=c;j<c+3;j++){
				if(grid[i][j]==val){
					return false;
				}
			}
		}

		return true;
	}

	
	
//	static int count=0;
//	public static void Sudoku(int[][] grid, int row, int col) {
//
//		if (col == 9) {
//
//			row++;
//			col = 0;
//		}
//
//		if (row >= 9) {
//			System.out.println(count++);
//			display(grid);
//			return;
//		}
//		// pehle se fill hai
//		if (grid[row][col] != 0) {
//			Sudoku(grid, row, col + 1);
//
//		} else {
//
//			for (int val = 1; val <= 9; val++) {
//				if (is_it_possible(grid, row, col, val)) {
//					grid[row][col] = val;
//					Sudoku(grid, row, col + 1);
//					grid[row][col] = 0;
//				}
//
//			}
//		}
//
//	}
//
//	public static boolean is_it_possible(int[][] grid, int row, int col, int val) {
//		// TODO Auto-generated method stub
//
//		// col
//
//		int r = 0;
//		while (r < 9) {
//			if (grid[r][col] == val) {
//				return false;
//			}
//			r++;
//
//		}
//
//		// row
//		int c = 0;
//		while (c < 9) {
//			if (grid[row][c] == val) {
//				return false;
//			}
//			c++;
//		}
//
//		// 3*3 Matrix
//		r = row - row % 3;
//		c = col - col % 3;
//		for (int i = r; i < r + 3; i++) {
//			for (int j = c; j < c + 3; j++) {
//				if (grid[i][j] == val) {
//					return false;
//				}
//
//			}
//
//		}
//
//		return true;
//	}

	public static void display(int[][] grid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();

		}

	}



}



