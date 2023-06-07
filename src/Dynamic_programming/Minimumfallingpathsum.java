package Dynamic_programming;


import java.util.*;
public class Minimumfallingpathsum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]grid=new int[n][n];
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				grid[i][j]=sc.nextInt();
			}
		}
		
		int[][]dp=new int[n][n];
		
		for(int []a:dp) {
			Arrays.fill(a,-10000);
		}
		
		int ans=Integer.MAX_VALUE;
		ArrayList<ArrayList<Integer>>list=new ArrayList<>();
		
		ArrayList<Integer>li=new ArrayList<>();
				
				
		for(int i=0;i<grid[0].length;i++) {
			ans=Math.min(ans, Minimumsum(grid,0,i,dp,list,li));
			
		}
		
		
		System.out.println(list);
		

		
		System.out.println(ans);
		
		
		
	}

	private static int Minimumsum(int[][] grid, int cr, int cc, int[][] dp,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>list) {
		// TODO Auto-generated method stub
		//base condition
		
		if(cc<0||cc>=grid[0].length||cr>=grid.length) {
			return Integer.MAX_VALUE;
		}
		
		if(cr==grid[0].length-1) {
			ans.add(new ArrayList<>(list));
			return grid[cr][cc];
		}
		if(dp[cr][cc]!=-10000) {
			return dp[cr][cc];
		}
		list.add(grid[cr][cc]);
		int p1=Minimumsum(grid,cr+1,cc-1,dp,ans,list);
		int p2=Minimumsum(grid,cr+1,cc,dp,ans,list);
		int p3 =Minimumsum(grid,cr+1,cc+1,dp,ans,list);

		
		return dp[cr][cc]=Math.min(p1, Math.min(p1,p2))+grid[cr][cc];
		
	
		
		
	
	}

}
