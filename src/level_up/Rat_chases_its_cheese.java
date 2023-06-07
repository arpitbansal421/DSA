package level_up;
import java.util.*;
public class Rat_chases_its_cheese {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][]maze=new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				maze[i][j]=sc.next().charAt(i);
			}
		}
		
		int[][]grid=new int[maze.length][maze[0].length];
		solve(maze,0,0,grid);
		
	}
	
	public static void solve(char[][]maze,int row,int col,int[][]grid) {Rat Chases its cheese
		
	
		if(row==maze.length-1 && col==maze[0].length-1) {
			System.out.println("hello");
			display(grid);
			return;
		}
		
		if(maze[row][col]=='X'||row>=maze.length || col>=maze[0].length || row<0 || col<0 ||grid[row][col]==1) {
		    
			return;
		}
		
		int[]r= {1,0,-1,0};
		int[]c= {0,1,0,1};
		
		grid[row][col]=1;
		
		for(int i=0;i<r.length;i++) {
			System.out.println("hello");
			solve(maze,row+r[i],col+c[i],grid);
			
			
		}
		grid[row][col]=0;
	}
	
	public static void display(int[][]grid) {
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				
				System.out.print(grid[i][j]+" ");
				
			}
			
			System.out.println();
		}
	}

}
