package Arrays;
//important question
import java.util.*;
public class Longest_palindrome{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(axisorbit(s));
		
	}
	
	
    public static String axisorbit(String s){
        String temp="";
    	int count=0;
        
        for(int orbit=0;orbit<s.length();orbit++){
            for(int axis=0;axis+orbit<s.length() &&orbit-axis>=0;axis++){
              
                if(s.charAt((int)orbit+axis)==s.charAt((int)orbit-axis)){
                	String temp1=s.substring((int)(orbit-axis),(int)(orbit+axis)+1);
                	
                	if(temp1.length()>temp.length()) {
                		temp=temp1;
                		
                	}
                	count++;
                
                    
                   
                
                }else {
                    	break;
                }
            }
        }
        
        //even length
        
        for(double orbit=0.5;orbit<s.length();orbit++){
        
            for(double axis=0.5;axis+orbit<s.length() &&orbit-axis>=0;axis++){
            	
           
             
        
                
                if(s.charAt((int)(orbit+axis))==s.charAt((int)(orbit-axis))){
                	String temp1=s.substring((int)(orbit-axis),(int)(orbit+axis)+1);
                	
                	if(temp1.length()>temp.length()) {
                		temp=temp1;
                		
                	}
                   
                	count++;
                	
        
                }
                    else {
                    	
                    break;
                }
            }
         
            
            
        }
        
        
        return temp;
    }
}
