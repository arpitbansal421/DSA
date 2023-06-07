package Sliding_Window;

import java.util.*;

public class CountDistinctelement {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int l=CountDistinct(arr);
		System.out.print(l);
	}
	
	public static int CountDistinct(int []arr) {
		int ans=0;
		HashMap<Integer,Integer>map=new HashMap<>();
		
//		for(int i=0;i<arr.length;i++) {
//			if(map.containsKey(arr[i])) {
//				map.put(arr[i], map.get(arr[i])+1);
//			}else {
//				map.put(arr[i], 1);
//			}
//		}
		
		int si=0;//starting index
		int ei=0;//ending index
		while(ei<arr.length) {
			//window maintain
			if(map.containsKey(arr[ei]) && map.get(arr[ei])>0) {
				
				map.put(arr[ei], map.get(ei)+1);
			}else {
				map.put(arr[ei], 1);
			}
			
			
			
			//window shrink
			
			while(map.containsKey(arr[ei])&& map.get(arr[ei])>1 && si<ei) {
				map.put(arr[si], map.get(arr[si])-1);
				si++;
				
			}
			
			//answer update karege
			
			ei++;
			ans=((ei-si+1)*(ei-si+2))/2;
			
			
		}
		return ans;
		
		
		

	}
	
	

}
