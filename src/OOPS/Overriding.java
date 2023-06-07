package OOPS;

import java.util.*;
public class Overriding {
	
	public Overriding() {
		System.out.println("hi");
	}

}

 class test extends Overriding{
	public test() {
		
		System.out.print("Hello");
		
	}
	int x=5;int y=6;
	public void paper() {
		System.out.println("Requies tree");
	}
	
	
	
	
	
	
}
 
 class abs extends test{
	 
	 public void paper() {
		 System.out.println("Do not requires paper");
	 }
	
 }
 
 class res{
	 
	 public static void main(String[] args) {
		
		 abs ab=new abs();
		 ab.paper();
	}
 }
