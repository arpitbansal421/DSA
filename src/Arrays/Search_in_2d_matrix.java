package Arrays;

import java.util.*;

/*
 * Leetcode 240. Search a 2D Matrix II
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 * 
 */
public class Search_in_2d_matrix {
	
public boolean searchMatrix(int[][] matrix, int target) {
        
        int r=0;
        int c=matrix[0].length-1;

        while(r<matrix.length&& c>=0){

            if(matrix[r][c]==target){
                return true;
            }else if( r<matrix.length && c>=0 &&matrix[r][c]<target){
                //we will go down as the matrix are sorted in increasing order
                //so on left all the element will be smaller than the target
                r++;//because matrix is also sorted horizontally
            }else{
                c--;
            }
        }

        return false;
        
    }
	
	

}
