package level_up;


//Given a 2-D array that has different intervals stored in it. You need to look 
//for the overlapping intervals and merge those intervals as one. 
//Overlapping intervals are those intervals where two intervals are having some same values coming in.

import java.util.*;
public class Merge_k_intervals {
	
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		    
	        int n=sc.nextInt();
	        int[][]list=new int[n][2];
	    
	        for(int i=0;i<n;i++){
	        
	            int s=sc.nextInt();
	            int e=sc.nextInt();
	            list[i][0]=s;
	            list[i][1]=e;
	}
	        
	        Merge_k_intervals mm=new Merge_k_intervals();
	        mm.merge(list);

}
	
	 public class Intervals implements Comparable<Intervals>{
	        
	        int start;
	        int end;
	        
	        public Intervals(){
	            
	        }
	        
	        public Intervals(int start,int end){
	            
	            this.start=start;
	            this.end=end;
	        }                                                                                                   
	        
	        @Override
	        public int compareTo(Intervals o){
	            
	            return this.start-o.start;
	            
	        }
	          
	    }


	    public void merge(int[][] intervals) {
	        
	        Intervals[]arr=new Intervals[intervals.length];
	        
	        for(int i=0;i<intervals.length;i++){
	            
	            Intervals ss=new Intervals(intervals[i][0],intervals[i][1]);
	            arr[i]=ss;
	        }
	        
	        Arrays.sort(arr);
	        
	       ArrayList<Intervals>list=new ArrayList<>();
	        
	       
	        list.add(arr[0]);
	        
	        //comparing each intervals
	        
	        int i=1;
	        int j1=1;//count of ele
	        
	        while(i<arr.length){
	            
	            if(list.get(j1-1).end>=arr[i].start){
	                if(list.get(j1-1).end<=arr[i].end){
	                    list.get(j1-1).end=arr[i].end;
	                }else{
	                    
	                    
	                }
	            }else{
	                
	                
	                
	                list.add(arr[i]);
	                j1++;
	            }
	            
	            i++;
	            
	            
	        }
	        
	        
	        for(int j=0;j<list.size();j++){
	            
	          System.out.println(list.get(j).start +" , "+list.get(j).end);
	        }
	        
	        
	        return ;
	        
	      
	            
	            
	        }
	    
	    
	
}
