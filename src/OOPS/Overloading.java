package OOPS;

import java.util.*;
public class Overloading {
	
	
	//case 1 in such cases compiler will give ambigious error
	/*when we pass actual parameter as int int because show(int x,float y) && show(float x,int y) both can 
	 * accept int ,int as as parameter
	 * 
	 * 
	 */
	public void show(int x,float y) {
		System.out.println("hello");
}
	
//	public void show(float x,int y) {
//		System.out.println("hi");
//	}
	
	public int show(int x) {
		return 0;
	}
	
	public float show(float c) {
		return c;
		
	}
	
	public static void main(String[] args) {
		
		Overloading t=new Overloading();
		t.show(0, 'n');
		t.show(0);                                                                                                                                                                                         
		
		
	}

}
