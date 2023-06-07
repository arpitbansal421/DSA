package Stack;

import java.util.*;

public class Valid_parenthesis {
public boolean isValid(String s) {
        
        Stack<Character>ss=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('|| s.charAt(i)=='[' || s.charAt(i)=='{'){
                ss.push(s.charAt(i));
            }else{
                
                 if(s.charAt(i)==')' && !ss.isEmpty() && ss.peek()=='('){
                    
                    ss.pop();
                }
                    
                
                  else if(s.charAt(i)==']' && !ss.isEmpty() && ss.peek()=='['){
                    
                    ss.pop();
                }
                
                
                      else if(s.charAt(i)=='}' && !ss.isEmpty() && ss.peek()=='{'){
                    
                    ss.pop();
                     }
                
                 else{
                        
                                          

                    return false;
                }
            }
                
            
            
        }
        
        
        
        return ss.isEmpty();
        
    }
}
	

}
