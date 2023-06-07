package Recurssion;

/*
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, 
 * such that each number is the sum of the two preceding ones, starting from 0 and 1.
 * 
 * 
 */
public class fibbo {
	
	public int fib(int n) {

        if(n==1){
            
            return 1;
        }
        if(n<=0){
            return 0;
        }

        return fib(n-1)+fib(n-2);
        
    }

}
