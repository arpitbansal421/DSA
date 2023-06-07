package Arrays;

import java.util.*;

public class sum_two_arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[]arr1=new int[n];
		int[]arr2=new int[m];
		
		//adding element to first array
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		//adding element to the second array
		
		for(int j=0;j<arr2.length;j++) {
			arr2[j]=sc.nextInt();
		}
		ArrayList<Integer>ans=adding_array(arr1,arr2);
		
		System.out.println(ans);
		
	}

	private static ArrayList<Integer> adding_array(int[] arr1, int[] arr2) {
		
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		ArrayList<Integer>ans=new ArrayList<>();
		while(i>=0 || j>=0) {
			int sum=0;
		
			if(i>=0) {
				sum+=arr1[i];
				i--;
			}
			
			if(j>=0) {
				sum+=arr2[j];
				j--;
			}
			sum+=carry;
			//System.out.println(carry);	
		
				
			ans.add(0,sum%10);
			carry=sum/10;
			
		}
		if(carry>0) {
			ans.add(0,carry%10);
			
		}
		return ans;
		
		
		// TODO Auto-generated method stub
		
	}

}
