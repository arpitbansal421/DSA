.abstract



....class;
import java.util.*;
//lintcode 663
//You are given a m x n 2D grid initialized with these three possible values.

//-1 - A wall or an obstacle.
//0 - A gate.
//INF - Infinity means an empty room. We use the value 2^31 - 1 = 2147483647 to represent
//INF as you may assume that the distance to a gate is less than 2147483647.
//Fill each empty room with the distance to its nearest gate. If it is impossible to reach a Gate, that room should remain filled with INF
public class walls_gate {
	
	  public void wallsAndGates(int[][] rooms) {
	        int inf=2147483647;
	        // write your code here
	        int n=rooms.length;
	        if(n==0){
	            return;
	        }

	        int m=rooms[0].length;
	        Queue<Pair>qq=new LinkedList<>();
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){

	                if(rooms[i][j]==0){
	                qq.add(new Pair(i,j));
	                }
	            }
	        }
	        int[]xmove= {0,0,1,-1};
	        int []ymove={1,-1,0,0};

	        while(!qq.isEmpty()){
	            Pair pp=qq.remove();
	            for(int k=0;k<4;k++){
	                int x=xmove[k]+pp.i;
	                int y=ymove[k]+pp.j;

	                if(x>=0 && x<n && y>=0 && y<m && rooms[x][y]==inf){
	                    qq.add(new Pair(x,y));
	                    rooms[x][y]=rooms[pp.i][pp.j]+1;
	                }
	            }
	        }
	    }
	  
	  class Pair{
		    int i;
		    int j;
		    public Pair(int i,int j){
		        this.i=i;
		        this.j=j;
		    }
	  

}
	  }
