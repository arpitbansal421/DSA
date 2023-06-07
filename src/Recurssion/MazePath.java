package Recurssion;


import java.util.*;
public class MazePath {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		boolean[][]maze=new boolean[n][m];
//		int k=mazepath(maze,0,0);
//		System.out.println(k);
		
		int k=countpath(maze,0,0);
		System.out.println(k);
		
	}
	
	public static int mazepath(boolean[][]maze,int cr,int cc) {
		
		//positive base condition
		
		
		
		if(cr==maze.length-1 && cc==maze[0].length-1) {
			return 1;
		}
		
		
		
		//negative base condition
		if(cr<0|| cr>=maze.length||cc<0||cc>=maze[0].length||maze[cr][cc]==true) {
//			System.out.println("hello");
			
			return 0;
			
		}
		
		
//		int []r= {-1,0,1,0};
//		int []c= {0,1,0,-1};
		
		
		int []r= {-1,0,0,1};
		int [] c= {0,1,-1,0};
//		
		int ans=0;
		maze[cr][cc]=true;//visited marked
		for(int i=0;i<c.length;i++) {
			ans+=mazepath(maze,cr+r[i],cc+c[i]);
			
		}
		maze[cr][cc]=false;//undo
		
		return ans;
	}
	
	
	
	
	
	
	public static int countpath(boolean [][]maze,int cr,int cc) {

		if(cr==maze.length-1 && cc== maze[0].length-1) {
			return 1;
		}

		if(cr<0 || cr>=maze.length || cc<0  || cc>=maze[0].length || maze[cr][cc]==true) {
			return 0;
		}


		int []r= {-1,0,0,1};
		int [] c= {0,1,-1,0};
		int ans=0;
		maze[cr][cc]=true;// visited
		for (int i = 0; i < c.length; i++) {
			ans+=countpath(maze, cr+r[i], cc+c[i]);
		}
		maze[cr][cc]=false;// undo //jab charo branch explore karke aa jayenge
		return ans;


	}

}
