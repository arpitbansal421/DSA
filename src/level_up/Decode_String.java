package level_up;

import java.util.*;

//394. Decode String

//Given an encoded string, return its decoded string.

//The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets
//is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

//You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc.
//Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4]

public class Decode_String {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(decodeString(str));
		
	}
	
public static String decodeString(String s) {
        
        Stack<Integer>is=new Stack<>();//this stack will keep the track of integer
        Stack<String>st=new Stack<>();//this stack will keep the track of the string
        String res="";
        String ans="";
        
        int ptr=0;//this pointer will keep the command of code
        
        while(ptr<s.length()){
            
            char ch=s.charAt(ptr);
            
            if(Character.isDigit(ch)){
                int num=0;//we creating a num because a can be of length greater than 1
                //for ex34,890
                
                while(Character.isDigit(s.charAt(ptr))){
                    num=num*10+(s.charAt(ptr)-'0');
                    System.out.println(num);
                    
                    ptr++;
                    
                }
                is.push(num);//we will append when the number is created
                
            }else if(ch=='['){
                st.push(res);
                res="";//new string for seies character
                
                ptr++;
                
                
            }else if(ch==']'){
                StringBuilder sb=new StringBuilder(st.pop());//we will appending our previous string into original string
                
                
                
                int k=is.pop();//decoding the number
                
                for(int i=1;i<=k;i++){
                    sb.append(res);//appending our string
                    
           
                    
                    
                }
                 res=sb.toString();//setting it new string
                    ptr++;
                    
               
            }
            
            else{
                res+=ch;
                ptr++;
            }
            
            
        }
        
        return res;
        
    }

}
