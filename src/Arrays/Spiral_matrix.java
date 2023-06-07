package Arrays;

import java.util.*;
public class Spiral_matrix {
	
	 public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer>ans=new ArrayList<>();
	        
	        int rstart=0;
	        int cstart=0;
	        int rend=matrix.length-1;
	        int cend=matrix[0].length-1;
	        int n=matrix.length;
	        int m=matrix[0].length;
	        
	        int i=0;
	        while(i<n*m){
	            
	            //cstart to cend
	            
	            for(int j=cstart;j<=cend && i<m*n;j++){
	                ans.add(matrix[rstart][j]);
	                i++;
	            }
	            
	            rstart++;
	            
	            //rstart to rend
	            for(int j=rstart;j<=rend && i<m*n;j++){
	                ans.add(matrix[j][cend]);
	                i++;
	            }
	            
	            cend--;
	            
	            //cend se cstart
	            for(int j=cend;j>=cstart && i<m*n;j--){
	                ans.add(matrix[rend][j]);
	                i++;
	            }
	            
	            rend--;
	            
	            for(int j=rend;j>=rstart && i<m*n;j--){
	                ans.add(matrix[j][cstart]);
	                    i++;
	            }
	            
	            cstart++;
	            
	            
	            
	        }
	        
	        return ans;
	        
	    }

}
