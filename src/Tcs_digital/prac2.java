package Tcs_digital;

import java.util.*;
public class prac2 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<=1;i++) {
        	
        	ans=Math.min(mincost(arr,i),ans);
        }
        System.out.println(ans);

    }


    public static int mincost(int []arr,int i){

        if(i>=arr.length){
            return 0;
        }


        return Math.min(mincost(arr,i+1),mincost(arr,i+2))+arr[i];
    }
}