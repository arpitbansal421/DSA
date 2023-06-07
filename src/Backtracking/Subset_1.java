package Backtracking;
import java.util.*;
//print all subset in a list 
//METHOD 1:-WITHOUT RESPECT OF USER

public class Subset_1 {
	public static void main(String[]args) {
		int[]arr= {1,2,3};
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();//ans 
		ArrayList<Integer>list=new ArrayList<>();//ques list
		print_all(arr,ans,list,0);
		System.out.println(ans);
	
		
		
		
	

}

	private static void print_all(int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list,int i) {
		
		if(i==arr.length) {
			ans.add(new ArrayList<>(list));
			return;
		}
		list.add(arr[i]);
		print_all(arr,ans,list,i+1);//yes call
		list.remove(list.size()-1);
		print_all(arr,ans,list,i+1);//no call
		
	
		
		// TODO Auto-generated method stub
		
	}
	
}
