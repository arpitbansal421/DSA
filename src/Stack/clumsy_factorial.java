package Stack;
import java.util.*;

/*
 * 
 * The factorial of a positive integer n is the product of all positive integers less than or equal to n.

For example, factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1.
We make a clumsy factorial using the integers in decreasing order by swapping out the multiply operations for a fixed rotation of operations with multiply '*', divide '/', add '+', and subtract '-' in this order.

For example, clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.
However, these operations are still applied using the usual order of operations of arithmetic. We do all multiplication and division steps before any addition or subtraction steps, and multiplication and division steps are processed left to right.

Additionally, the division that we use is floor division such that 10 * 9 / 8 = 90 / 8 = 11.

Given an integer n, return the clumsy factorial of n.
 * 
 * 
 */
public class clumsy_factorial {
    public int clumsy(int n) {

        int pos=0;//it look the position of operator in the rotation maanner

        Stack<Integer>res=new Stack<>();//it will entire rotation factorial

        Stack<Character>ch=new Stack<>();//character array

        res.push(n);

        int i=n-1;
        while(i>=1){

            if(pos%4==0){
                
                if(!res.isEmpty()){
                    res.push(res.pop()*i);//multiplication operator
                }
            }
            if(pos%4==1){

                if(!res.isEmpty()){
                    res.push(res.pop()/i);
                }
            }
            if(pos%4==2){
                if(!res.isEmpty()){
                    res.push(i);
                    ch.push('+');
                }
            }

            if(pos%4==3){
                if(!res.isEmpty()){
                    res.push(i);
                    ch.push('-');
                }
            }
            i--;
            pos++;
        }

        int ans=0;
        while(!res.isEmpty()&& !ch.isEmpty()){

             char op=ch.pop();
            if(!ch.isEmpty()){

             if(op=='+'){
                 if(!res.isEmpty()){
                     ans+=res.pop();
                 }
             }else{
                 if(!res.isEmpty()){
                     ans-=res.pop();
                 }
             }

            }
        }

            while(!res.isEmpty()){
                ans+=res.pop();
            }

            return ans;


        
}

}
