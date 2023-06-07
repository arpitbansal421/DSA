package Dynamic_programming;

//leetcode 1095
//find in mountain array

public class mountain_array_index {
	
	 public int findInMountainArray(int target, MountainArray mountainArr) {
	        
	        int len=mountainArr.length();
	        int start=0;
	        
	        int end=len-1;
	        int summit=-1;
	        //binary search for finding summit
	        while(start<end){
	            int mid=start+(end-start)/2;
	            
	          
	            if(mountainArr.get(mid+1)>mountainArr.get(mid)){
	                start=mid+1;
	            }else{
	                end=mid;
	            }
	        }
	       
	        summit=start;

	        //two binary search 
	        //0 -summit
	        //summit+1 ---end 
	        
	        start=0;
	      
	        end=summit;
	        while(start<=end){
	            int mid=start+(end-start)/2;
	            if(mountainArr.get(mid)==target){
	                return mid;
	            }
	            
	            if(mountainArr.get(mid)<target){
	                start=mid+ 1;
	            }else{
	                end=mid-1;
	            }
	        }
	        
	        

	        //now binary search for summit+1 till end
	        
	     
	         if(target==mountainArr.get(summit)){
	            return summit;
	        }else{
	        
	        start=summit;
	        end=len-1;
	        
	          while(start<=end){
	             
	            int mid=start+(end-start)/2;
	              
	            if(mountainArr.get(mid)==target){
	                return mid;
	            }
	            
	            if(mountainArr.get(mid)>target){
	                start=mid+1;
	            }else{
	                end=mid-1;
	            }
	        }                 
	         }
	        
	        
	        return -1;
	        
	    } 

}
