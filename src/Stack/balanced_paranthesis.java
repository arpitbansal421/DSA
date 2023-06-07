package Stack;



import java.util.*;
public class balanced_paranthesis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		balanced_paranthesis mainobj = new balanced_paranthesis();
		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
		if (isBalanced(str, stack)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean isBalanced(String str, StacksUsingArrays stack) throws Exception {
		
	  //cas1 //pushing the opening paranthesis
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='('||ch=='{'||ch=='[') {
				stack.push(ch);
			}
			
			//pop 
			//case1 if peek of the stack does not match our closing parenthesis
			if(ch==')') {
				if(stack.top()!='('||stack.isEmpty()) {
					return false;
				}else {
					stack.pop();
				}
					
				
			}
			else if(ch=='}') {
				if(stack.top()!='{'||stack.isEmpty()) {
					return false;
				}
				else {
					stack.pop();
				}
			}
			
			else if(ch==']') {
				if(stack.top()!='['||stack.isEmpty()) {
					return false;
				}
				else {
					stack.pop();
				}
			}

			
		}
		return stack.isEmpty();

		
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}

