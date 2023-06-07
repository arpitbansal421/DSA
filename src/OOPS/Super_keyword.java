package OOPS;

import java.util.*;


 class A{
	 
	 public A() {
		 System.out.println("Hi I am in A class")
	 }
	 
	  int x=5;
	int y=6;
	 
	 public int area(int x,int y) {
		 return x*y;
	 }
	
	
}
 
 class B extends A{
	 
	 public B() {
		 super();//constructor must be first line
		 System.out.println("Hi I am in B class");
	 }
	 
	 int x=7;
	 int y=8;
	 public int area(int x,int y) {
		 return x*y;
	 }
	 
	  
 }
public class Super_keyword {
	
	public static void main(String[] args) {
		
		B bb=new B();
		
		
	}

}
