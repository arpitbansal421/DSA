package Stack;
import java.util.*;
/*
 * A min stack is nothing but a stack with a minimum element at top
 * Now basically we use encryption and descryption value 
 * 
 */
public class Min_Stack {
	
	Stack<Integer>s;
	int min;
	
	public Min_Stack() {
		this.s=new Stack<>();
		this.min=Integer.MAX_VALUE;
	}
	
	//push item 
	
	//here we will encrypt our data 
	/*whenever we encounter our new min we encrpyt our value and set our new min
	 * with 2*item-min
	 * this formula is valid if our item is less than our then the value encrpted 
	 * would always be less than new min for ex
	 * min=6 new value encountor 3
	 * 2*3-6=-3 which less new min which is 3 
	 * 
	 * basically we multiplying our item by 2 because as we change our min our item should always be less than min
	 * 
	 * 2*item-min here if item is equal to min which give our encryppted value equal which is not possible
	 * 
	 * 
	 * 
	 */
	
	public void push(int item) {
		if(this.s.isEmpty()||this.min<item) {
			
			if(s.isEmpty()) {
				s.push(item);
				this.min=item;
			}else {
				
				s.push(item);
			}
			
			
			
		}else {
			
			int val=2*item-this.min;
			this.min=item;
			s.push(val);//encrypted value
		}
	}
	
	
	public int size() {
		return this.s.size();
	}
	
	public int peek() {
		if(s.peek()>this.min) {
			return s.peek();
		}else {
			return this.min;
		}
	}
	
	
	/*
	 * basically in this operation we will decrpt our data 
	 * 
	 * as we have encrypt our data 
	 * int val=2*item-this.min
	 * now we can restore our min as
	 * this.min=2*item-val;
	 * and our pop value would be previous as at this step only we have encrpyted data
	 * 
	 * 
	 * 
	 * 
	 */
	public int pop() {
		
		if(s.peek()>this.min) {
			int val=s.pop();
			return val;
		}
		
		int pop_data=s.pop();
		int rd=this.min;
		this.min=2*this.min-pop_data;
		return rd;
	}
	
	public int getmin() {
		return this.min;
	}
	
	public static void main(String[] args) {
		Min_Stack ss=new Min_Stack();
		ss.push(10);
		ss.push(9);;
		ss.push(15);
		ss.push(3);
		ss.push(11);
		ss.push(13);
		ss.push(6);
		ss.pop();
		ss.pop();
		ss.pop();
		ss.pop();
		System.out.println(ss.getmin());
		System.out.println(ss.peek());
	}
	
	
	
	
	
	 

}
