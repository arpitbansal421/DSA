package Arrays;
import java.util.*;
/*
 * Leetcode 118
 * Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Basically in pascals triangle if we visulize carefully we observe that 
next row result is calculated on the basis of previous row result and in each new row first and last element are 1
so we calculated 2 to second last element by summation of previous row element in which we took addition of our
current and previous element

 * Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

public class Pascal_triangle {
	public List<List<Integer>> generate(int numRows) {

        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<numRows;i++){//total no rows 0--4==5 for 5 rows
            List<Integer>ll=new ArrayList<>();//each new row new list
            //j loop reprent the size new row for j=0 the loop will run1 time
            //and size==1
            for(int j=0;j<=i;j++){
                if(j==0||i==j/*last element to be added*/){
                	
                    ll.add(1);
                }else{
                    
                    ll.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
                }

                

                }
                res.add(new ArrayList<>(ll));
            }
            return res;
        }


}
