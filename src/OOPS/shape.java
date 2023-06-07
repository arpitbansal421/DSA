package OOPS;


public class shape{
	
	int length=5;
	int breadth=6;
	
	public shape() {
		System.out.println("hi i am in shape class");
		this.length=length;
		this.breadth=breadth;
	}
	
	public shape(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public void show() {
		System.out.println("Hi I am in shape class")
	}
	
	
	

}

class Square extends shape{
	
	 int length=0;
	 int breadth=0;
	
	public Square() {
		
//		super();
		System.out.println("Hi I am in Square class");
	}
	
	public Square(int l,int b) {
		super(l,b);
	}
	
	
	public int area() {
		return this.length*this.breadth;
	}
	
	public void show() {
		System.out.println("Hi I am in Square class");
		
	}
	
	
}

class Test1{
	public static void main(String[] args) {
		
//		Square ss=new Square(5,6);
//		System.out.println(ss.area());
		
		
		
		
	}
}
