package Stack;

import java.util.*;
//leetcode 394
//decode a string
//very very important
public class Decode_string {
	
	 public String decodeString(String s) {
	        
	        // Stack<Integer>is=new Stack<>();//this stack will keep the track of integer
	        Stack<Pair>st=new Stack<>();//this stack will keep the track of the string
	        String res="";
	        String ans="";
	        
	        int ptr=0;//this pointer will keep the command of code
	        
	        while(ptr<s.length()){
	            
	            char ch=s.charAt(ptr);
	            Pair pp=new Pair();
	            if(Character.isDigit(ch)){
	                int num=0;//we creating a num because a can be of length greater than 1
	                //for ex34,890
	                
	                while(Character.isDigit(s.charAt(ptr))){
	                    num=num*10+(s.charAt(ptr)-'0');
	                 
	                    
	                    ptr++;
	                    
	                }
	                pp.dig=num;
	                st.push(pp);
	                
	            }else if(ch=='['){
	                pp.str=res;
	                st.peek().str=res;
	                res="";//new string for seies character
	                
	                ptr++;
	                
	                
	            }else if(ch==']'){
	                StringBuilder sb=new StringBuilder(st.peek().str);
	                
	                
	                
	                int k=st.pop().dig;
	              
	                for(int i=1;i<=k;i++){
	                    sb.append(res);
	                    
	           
	                    
	                    
	                }
	                 res=sb.toString();
	               
	                    ptr++;
	                    
	               
	            } 
	            
	            else{
	                res+=ch;
	                ptr++;
	            }
	            
	            
	        }
	       
	        return res;
	        
	    }
	    
	    class Pair{
	        String str;//it will hold the string
	        int dig;//it will hold the count
	        
	        public Pair(String str,int dig){
	            this.str=str;
	            this.dig=dig;
	        }
	        
	        public Pair(){
	            
	        }
	    }

}
