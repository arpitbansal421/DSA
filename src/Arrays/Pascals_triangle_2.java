package Arrays;
import java.util.*;
/*
 * 
 * leetcode 119
 */
public class Pascals_triangle_2 {
	 public List<Integer> getRow(int rowIndex) {
	        if(rowIndex==0){
	         List<Integer>ll=new ArrayList<>();
	         ll.add(1);
	         return ll;
	        }

	        List<List<Integer>>res=new ArrayList<>();

	        for(int i=0;i<=rowIndex;i++){

	            List<Integer>ll=new ArrayList<>();
	            for(int j=0;j<=i;j++){
	                if(j==0||j==i){
	                    ll.add(1);
	                }
	                else{
	                    ll.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
	                }
	            }
	            res.add(new ArrayList<>(ll));
	        }

	        return res.get(rowIndex);

	        

	}

}
