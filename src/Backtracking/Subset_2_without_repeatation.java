package Backtracking;
import java.util.*;
//very very important
public class Subset_2_without_repeatation {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= {1,2,2,3,3,4};
		ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
		ArrayList<Integer>list=new ArrayList<>();
		
		print(arr,ans,list,0);
		System.out.println(ans);
		
	}

	private static void print(int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list, int idx) {
		
		// TODO Auto-generated method stub
		ans.add(new ArrayList<>(list));
		
		for(int i=idx;i<arr.length;i++) {
			if(i!=idx && arr[i-1]==arr[i]) {
				continue;
			}
			list.add(arr[i]);
			print(arr,ans,list,i+1);
			list.remove(list.size()-1);
		}
	}

}
