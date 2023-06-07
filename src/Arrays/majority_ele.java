package Arrays;

public class majority_ele {
	 public int majorityElement(int[] nums) {
	        //logic if element appers more than n/2 times
	        //so we can use count variable to track no of times that element apper
	        //if appers we update are count or increase our
	        //if similar element do not appear we decrease the value count
	        
	        //if element n/2+1 and remaing element n/2-1
	        //n/2+1-(n/2-1)
	        //so count more than 1
	        int count=0;
	        int ele=-1;
	        for(int i=0;i<nums.length;i++){
	            
	            if(count==0){
	                ele=nums[i];
	            }
	            
	            if(ele==nums[i]){
	                count++;
	            }else{
	                count--;
	            }
	            
	        }
	        
	        return ele;
	    }

}
