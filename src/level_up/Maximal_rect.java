package level_up;

import java.util.*;
//leetcode 85
//Given a rows x cols binary matrix filled with 0's and 1's, 
//find the largest rectangle containing only 1's and return its area.

//logic as soon as we get a 0 we convert net ans ==0 because we need to find consecutive 1s
public class Maximal_rect {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row=sc.nextInt();
		int col=sc.nextInt();
		Integer[][]matrix=new Integer[row][col];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
	      
        int[][]arr=new int[matrix.length][matrix[0].length];
        
        int ans=Integer.MIN_VALUE;
        
        for(int i=matrix.length-1;i>=0;i--){
            
            for(int j=0;j<matrix[0].length;j++){
                
                if(i==matrix.length-1){
                    arr[i][j]=(matrix[i][j]);
                }else{
                    arr[i][j]=(matrix[i][j])==1?arr[i+1][j]+1:0;
                }
            }
            
            ans=Math.max(hist(arr[i]),ans);
            
            
	}
        System.out.print(ans);
        

}

public static int hist(int[]arr){
        
        int ans=Integer.MIN_VALUE;
        
        Stack<Integer>ss=new Stack<>();
        
        for(int i=0;i<arr.length;i++){
            
            while(!ss.isEmpty()&& arr[ss.peek()]>arr[i]){
                int a=ss.pop();
                  int r=i;
                
                if(!ss.isEmpty()){
                    
                     int l=ss.peek();
                        ans=Math.max(ans,arr[a]*(r-l-1));
                    
                }else{
                    
                  ans=Math.max(ans,arr[a]*r);
                }
                
            }
            
            ss.push(i);
        }
        
       
        
        int r=arr.length;
        
        while(!ss.isEmpty()){
            
            int a=ss.pop();
           
            
            if(!ss.isEmpty()){
                                   
                    int l=ss.peek();
                    ans=Math.max(ans,arr[a]*(r-l-1));
              
            }else{
                  ans=Math.max(ans,arr[a]*r);
                
             
            }
        }
        
        return ans;
    }
	
}
