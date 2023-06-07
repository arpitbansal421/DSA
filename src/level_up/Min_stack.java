package level_up;

import java.util.*;

//the basic concept of encryption and decryption is used
//where when we get any value less than our current minimum we pushed an encrypted value-2val-min
//and later decrypt that by using 2*min-st.peek
//2min-(2*min-prevmin)
//prevmin

public class Min_stack {
    public static void main(String args[]) {

		Stack<Integer>st=new Stack<>();

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=0;i<n;i++){
			push(sc.nextInt());
		}


		System.out.println(getMin());



		
		}
           static long min=Long.MAX_VALUE;
			static Stack<Long>st=new Stack<>();


		


	
	
		public static void push(long val) {
			
			if(st.isEmpty()){
				
				//the stack will only contain one object so the minimum would the cureent               push element
				st.push(val);
				min=val;
				return;
				
			}else if(val<min){
				st.push(2*val-min);
				min=val;
				return;
			}else{
				st.push(val);
				return;
			}
				
				
			
			
		}
		
		public static void pop() {
			//if it is moditided value
			
			if(st.isEmpty()){
				return;
			}
			
			else if(st.peek()<min){
				
				min=((2*min)-(st.peek()));
				st.pop();
			}else{
				st.pop();
				
			}
			
		}
		
		public static long top() {
			
			if(st.peek()<min){
				return min;
			}
			
			return st.peek();
			
		}
		
		public static long getMin() {
			
			return min;
			
		}
	}


    

