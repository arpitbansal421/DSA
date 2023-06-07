package Recurssion;


/*
 * 
 * basically o(n) sol would not work because stack is getting overflow
 * so we have to do this func in o(log(n))
 * 
 * by using this logic 2^4=(4)^2
 * and for odd case==2^5=2*(4)^2
 */
public class power_func {
	
	public double myPow(double x, int n) {
        return myPow(x,1L*n);
      

        
    }

     public double myPow(double x, long n) {
      if(n==0){
          return 1;
      }

    
    if(n<0){
        return myPow(1/x,-n);
    }
      
      return n%2==0?myPow(x*x,n/2):x*myPow(x*x,n/2);
      

        
    }

}
