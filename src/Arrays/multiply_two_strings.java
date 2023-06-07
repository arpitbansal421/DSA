package Arrays;

import java.util.*;
/*Leetcode 43
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * 
 */

public class multiply_two_strings {
	public String multiply(String num1, String num2) {

        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
       
       int l1=num1.length();//length of first string
       int l2=num2.length();//length of second string

       int []res=new int[l1+l2];//our result array is equal to the l1+l2 
       //we can encounter by using some examples

       int pf=0;
       int i=l2-1;

       while(i>=0){
           int ival=num2.charAt(i)-'0';
           int k=res.length-1-pf;
           int carry=0;


           int j=l1-1;
           while(j>=0 ||carry!=0){
             
               int jval=j>=0?num1.charAt(j)-'0':0;
               int prod=ival*jval+carry+res[k];
               res[k]=prod%10;
               carry=prod/10;
               k--;
               j--;


           }
        
           pf++;
           i--;

           
       }

       String ans="";
       int m=0;
       for(int j=0;j<res.length;j++){

           if(res[j]!=0){
               break;
           }
           m++;
       }

       for(int j=m;j<res.length;j++){
           ans+=res[j];
       }

       return ans;

        
       
        
    }

	

}
