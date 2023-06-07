package Stack;





class created {
	private Queue primary=new Queue();
	private Queue  helper=new Queue();
	
	public boolean isempty(int item) {
		return this.primary.IS_empty();
		
		
		
	}
	
	public int size() {
		
		return this.primary.size;
		
	}
	
	public void push(int item) throws Exception {
		
		while(!primary.IS_empty()) {
			int rv=this.primary.Dequeue();
			this.helper.Enqueue(rv);
			
		}
		
		this.primary.Enqueue(item);
		
		while(!this.helper.IS_empty()) {
			int rv=this.helper.Dequeue();
			
			this.primary.Enqueue(rv);
			
		}
	}
	
	
	public int pop() throws Exception {
		return this.primary.Dequeue();
	}
	
	public int peek() throws Exception {
		return this.primary.getFront();
	}
	public void display() {
		 this.primary.Display();
	

}

}
public class Implementation_of_stack_using_queue_pop_efficient {

	public static void main(String[] args) throws Exception {
		created qq = new created();
		qq.push(10);
		qq.push(20);
		qq.push(30);
		qq.push(40);
		qq.push(50);
		qq.display();

	}

}


