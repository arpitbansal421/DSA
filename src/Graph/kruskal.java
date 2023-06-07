package Graph;
import java.util.*;

public class kruskal{
	
	//dsu method create
	public class Dsu{
		//data will be store in a form of tree
		public class Node{
			int val;//vertex no
			int r;//height tree
			Node p;//leading element of set
		}
		//we will store each element in hashmap
		HashMap<Integer,Node>dsu=new HashMap<>();//it will store the value of vetex no and its associative node
		public void create(int v) {
			Node nn=new Node();
			nn.p=nn;
			nn.r=0;
			nn.val=v;
			dsu.put(v,nn);
		}
		
		
		
		//find it will find the parent node and the parent node no
		public int find(int v) {
			Node nn=dsu.get(v);
			return find(nn).val;
		}
     
		
		
		//this method will find the parent node
		
		private Node find(Node nn) {
			// TODO Auto-generated method stub
			if(nn.p==nn) {
				return nn;
				
			}
			return find(nn.p);
		}
		
		
		
		//union method
		//now we union each set base on their ranks
		public void union(int v1,int v2) {
			Node nn1=dsu.get(v1);
			Node nn2=dsu.get(v2);
			
			Node rn1=find(nn1);//to get the parent element of each node
			Node rn2=find(nn2);//to get the parent element of each node                                                                                                                                                                                  
			
			//now we will union them on the basis of their ranking
			//case1 if both ranks are equal
			if(rn1.r==rn2.r) {
				rn1.p=rn2;//now rn2 is the parent of rn1
				rn2.r=rn2.r+1;//as the set rn1 will be attached to the parent node rn1
			
			//if rank of rn2 is smaaler than rn1
			}else if(rn1.r>rn2.r) {
				rn2.p=rn1;
				
			}else {
				rn1.p=rn2;
			}
			
			
		}
	}
	//disjoint set is completed
	//now we create map for input
	HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
	
	//now we will create the constructur for kruskal so that we can add an empty map across each vertexex to prevent null point
	//execption
	public kruskal(int v) {
		for(int i=0;i<v;i++) {
//			this.map=new HashMap<>();
			map.put(i, new HashMap<>());
		}
	}
	
	//now we create an method to add edges and cost
	public void addedges(int v1,int v2,int cost) {
	
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	//now store the information of vertexes ,edges,cost in a form of nodes as we want union them on the bases of cost
	public class edgepair implements Comparable<edgepair>{
		int v1;
		int v2;
		int cost;
		
		//constructor
		public edgepair(int v1,int v2,int cost) {
			this.v1=v1;
			this.v2=v2;
			this.cost=cost;
			
			
		}

		@Override
		public int compareTo(edgepair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}
		
		@Override

		public String toString() {

			return this.v1 + " " + this.v2 + " @ cost " + this.cost;

		}
		
		
		
	}
	//no we will add each DikstraPair in the arraylist so that we can sort the arraylist using comparable
	public ArrayList<edgepair>getallcomponents(){
		ArrayList<edgepair>edge_list=new ArrayList<>();                                                                      
		//a loop for vertex
		for(int vtx:map.keySet()) {
			//a loop for DikstraPair
			for(int nbrs:map.get(vtx).keySet()) {
				edgepair ep=new edgepair(vtx,nbrs,map.get(vtx).get(nbrs));
				edge_list.add(ep);
				
			
		}
		return edge_list;
		
	}
	
	public void kruskal() {
		//sorting the list on the basis of the cost
		int ans=0;
		//step1 creating disjoint set for each vertex
		Dsu dsu=new Dsu();
		for(int vtx:map.keySet()) {
			dsu.create(vtx);
		}
		//step-2 creating the edge pair
		ArrayList<edgepair>list=getallcomponents();
		Collections.sort(list);
		
		//step3 union of each DikstraPair
		for(edgepair ep:list) {
			int re1=dsu.find(ep.v1);
			int re2=dsu.find(ep.v2);
			
			//if parents of both vetex pair are same 
			if(re1==re2) {
				
			}else {
				dsu.union(re1, re2);
				ans+=ep.cost;
			}                      
			
		}
		
		
		System.out.println(ans);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		kruskal ka = new kruskal(v);
		int e =sc.nextInt();
		for (int i = 0; i <e; i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int cost=sc.nextInt();
			ka.addedges(v1, v2, cost);

		}
		ka.kruskal();
	
}}
	
	


	
