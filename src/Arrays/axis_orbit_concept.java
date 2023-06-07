package Arrays;


import java.util.*;
public class axis_orbit_concept {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=count_palindrome(str);
		System.out.print(k);
//		int l=CountPaliSubString(str);
//		System.out.println(l);
		
		
		
	}

	private static int count_palindrome(String str) {
		// TODO Auto-generated method stub
		
		//odd length
		int count=0;
		for(int orbit=0;orbit<str.length();orbit++) {
			for(int axis=0;axis+orbit<str.length() && orbit-axis>=0;axis++) {
				
				
				if(str.charAt(orbit-axis)==str.charAt(orbit+axis)) {
					count++;
					
				}
				
				else {
					break;
				}
			}
		}
		
		//even length string
		for(double orbit=0.5;orbit<str.length();orbit++) {
//			System.out.print("hello");
			for(double axis=0.5;axis+orbit<str.length() && orbit-axis>=0;axis++) {
				if(str.charAt((int)(orbit-axis))==str.charAt((int)(orbit+axis))) {
					
					count++;
					
				}
				else {
					break;
				}
			}
		}
		return count;
	}
	
	
//	public static int CountPaliSubString(String str) {
//		int count = 0;
//		// odd
//		for (int axis = 0; axis < str.length(); axis++) {
//			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
//				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
//					count++;
//				} else {
//					break;
//				}
//			}
//		}
//		// even
//		for (double axis = 0.5; axis < str.length(); axis++) {
//			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
//				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
//					count++;
//				} else {
//					break;
//				}
//			}
//
//	
//
//}
//		return count;
//		}
	}
