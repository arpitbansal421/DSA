package Graph;
import java.util.*;
//lintcode 872
//kill process
//In this problem, each process has a unique PID (process id) and PPID (parent process id).

//Each process only has one parent process, but may have one or more children processes. 
//This is just like a tree structure. Only one process has PPID that is 0, which means this process has no parent process.
//All the PIDs will be distinct positive integers.

//We use two list of integers to represent a list of processes, where the first list contains 
//PID for each process and the second list contains the corresponding PPID.

//Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will be killed in the end. You should assume that when a process is killed, all its children processes will be killed. No order is required for the final answer.
public class kill_process {
	
	 HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
	    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
	        // Write your code here

	        for(int i=0;i<ppid.size();i++){

	            map.put(ppid.get(i),new HashMap<>());
	        }

	        for(int i=0;i<ppid.size();i++){

	            map.get(ppid.get(i)).put(pid.get(i),1);
	        }

	        Queue<Integer>qq=new LinkedList<>();
	        HashSet<Integer>set=new HashSet<>();

	        qq.add(kill);

	        List<Integer>ll=new ArrayList<>();

	        while(!qq.isEmpty()){

	            int rv=qq.remove();

	            if(set.contains(rv)){
	                continue;
	            }

	            ll.add(rv);
	            set.add(rv);

	            if(map.containsKey(rv)){
	                for(int nbrs:map.get(rv).keySet()){
	                    if(!set.contains(nbrs)){
	                        qq.add(nbrs);
	                    }
	                }
	            }
	        }

	        return ll;


	    }

}
