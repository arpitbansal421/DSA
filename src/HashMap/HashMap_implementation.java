package HashMap;

import java.util.ArrayList;

public class HashMap_implementation<K,V> {
	
	
	public class Node{
		K key;//key of the hashmap
		V value;//value of the hashmap
		Node next;//next pointer of the hashmap
		public Node(K key,V value) {
			this.key=key;
			this.value=value;
		}
		
		
		
	}
	
	ArrayList<Node>bucketarray=new ArrayList<>();
	private int size=0;
	//constructor of hashmap
	public HashMap_implementation(int size) {
		
		for(int i=0;i<size;i++) {
			this.bucketarray.add(null);
		}
	}
	public HashMap_implementation() {
		this(4);
	}
	
	//put function
	public void put(K key,V value) {
		int bn=hashfunction(key);
		Node temp=this.bucketarray.get(bn);
		while(temp!=null) {
			if(temp.key.equals(value)) {
				temp.value=value;
				return ;
			}
			temp=temp.next;
		}
		Node nn=new Node(key,value);
		Node head=this.bucketarray.get(bn);
		nn.next=head;
		this.bucketarray.set(bn, nn);
		this.size++;
		double lf=this.size/this.bucketarray.size();
		double th=2;
		if(lf>th) {
			this.reashing();
		}
		
		
	}
	//hashfunction
	public  int hashfunction(K key) {
		// TODO Auto-generated method stub
		int hc=key.hashCode();
		int bn=(hc%this.bucketarray.size());
		if(bn<0) {
			bn+=this.bucketarray.size();
		}
		return bn;
		
		
		
	}
	
	//get function
	public V get(K key) {
		int bn=hashfunction(key);
		Node temp=this.bucketarray.get(bn);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	}
	
	//contains function
	public boolean containsKey(K key) {
		int bn=this.hashfunction(key);
		Node temp=this.bucketarray.get(bn);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	public V remove(K key) {
		int bn=this.hashfunction(key);
		Node prev=null;
		Node temp=this.bucketarray.get(bn);
		while(temp!=null) {
			if(temp.equals(key)) {
				break;
			}
			prev=temp;
			temp=temp.next;
			
		}
		
		
		//if temp is equal to null
		/*that means the key is not present in the hashmap
		 * 
		 * 
		 */
		if(temp==null) {
			return null;
		}
		//if prev is equal to null that means we have to remove are first head node
		if(prev==null) {
			prev=temp.next;
			this.bucketarray.set(bn, prev);
			
		}else {
			prev.next=temp.next;
			
		}
		this.size--;
		return temp.value;
	}
	
	//size function
	public int size() {
		return this.size;
	}
	
	//reshashing function
	public void reashing() {
		
		ArrayList<Node>nba=new ArrayList<>();//new bucket array
		ArrayList<Node>oba=this.bucketarray;
		
		for(int i=0;i<2*this.size;i++) {
			nba.add(null);
		}
		this.bucketarray=nba;
		for(Node temp:oba) {
			while(temp!=null) {
				put(temp.key,temp.value);
				temp=temp.next;
				
			}
		}
	}
	
	public String toString() {
		String str = "{";
		for(Node temp:this.bucketarray) {
			while(temp!=null) {
				str=str+temp.key+","+temp.value+", ";
				temp=temp.next;
			}
			
		}
		return str+"}";
		
		
		
		
	}
	

}
