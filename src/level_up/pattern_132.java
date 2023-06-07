package level_up;

import java.util.*;


//Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

//Return true if there is a 132 pattern in nums, otherwise, return false.



public class pattern_132 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
	}
	
	public static boolean find132pattern(int[] nums) {
        Stack<Integer>ss=new Stack<>();
        
        int[]minr=new int[nums.length];
        
        minr[0]=nums[0];
        
        for(int i=1;i<minr.length;i++){
            
            minr[i]=Math.min(minr[i-1],nums[i]);
        }
        
        for(int i=nums.length-1;i>=0;i--){
            
            while(!ss.isEmpty()&&nums[ss.peek()]<nums[i]){
                
                if(minr[i]<nums[ss.peek()]){
                    
                    return true;
                }else{
                    
                    ss.pop();//basically here we are using the concept if the element is greater than or equal to
                    //leftmin element that means all element in the left will be greater than or equal to left 
                    //so 1 3 2 pattern could not be formed
                    
                    // 1 1 2 3 -4
                    // so 1 3 2 pattern could not be formed from -4
                }
            }
            
            ss.push(i);
                  
                  
                  
                  
                  
                  
                
        }
        
        return false;
        
        
        
    }
	
	

}
