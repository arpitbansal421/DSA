package Stack;

import java.util.*;
public class next_greater_ele_11 {
	public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>s=new Stack<>();

        int[]ans=new int[nums.length];
        Arrays.fill(ans,-1);

        for(int i=0;i<2*nums.length;i++){

           while(!s.isEmpty()&& nums[s.peek()%nums.length]<nums[i%nums.length]){
               ans[s.pop()%nums.length]=nums[i%nums.length];
           }
           s.push(i%nums.length);
        }
        
       
        
        return ans;
    }

}
