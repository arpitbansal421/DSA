package Arrays;

import java.util.*;
public class form_bigger_no {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println(largestNumber(arr));
		}


    }

	 public static String largestNumber(int[] nums) {
        
        String[]ans=new String[nums.length];
        
        for(int i=0;i<nums.length;i++){
            ans[i]=String.valueOf(nums[i]);
        }
        
        Arrays.sort(ans,new Comparator<String>(){
            
            public int compare(String a,String b){
                
                String o1=a+b;
                String o2=b+a;
                return o2.compareTo(o1);
            }
        });
        
        if(ans[0].equals("0")){
            return "0";//largest value of the array is zero
        }
        
        String res="";
        
        for(String temp:ans){
            res+=temp;
        }
        
        return res;
      
    

}

}
