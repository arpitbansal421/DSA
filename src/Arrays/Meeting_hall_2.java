package Arrays;

import java.util.*;

/*
 * Lintcode 919
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] 
 * (si < ei), find the minimum number of conference rooms required.)
 * 
 * 
 * 
 * 
 * 
 */

 class Interval {
	     int start, end;
	      Interval(int start, int end) {
	          this.start = start;
	          this.end = end;
	          
	      }
	  }
public class Meeting_hall_2 {
	
	 public int minMeetingRooms(List<Interval> intervals) {
	        // Write your code here
	        Collections.sort(intervals,new Comparator<Interval>(){
	            public int compare(Interval x,Interval y){
	                return x.start-y.start;
	            }
	        });
	        int partyhall=1;
	        PriorityQueue<Integer>pq=new PriorityQueue<>();

	        pq.add(intervals.get(0).end);

	        for(int i=1;i<intervals.size();i++){

	            if(pq.peek()>intervals.get(i).start){
	                partyhall++;
	                pq.add(intervals.get(i).end);//party hall has 
	            }else{
	                pq.remove();
	                pq.add(intervals.get(i).end);
	            }
	        }

	        return partyhall;
	    }

	    
}
