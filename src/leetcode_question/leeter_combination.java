package leetcode_question;
import java.util.*;
class leeter_combination{
   public static void main(String[] args) {
	
	   List<String>li=new ArrayList<>();
	   possiblecombination("12","",li);
	   
	   System.out.println(li);
}
        
    
    
    static String[]kepad={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public static void possiblecombination(String que,String ans,List<String>li){
        
        //base condition
        if(que.length()==0){
   
            li.add(ans);
            return;
        }
        
        
            char ch=que.charAt(0);//2
            String key=kepad[ch-48];//abc
        for(int i=0;i<key.length();i++){
        	
       
            possiblecombination(que.substring(1),ans+key.charAt(i),li);
            
            
            
            
        }
        return ;
    }}
    
