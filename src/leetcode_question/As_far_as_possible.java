package leetcode_question;
//very very important
import java.util.*;
public class As_far_as_possible {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][]grid=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				grid[i][j]=sc.nextInt();
			}
		}
		
		int k=maxdistance(grid);
		System.out.println(k);
		
	}
	
	
	public static class pairs{
		int i;
		int j;
		int level;
		public pairs(int i,int j,int level) {
			this.i=i;
			this.j=j;
			this.level=level;
		}
	}
	
	public  static int maxdistance(int [][]grid) {
		HashSet<Integer>visited=new HashSet<>();
		Queue<pairs>queue=new LinkedList<>();
		int max=Integer.MIN_VALUE;
		//adding all one to the queue
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				
				if(grid[i][j]==1) {
					pairs pp=new pairs(i,j,0);
					queue.add(pp);
				
				}
			}
		}
		int level=0;
		//now will check the distance of zeoes in queue as from different level
		//bfs code
		
		int [][]distance= {{0,1},{1,0},{-1,0},{0,-1}};
		
		if(queue.size()==grid.length*grid[0].length) {
			return -1;
		}
		if(queue.size()==0) {
			return -1;
		}
		while(!queue.isEmpty()) {
			
			int size=queue.size();
			
		
			
			//now using bfs code
			while(size-->0) {
				
				pairs rv=queue.remove();
				
				max=Math.max(max, rv.level);
				
				
			
//				if(visited.contains(grid[rv.i][rv.j])) {
//					continue;
//					
//				}
				
				visited.add(grid[rv.i][rv.j]);//marking the element
				
			
				//checking its neighbous
				for(int i=0;i<distance.length;i++) {
					
				
					
						
						if(rv.i+distance[i][0]>=0 && rv.i+distance[i][0]<grid.length && rv.j+distance[i][1]>=0 && rv.j+distance[i][1]<grid.length &&grid[rv.i+distance[i][0]][rv.j+distance[i][1]]==0) {
							
							
							
								pairs np=new pairs(rv.i+distance[i][0],rv.j+distance[i][1],rv.level+1);
								grid[rv.i+distance[i][0]][rv.j+distance[i][1]]=1;
								queue.add(np);
							
						
							
						
					}
				}
				
				
			}
			
			
		}
		
		return max;
		}
	}

