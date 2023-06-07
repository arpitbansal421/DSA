package Tcs_digital;


import java.util.*;
public class Multiplyer {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=9;
		
		int[]arr= {10,12,5,40,30,7,5,9,10};
		solve(arr);
		
	
		
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
		
		
	}
	
	public static void solve(int[]arr) {
		
	
		

		
		LinkedList<Integer>front=new LinkedList<>();//for non multiplyers of 10
		LinkedList<Integer>back=new LinkedList<>();//back queue
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%10==0) {
				back.add(arr[i]);
			}else {
				front.add(arr[i]);
			}
		}
		
		
		//adding our front element
		int i=0;
		while(!front.isEmpty()&& i!=arr.length) {
			System.out.print(front.remove()+" ");
			i++;
			
		}
		
		//adding our back element
		int j=arr.length-1;
		while(!back.isEmpty()) {
			System.out.print(back.remove()+" ");
			j--;
		}
		
			
	
		}
		

	

}
