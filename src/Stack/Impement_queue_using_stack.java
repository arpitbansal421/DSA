package Stack;
import java.util.*;
//the same logic could appiled when we makin stack using queue push efficient
public class Impement_queue_using_stack {
	  Stack<Integer>pri;
	    Stack<Integer>sec;

	    public Impement_queue_using_stack() {
	        pri=new Stack<>();
	        sec=new Stack<>();
	        
	    }
	    
	    public void push(int x) {
	        this.pri.push(x);
	        
	    }
	    
	    public int pop() {
	        while(pri.size()!=1){
	            sec.push(pri.pop());
	        }
	        int item=pri.pop();
	        while(!sec.isEmpty()){
	            pri.push(sec.pop());
	        }

	        return item;
	        
	    }
	    
	    public int peek() {

	          while(pri.size()!=1){
	            sec.push(pri.pop());
	        }
	        int item=pri.peek();
	        while(!sec.isEmpty()){
	            pri.push(sec.pop());
	        }

	        return item;
	        
	    }
	    
	    public boolean empty() {
	        return pri.isEmpty();
	    }

}
