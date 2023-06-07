package Arrays;
import java.util.*;
public class Majority_element_2 {
	 public static void main (String args[]) {
	        Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();

	     int[]nums=new int[n];

	     for(int i=0;i<nums.length;i++){
	         nums[i]=sc.nextInt();
	     }

	     List<Integer>ans=majorityElement(nums);

	     if(ans.size()==0){
	         System.out.print( "No Majority Elements");
	         return;
	     }
	     for(int ele:ans){
	         System.out.print(ele+" ");
	     }



	    }

	     public static List<Integer> majorityElement(int[] nums) {
	        
	        int ele1=0,ele2=0,c1=0,c2=0;
	        
	        for(int ele:nums){
	            
	            if(ele1==ele){
	                c1++;
	            }else if(ele2==ele){
	                c2++;
	            }else if(c1==0){
	                ele1=ele;
	                c1=1;
	                
	            }else if(c2==0){
	                ele2=ele;
	                c2=1;
	            }else{
	                c1--;
	                c2--;
	            }
	        }
	        
	      
	        c1=0;c2=0;
	        for(int ele:nums){
	            if(ele==ele1){
	                c1++;
	            }
	            else if(ele==ele2){
	                c2++;
	            }
	            
	        }
	        
	        List<Integer>ans=new ArrayList<>();
	        
	        if(c1>nums.length/3){
	            ans.add(ele1);
	        }
	        if(c2>nums.length/3){
	            ans.add(ele2);
	        }
	        
	        return ans;
	        
	    }

}
