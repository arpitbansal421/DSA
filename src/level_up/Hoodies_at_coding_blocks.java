package level_up;

//important question
//one queue is added for each course and one arraylist for tracking the course

//https://hack.codingblocks.com/app/contests/3132/422/problem
import java.util.*;

class Hoodies_at_coding_blocks {

	protected int size;

	protected int front;
	protected int[] data;

	public Hoodies_at_coding_blocks() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Hoodies_at_coding_blocks(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("queue is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}

	
    public static void hoodies(int q) throws Exception{ 
	
	// Write your Code here

	ArrayList<Hoodies_at_coding_blocks>course=new ArrayList<>();//it will assing rool no to each

	for(int i=0;i<=4;i++){
		course.add(new Hoodies_at_coding_blocks());
	}
	//course
	ArrayList<Integer>mm=new ArrayList<>();//it will check which should be displayed first

	//now taking the input
	while(q-->0){
		char ch=scn.next().charAt(0);

		if(ch=='E'){

			int x=scn.nextInt();//couse 
			int y=scn.nextInt();//rool
			if(mm.contains(x)){
				course.get(x).enqueue(y);
			}else{
				mm.add(x);
				course.get(x).enqueue(y);
			}

		}else{

			int co=mm.get(0);//gettting the course
			int rool=course.get(co).dequeue();
			if(course.get(co).isEmpty()){
				mm.remove(0);
			}
			System.out.println(co+" "+rool);

		}
	}


	
} 


	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

        int n = scn.nextInt();
        
        hoodies(n);
	}

}

