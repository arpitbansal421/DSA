
package Graph;
/*it for daq directed a cyclic graph
 * it is for daq
 * 
 * 
 */
import java.util.*;
public class Topological_sort {
	HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
	
	public Topological_sort(int v) {
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addedge(int v1,int v2) {
		map.get(v1).put(v2,1);
	}
	
	
	public int[]indgree(){
		
		int[]ind=new int[map.size()+1];
		
		for(int vtx:map.keySet()) {
			for(int nbrs:map.get(vtx).keySet()) {
				ind[nbrs]++;
			}
		}
		
		return ind;
	}
	
	public void topological_sort() {
		int[]indg=indgree();
		Queue<Integer>qq=new LinkedList<>();
		
		//step 1 we will put all are vertexes of indgree 0 in queue //becuse topological sort is based on task scheduling algorithm
		//so we will schedulde those which are independent in queue
		for(int i=1;i<indg.length;i++) {
			if(indg[i]==0) {
				qq.add(i);
			}
			}
			
			//step 2 bfs 
			while(!qq.isEmpty()) {
				int rv=qq.remove();
				System.out.print(rv+" ");
				
				//now we will call its neighbours
				
				for(int nbrs:map.get(rv).keySet()) {
					
					indg[nbrs]--;
					if(indg[nbrs]==0) {
						qq.add(nbrs);
					}
				}
			}
			
			
		}
	public void TopologicalSort() {
		Queue<Integer> qq = new LinkedList<>();
		int[] ind = indgree();
		for (int i = 1; i < ind.length; i++) {
			if (ind[i] == 0) {
				qq.add(i);
			}

		}
		

		while (!qq.isEmpty()) {
			int front = qq.poll();
			System.out.print(front + " ");
			for (int nbrs : map.get(front).keySet()) {
				ind[nbrs]--;
				if (ind[nbrs] == 0) {
					qq.add(nbrs);
				}
			}

		}
		}
	
	//iscycle ka code
	public boolean iscycle() {
		Queue<Integer>qq=new LinkedList<>();
		
		int[]ind=indgree();
		
		for(int i=1;i<ind.length;i++) {
			if(ind[i]==0) {
				qq.add(i);
			}
		}
		int count=0;
		//bfs code
		while(!qq.isEmpty()) {
			int rv=qq.remove();
			count++;
			
			for(int nbrs:map.get(rv).keySet()) {
				ind[nbrs]--;
				if(ind[nbrs]==0) {
					qq.add(nbrs);
				}
			}
		}
		System.out.println();
		return count!=map.size();
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		Topological_sort ts=new Topological_sort(7);
//		tt.addedge(1, 2);//1
//	
//		tt.addedge(4, 3);//3
//		tt.addedge(3, 2);//4
//		tt.addedge(4, 5);//5
//		tt.addedge(5, 7);//6
//		tt.addedge(6, 3);//7
		
		ts.addedge(1, 2);
		ts.addedge(1, 4);
		ts.addedge(4, 3);
		ts.addedge(3, 2);
		ts.addedge(4, 5);
		ts.addedge(5, 7);
		ts.addedge(6, 3);
		ts.addedge(6, 7);
		ts.TopologicalSort();
		System.out.println();
		ts.topological_sort();
		System.out.println(ts.iscycle());
		
		
		
	}

}
