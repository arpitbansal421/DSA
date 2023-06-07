package Recurssion;

import java.util.*;
public class Tower_of_hanoi {
	
	public static void main(String[] args) {
		toh(3,"src","dis","help");
	}
	
	public static void toh(int n,String src,String dis,String help) {
		
		if(n==0) {
			return;
		}
		toh(n-1,src,help,dis);//n-1 disc will move from souce to helper
		System.out.println(n +" disc moved from "+src +" to "+dis);
		toh(n-1,help,dis,src);
		
		
	}
	
	//there is constant switching from source to helper

}
