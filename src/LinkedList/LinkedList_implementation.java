package LinkedList;

public class LinkedList_implementation {
	
	//now first we create a node
	
	public class Node{
		
		int data;
		Node next;
		
		public Node(int data,Node next) {
			
			this.data=data;
			this.next=next;
		}
	}
	
	Node head;
	Node tail;
	int size;
	
	//now we create a constructor of the linkedlist
	public LinkedList_implementation(){
		this.head=null;
		this.tail=null;
		this.size=0;
		
	}
	
	//now creating a parametric constructor
	
	public LinkedList_implementation(Node head,Node tail,int size) {
		this.head=head;
		this.tail=tail;
		this.size=size;
	}
	
	//create method
	
	public void addfirst(int data) {
		Node nn=new Node(data,null);
		
		if(this.size==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}else {
			
			nn.next=head;
			this.head=nn;
			this.size++;
		}
		
		
	}
	
	public void addlast(int data) {
	
		Node nn=new Node(data,null);

		if(this.size()==0) {
			this.head=nn;
			this.tail=nn;
			this.size++;
		}else {
			
			this.tail.next=nn;
			this.tail=nn;
			this.size++;
		}
	}
	
	
	public boolean isempty() {
		
//		System.out.println(this.size);
		if(this.size==0) {
			return true;
		}
		return false;
		
	}
	
	public int size() {
		return this.size;
	}
	
	public Node getnodefirst() throws Exception {
		if(this.isempty()) {
			throw new Exception("LinkedList is Empty");
		}
		
		return this.head;
		
		
	}
	
	public Node getnodelast() throws Exception {
		if(this.isempty()) {
			throw new Exception("LinkedList is Empty");
		}
		
		return this.tail;
		
		
	}
	
	public Node getatidx(int k) throws Exception{
		if(this.isempty() || k<0 ||k>=this.size()) {
			
			throw new Exception("Invalid argument");
		}
		
		if(k==0) {
			
			 this.getnodefirst();
		}
		
		if(k==this.size()-1) {
			
			 this.getnodelast();
		}
		
		Node temp=this.head;
		
		while(temp!=null && k>0) {
			temp=temp.next;
			k--;
		}
		
		
		return temp;
	}
	
	public int getatval(int k) throws Exception{
		System.out.println(this.size());
		if(this.isempty() || k<0 ||k>=this.size()) {
			throw new Exception("Invalid argument");
		}
		
		Node rev=this.getatidx(k);
		return rev.data;
	}
	
	public void addatidx(int k,int data)throws Exception{
		if(this.isempty() || k<0 ||k>=this.size()) {
			throw new Exception("Invalid argument");
		}
		
		if(k==0) {
			 this.addfirst(k);;
		}
		
		else if(k==this.size()-1) {
			 this.addlast(k);;
		}
		else {
			Node nn=this.getatidx(k-1);
			Node n=nn.next;
			Node node=new Node(data,n);
			nn.next=node;
			
		}
		
	
		
		this.size++;
		
		
	}
	
	//remove method
	
	public int removefirst()throws Exception{
//		System.out.println(this.size);
		if(this.isempty()) {
			
			throw new Exception("LinkedList is Empty");
		}
//		System.out.println("qwertyu");
		int retval=this.head.data;
		
		if(this.size()==1) {
			this.head=null;
			this.tail=null;
			this.size--;
		}else {
			
			this.head=this.head.next;
			this.size--;
		}
		
		return retval;
	}
	
	
	public int removelast()throws Exception{
	
		if(this.isempty()) {
			throw new Exception("LinkedList is Empty");
		}
		
		int retval=this.tail.data;
		
		if(this.size()==1) {
			this.head=null;
			this.tail=null;
			this.size--;
		}else {
			
			Node nn=this.getatidx(this.size()-2);
			this.tail=nn; 
			nn.next=null;
			this.size--;
		}
		
		return retval;
	}
	
	public int removeatidx(int k)throws Exception{
		if(this.isempty() ||k<0 ||k>=this.size()) {
			throw new Exception("Invalid argument");
		}
		
		if(k==0) {
			int val=this.head.data;
			this.removefirst();
			return val;
		}
		
		if(k==this.size-1) {
			int val=this.tail.data;
			this.removelast();
			return val;
		}
		
		Node nn=this.getatidx(k-1);
		Node node=this.getatidx(k);
		int val=node.data;
		nn.next=nn.next.next;
		node.next=null;
		this.size--;
		return val;
		
		
		
	}
	
	
	public void reverselistdata() throws Exception {
		
		
		int i=0;
		int j=this.size-1;
		
		while(i<=j) {
	
			Node nn1=this.getatidx(i);
			Node nn2=this.getatidx(j);
			
			int temp=nn1.data;
			
			nn1.data=nn2.data;
			
			nn2.data=temp;
			i++;
			j--;
			
		}
	}
	
	//reverse by adress 
	
	public void reversedata_adress() {
		
		
		Node prev=null;
		Node curr=this.head;
		
		while(curr!=null) {
			Node ahead=curr.next;
			curr.next=prev;
			prev=curr;
			curr=ahead;
		}
		Node temp=this.head;
		this.head=this.tail;
		this.tail=temp;
	}
	
	
	//reverse  address using recurssion
	
	public void reverseadressrecurssion(){
		this.reverseadressrecurssion(this.head,null);
		
	}
	
	public void reverseadressrecurssion(Node curr,Node prev) {
		
		//base condition
		if(curr==null) {
			return ;
		}
		
		reverseadressrecurssion(curr.next,curr);
		curr.next=prev;
		Node temp=this.head;
		this.head=this.tail;
		this.tail=temp;
		
	}
	
	//reversing data using recurssion
	
	public void reversedatarecussion() {
		heapmover mover =new heapmover();
		mover.heap=this.head;
		this.reversedatarecussion(this.head, mover,0);
	}
	
	private void reversedatarecussion(Node curr, heapmover mover,int count) {
		// TODO Auto-generated method stub
		
		//base condition
		if(curr==null) {
			return;
		}
		reversedatarecussion(curr.next,mover,count+1);
		
		if(count>=this.size/2) {
			
			int temp=mover.heap.data;
			mover.heap.data=curr.data;
			curr.data=temp;
			mover.heap=mover.heap.next;
		}
	}

	//fistly we create a heapmover
	
	public class heapmover{
		
		Node heap;
		
		
		
	}
	
	public int mid() {
		return this.mid(this.head);
	}
	
	private int mid(Node head) {
		// TODO Auto-generated method stub
		
		Node slow=this.head;
		Node fast=this.head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	public void createcycle() throws Exception {
		Node nn=this.getatidx(2);
		this.tail.next=nn;
		
		
	}
	
	public boolean floyedcycle() {
		
		Node slow=this.head;
		Node fast=this.head;
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow) {
				return true;
			}
			
			
		}
		return false;
	}
	
	public Node getcyclenode() {
		Node slow=this.head;
		Node fast=this.head;
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			
			if(slow==fast) {
				return slow;
			}
		}
		return null;
	}

	public void removalcycle() {
		Node start=this.head;
		Node meetup=this.getcyclenode();
		if(meetup==null) {
			return;
		}
		
		while(start!=null) {
			
			Node temp=meetup;
			
			while(temp.next!=meetup) {
				
				if(temp.next==start) {
					temp.next=null;
					return;
				}
				
				temp=temp.next;
			}
			
			start=start.next;
		}
	}
	
	
	
	public void CycleRemoval1() {

		Node meetup = getcyclenode();
	
		if (meetup == null) {
			return;
		}
	
		Node start = this.head;
		while (start != null) {
			
			
			Node temp = meetup;
			while (temp.next != meetup) {
				
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
		start = start.next;

		}

	}
	
	
	//floyed cycle removal
	
    //for explanation anuj bhaiya 11:53 min 
	public void floyedcycleremoval() {
		Node meetup=this.getcyclenode();
		
		if(meetup==null) {
			return;
		}
		
		Node start=this.head;
		Node temp=meetup;
		while(start.next!=temp.next) {
			start=start.next;
			temp=temp.next;
			
			
		}
		temp.next=null;
	}
	public void dishplay() {
		
		Node temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		
	}
	
	
	

}
