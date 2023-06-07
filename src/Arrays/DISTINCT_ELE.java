package Arrays;

import java.util.*;



public class DISTINCT_ELE {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int k=Distinctelement(arr);
		System.out.println(k);
	}
	
	
	public static int Distinctelement(int[]arr) {
		
		
//		int si=0;
//		int ei=0;
		
		int ans=0;
		HashSet<Integer>s=new HashSet<>();
		//maintaing the window
		int j=0;
		for(int i=0;i<arr.length;i++) {
			
			
			//window shrink
			
			while(j<arr.length && !s.contains(arr[j])) {
				s.add(arr[j]);
				j++;
				
			}
		
			
			//answer update
			
			ans+=(j-i)*((j-i)+1)/2;
			
			s.remove(arr[i]);//removing previous element for next iteration
		}
		
		return ans;
		
	
		
	
	}

}
