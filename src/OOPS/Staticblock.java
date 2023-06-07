package OOPS;

import java.util.*;

public class Staticblock {
	
	public Staticblock() {
		System.out.println("hello");
	}
	
	static {
		
		System.out.println("Hi I am in staticblock");
		
	}
	
	public static void main(String[] args) {
		
		child ss=new child();                                                  
		
		
		
	}

}

class child extends Staticblock{
	
	public child() {
		System.out.println("Hi I am in static block");
	}
	
	static {
		
		System.out.println("Hi I am in  child  block");
	}
	
}
