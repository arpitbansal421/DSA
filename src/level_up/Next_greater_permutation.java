package level_up;

import java.util.*;

//Take as input str, a string. 
//Write a recursive function which prints all the words possible by rearranging the characters of
//this string which are in dictionary order larger than the given string.
//The output strings must be lexicographically sorted.

public class Next_greater_permutation {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		String ans="";
		String temp=str;

		while(!ans.equals(temp)){
			
			
			

		  str=nextPermutation(str);
		  ans=str;
		  
		  if(ans.compareTo(temp)>0) {
			  
			  System.out.println(ans+" ");
		  }
		  if(ans.compareTo(temp)<=0) {
			  break;
		  }
		  
		}
		
	}
	
	public static String nextPermutation(String str){
		char[]arr=str.toCharArray();

		//now i will calculate the break point

		int idx=-1;
		//now will iterate from the back and calculate the first
		//point where the decreasing order is breaked
		for(int i=arr.length-2;i>=0;i--){

			if(arr[i+1]>arr[i]){
				idx=i;
				break;

			}
		}

		
		

		if(idx==-1){
			reverse(arr,0,arr.length-1);
			String st=new String(arr);
			return st;
		}

		//now i will calculate the first digit greater than our break
		//point so that we could build are next greater ele

		int idx1=-1;

		int i=arr.length-1;

		while(i>=0){

			if(arr[idx]<=arr[i]){
				idx1=i;
				break;
			}
			i--;
		}
		//now swap the ele at idx1 and idx2
		char temp=arr[idx];
		arr[idx]=arr[idx1];
		arr[idx1]=temp;

		reverse(arr,idx+1,arr.length-1);
		String st=new String(arr);

		return st;




	}

	 public static void reverse(char[]nums,int start ,int end){
        
        while(start<end){
            char temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
}}


