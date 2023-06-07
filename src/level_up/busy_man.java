package level_up;

import java.util.*;
//You are actually very busy man. You have a big schedule of activities. 
//Your aim is to do as much as activities as possible.

//https://hack.codingblocks.com/app/contests/3132/3059/problem //question link

//logic --basically in this question we will sort we sort and array according to end so that array 
//which has minimum end could come first


public class busy_man {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	            int n=sc.nextInt();

	            int[]end=new int[n];
	            int[]start=new int[n];

	            for(int i=0;i<n;i++){
	                start[i]=sc.nextInt();
	                end[i]=sc.nextInt();
	            }
	            

	            busy_man mm=new busy_man();


	           System.out.println(mm.busyman(start,end));

		
	}}
	
	 public   class Interval implements Comparable<Interval>{

	        int start;
	        int end;

	        public Interval(){

	        }

	        public Interval(int start,int end){
	            this.start=start;
	            this.end=end;
	        }

	        @Override

	        public int compareTo(Interval o){

	            return this.end-o.end; 
	        }


	    }

	        public  int busyman(int[]start,int[]end){

	            ArrayList<Interval>list=new ArrayList<>();

	            for(int i=0;i<start.length;i++){
	                Interval ss=new Interval(start[i],end[i]);
	                list.add(ss);
	                

	            

	        }

	            Collections.sort(list);

	            int i=1;
	            int count=1;
	            int curr=list.get(0).end;
	            while(i<end.length){

	                

	               

	                if(curr<=list.get(i).start){
	                    curr=list.get(i).end;
	                    count++;
	                }
	                i++;
	            }

	            return count;



	    }

}
