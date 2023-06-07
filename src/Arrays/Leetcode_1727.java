package Arrays;
import java.util.*;
/*
 *
You are given a binary matrix matrix of size m x n, and
 you are allowed to rearrange the columns of the matrix in any order.

Return the area of the largest submatrix within matrix where every element of the submatrix is 1 after reordering the columns optimally.
 * 
 */

public class Leetcode_1727 {
	   HashMap<Integer,Integer>map=new HashMap<>();
	    public int largestSubmatrix(int[][] matrix) {

	        if(matrix.length==0){
	            return 0;
	        }

	        for(int row=1;row<matrix.length;row++){
	            for(int col=0;col<matrix[row].length;col++){

	                if(matrix[row][col]==1){

	                    matrix[row][col]+=matrix[row-1][col];
	                }
	            }
	        }

	        int ans=0;

	     
	        for(int i=0;i<matrix.length;i++){
	            Arrays.sort(matrix[i]);
	            for(int j=matrix[0].length-1;j>=0;j--){
	                

	                ans=Math.max(ans,matrix[i][j]*(matrix[0].length-j));
	            }
	        }


	        return ans;

	        

	       
	            }

}
