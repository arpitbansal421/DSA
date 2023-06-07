package Arrays;

import java.util.*;
public class DQ_prac {
	
	public static void main(String[] args) {
		
		Deque<Integer>dq=new LinkedList<>();
		
		dq.addLast(100);
		dq.addLast(13);
		dq.addLast(3);
		
		System.out.println(dq.peekLast());
	}

}
