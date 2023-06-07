package Arrays;

import java.util.*;
public class product_except_self {
	public int[] productExceptSelf(int[] nums) {
    int[]l=new int[nums.length];
    int[]r=new int[nums.length];
    
    // Arrays.fill(l,1);
    // Arrays.fill(r,1);
    
    //now we will left array
    
    l[0]=1;
    r[nums.length-1]=1;
    for(int i=1;i<nums.length;i++){
        l[i]=nums[i-1]*l[i-1];
    }
    
    //now we will fill our right array
    
    for(int i=nums.length-2;i>=0;i--){
        
        r[i]=nums[i+1]*r[i+1];
    }
    

    int[]res=new int[nums.length];
    //now filling our result array
    for(int i=0;i<res.length;i++){
        res[i]=l[i]*r[i];
    }
    
    return res;
     

}
public int[]productexceptselft_using_constant_space(int[]nums){
        
        int[]ans=new int[nums.length];
        
        ans[0]=1;
        //storing left multiplication
        
        for(int i=1;i<nums.length;i++){
            
            ans[i]=nums[i-1]*ans[i-1];

            
            }
        
        //now multiplying our array with right multiplication
        
        int prod=1;//will count our right multication from n
        
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i]*prod;
        
            prod*=nums[i];
        }
        
        return ans;
}
}
	
    

