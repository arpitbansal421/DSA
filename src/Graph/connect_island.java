package Graph;

import java.util.*;
public class connect_island {
	
	public int shortestBridge(int[][] grid) {

        //Firstly i will add all ones
        //rather our first island
        Queue<pair>qq=new LinkedList<>();
        boolean [][]isvisited=new boolean[grid.length][grid[0].length];//boolean array
        boolean flag=false;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){

                if(grid[i][j]==1){
                   
                    bfs(i,j,grid,qq,isvisited);//all one pair will come in my queue
                    flag=true;
                    break;



                }

            }
            if(flag){
                break;
            }
        }


        int level=0;
        while(!qq.isEmpty()){
            int size=qq.size();
            while(size-->0){
                pair rv=qq.remove();

                for(int i=0;i<4;i++){
                    int row=rv.i+dir[i][0];
                    int col=rv.j+dir[i][1];
                    if(row<0 ||row>=grid.length ||col<0 ||col>=grid[0].length 
                    || isvisited[row][col]){
                        continue;
                }

                if(grid[row][col]==1){
                    return level;
                }

                qq.add(new pair(row,col));
                isvisited[row][col]=true;
                


                


                }
                

            }
            level++;

        }

        return level;
        
    }

    int[][]dir={{1,0},{0,1},{-1,0},{0,-1}};
    public void bfs(int i,int j,int[][]grid,Queue<pair>qq,boolean [][]isvisited){
        qq.add(new pair(i,j));
        isvisited[i][j]=true;

        

        

      
          
            for(int k=0;k<4;k++){
                int row=i+dir[k][0];
                int col=j+dir[k][1];
                
                if(row<0 ||row>=grid.length ||col<0 ||col>=grid[0].length ||grid[row][col]==0 || isvisited[row][col]){
                    continue;
                }

               bfs(row,col,grid,qq,isvisited);
            }


        }

        

    

        
    }

    class pair{

        int i;//x coordinate
        int j;//y coordinate

        public pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
	//graph constructor


