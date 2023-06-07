package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionTwoArrays {
	public static void main(String[] args) {
		int[]nums1= {4,9,5,8};
		int[]nums2= {9,4,9,8,4};
		
		System.out.println(intersectionofarray(nums1,nums2));
	}

	private static ArrayList<Integer> intersectionofarray(int[] nums1, int[] nums2) {
		
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<nums1.length;i++) {
//			
//			if(map.containsKey(nums1[i])) {
//				map.put(nums1[i],map.get(nums1[i])+1 );
//			}else {
//				map.put(nums1[i], 1);
//			}
			
			map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
			
		
			
		}
		ArrayList<Integer>list=new ArrayList<>();
		for(int j=0;j<nums2.length;j++) {
			if(map.containsKey(nums2[j]) && map.get(nums2[j])>=1) {
//				System.out.println("hhh");
				list.add(nums2[j]);
				map.put(nums2[j], map.get(nums2[j])-1);
				
				
			}
			
			
			
		}
		// TODO Auto-generated method stub
		return list;
	}

}
