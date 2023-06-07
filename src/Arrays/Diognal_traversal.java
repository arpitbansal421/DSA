package Arrays;

import java.util.*;
public class Diognal_traversal {
	static ArrayList<ArrayList<Integer>>ll;
	public static void main(String[] args) {
		
		int[][]matrix= {{1,2,3,4},{6,7,8,9},{11,12,13,14}  ,{15,16,17,18}};
		
		ll=new ArrayList<>();
		System.out.println(ll);
		printele(matrix);
		
		
	}
	
	public static void printele(int[][]arr) {
		
		int m=arr.length;
		int n=arr[0].length;
		int r=0;
		int c=0;
		ArrayList<Integer>list=new ArrayList<>();
		for(int d=0;d<=m+n-1;d++) {
			if(d>=m) {
				r=m-1;
				c+=1;
				int r2=r;
				int c2=c;
	
				while(r2>=0 &&  c2<n) {
					list.add(arr[r2][c2]);
					System.out.print(arr[r2][c2]+" ");
					r2--;
					c2++;
				}
			  
			
				System.out.println();
		
				
				
			}else {
				
				int c1=0;
				int r1=d;
				
				while(r1>=0 && c1<n) {
					list.add(arr[r1][c1]);
					System.out.print(arr[r1][c1]+" ");
					r1--;
					c1++;
				}
				System.out.println();
			}
		
			ll.add(list);
			;
		}
	}

}
