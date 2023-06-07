package level_up;

//You are given an array of integers nums (0-indexed) and an integer k.

//The score of a subarray (i, j) is defined as min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1). A good subarray is a subarray where i <= k <= j.

//Return the maximum possible score of a good subarray.

//similar to the histogram earlier i was thinking deque but in this question the range is not dedine so histogram is the best approach]

import java.util.*;
public class Maximum_score_of_good_subarray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[]arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(hist(arr,k));
		
		
	}
	 public static int hist(int[]arr,int k){
	        
	        //We will create a monotonic stack which store the elment in the increasing order
	        
	        Stack<Integer>ss=new Stack<>();
	        int ans=0;
	        
	        for(int i=0;i<arr.length;i++){
	            
	            while(!ss.isEmpty()&& arr[ss.peek()]>arr[i]){
	                
	                
	                int r=i;//right minimum ye ans ka part nhi hoga
	                  int h=arr[ss.pop()];//element
	                  System.out.println(h);
	                
	                if(r-1>=k){
	                    
	                    
	                    if(!ss.isEmpty()){
	                        
	                         int l=ss.peek();//answer ye bhi part nhi hoga
	                        
	                        
	                    
	                        if(l+1<=k){
	                        
	                            ans=Math.max(ans,h*(r-l-1));
	                    }
	                        
	                    }else{
	                        ans=Math.max(ans,h*r);
	                    }
	                    
	                  
	                }
	            }
	            
	            ss.push(i);
	            
	            
	        }
	        
	        int r=arr.length;
	        
	        while(!ss.isEmpty()&&r-1>=k){
	            
	            int h=arr[ss.pop()];
	            	if (!ss.isEmpty()) {
					    int l = ss.peek();// l interval part nhi hai , l+1 se hoga interval
					    if (l + 1 <= k) {
						    ans = Math.max(ans, h * (r - l - 1));
					    }
				    }

				    else {
					    ans = Math.max(ans, h * r);
				    }
	            }
	        
	            return ans;
	    }

}
