package Stack;

import java.util.*;
public class Longest_valid_parenthesis {

    public int longestValidParentheses(String s) {
        
        Stack<Integer>ss=new Stack<>();
       
        int curr=0;
        int ans=0;
        
        
        
        //iteratrate through length of string
        
        for(int i=0;i<s.length();i++){
            
            char cc=s.charAt(i);
            
            if(cc=='('){
                ss.push(curr);
                curr=0;
                //we have encounter an opening parenthesis so will make a new pair or combination
                //as previous pair is impossible as in our previous pair is if valid last pair should be an closing parenthesis
            }else{
                if(ss.isEmpty()){
                    curr=0;
                }else{
                    
                    curr=curr+2+ss.pop();
                    ans=Math.max(curr,ans);
                    
                }
            }
        }
        

        
        
        return ans;
    }
}
