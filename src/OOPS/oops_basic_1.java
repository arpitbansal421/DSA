
package OOPS;

public class oops_basic_1 {
	
	/*Java is platform independent language because java file can be run in any operating system like mac,window,linux
	 * Every operating system has different code
	 * basically in java --compiler convert our to byte code --JVM--which is virtual environment for each operating system
	 * --exe that is why java code is bit slow than c/c++
	 * JDK consist of jvm,jre,compiler
	 * jvm-virtual environment
	 * jre--jvm+libraries
	 * jdk--jre+compiler
	 * 
	 * EXCEPTION HANDLING
	 * throw new Exception--
	 * have to declare everywhere the code return its value
	 * terminates the compiler as soon as the exception is generated
	 * try catch--
	 * need not to declare everywhere
	 * try{
	 * risky code is written inside the try block}
	 * catch(Exception as e){
	 * System.out.print(e)
	 * }
	 * code terminate nhi hota hn
	 * finally--exception generate ho na ho humesha chlta hn
	 * try or catch ke sath atta hn
	 * 	EXEMPLE
	 * 	public void saga(int age){
	 * 		throws new Exception{
	 * 			if(age<0){
	 * 				throw new Exception();}
	 * 
	 * 				}
	 * 
	 * 				this.age=age;
	 * 
	 * EXEMPLE
	 * 
	 * 		try{
	 * 
	 * 			Risky code}
	 * 
	 * 			catch(Exception as e){
	 * System.out.print(e)
	 * }
	 * 
	 * //		P obj = new P();
//		C obj1 = new C();

		// Case 1 when refrence variable and object are of same class
		 * actually  during declaration of the class are compiler during declaration of code looks left side of 
		 * the code and during runtime are jvm allocates the space for both lhs and rhs side of code so in
		 * case 2 we cannot the variable of c inspite of inheritance
//		P obj = new P();
//
//		System.out.println(obj.d);//1
//		System.out.println(obj.d1);//10
//		obj.fun();
//		obj.fun1();

		// Case 2
//		long i = 90;
//		int ii = (int) i;
//      p is the parent class c is the extended class
//		P obj1 = new C();
//		System.out.println(obj1.d);// 1
//		System.out.println(obj1.d1);// 10
//		System.out.println(((C) obj1).d2);// 20///we can acess the the varaibles of p by typecasting
//		System.out.println(((C) obj1).d);// 2
//
//		obj1.fun1();
//		obj1.fun();
//		((C) obj1).fun2();
 * 
 * 		during inhrihantance common varable can be acessed by typecasting
 *    Z****VERY IMPORTANT**
 *    The common class gets ovrride
 *    
 *    
 *    //CASE 4
 *    C obj2 = new P();//compile time error as are only creating our object p so we are not giving any space to the object of c
 *    //complie time error are always better than runtime error as we can resolve them during wriiting of our code
//		System.out.println(obj2.d);
//		System.out.println(obj2.d2);
//		System.out.println(obj2.d1);
 * 
 *    C obj3 = new C();
		System.out.println(obj3.d);//2
		System.out.println(obj3.d1);//10
		System.out.println(obj3.d2);//20
		System.out.println(((P)obj3).d);//1//we can acess the varable of parent class by typecasting
		but we cannot do any thing with function



		obj3.fun();
		obj3.fun1();
		obj3.fun2();
		
		//multilevel inhritance
		 * 
		 * a-->b-->c-->d
		 * 
		 * if their is common function complier will check level wise from d--c--b--a
		 * levelwise
//
	 * 
	 * 		//multiple inhritance
	 * 
	 *      if a common class is inhritanted from two diifrent class such type of inhritance is caaled multiple inhrihitance
	 *      such type of inhrihitance is not allowed in java
	 *      
	 *      because fun is not present in base class our compiler will get confused where to check for fun
	 *      
	 *      
	 *      *********************************************************************************************
	 *      package Lec41;
  
  Every class in java is overriden by a object class 
  the object class has methods of oveeriden and hashcode
public class Student  {

	String name = "Saksham";
	int age =18;



	@Override
	public String toString() {
		return this.name +" "+this.age;


	}

}
	 * 
	 * 
	 * 
	 * ************************************************************************************
	 * POLYMORPHISM
	 * one function having different form either in same class or in diffrent class
	 * the polymorphism is of two type
	 *1.Runtime --Method overriding diffrent class argument ,type ,every thing issame but logic has been changed or enhanced
	 *2.compile time-same class anything argument,type,could changed
	 * 
	 */
	
	

}
