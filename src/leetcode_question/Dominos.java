package leetcode_question;

import java.util.*;

public class Dominos{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[]left=new int[str.length()];
        int[]right=new int[str.length()];
        Arrays.fill(left,-2);//left array
        Arrays.fill(right,-2);//right array
        
        System.out.println(str.length());
        
        
        String ans=dominos(left,right,str);
        
        for(int val:left) {
        	
        	System.out.print(val+" ");
        }
        
        System.out.println();
        
        for(int val:right) {
        	System.out.print(val+" ");
        }
  
        System.out.println(ans);
        
        
    }
    
    public static String dominos(int[]left,int[]right,String str){
        String ans="";
        //filling the left array
        boolean isl=false;
        for(int i=str.length()-1;i>=0;i--){
            
            if(str.charAt(i)=='L'){
            	isl=true;
                left[i]=i;
                int index=i;
                int k=i;
                while(index>=0 &&str.charAt(index)!='R'){
                    
                    if(str.charAt(index)=='.'){
                        left[index]=k;
                    }else{
                        left[index]=index;
                        k=index;
                    }
                    
                    i--;
                    index--;
                }
            }
            
        }
        
        //filling right array
        boolean isr=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='R'){
            	isr=true;
                right[i]=i;
                int idex=i;
                int k=i;
                while(idex<str.length() && str.charAt(idex)!='L'){
                	
                    if(str.charAt(idex)=='.'){
                        right[idex]=k;
                    }
                    else{
                        right[idex]=idex;
                        k=idex;
                    }
                    i++;
                    idex++;
                }
            }
        }
        
        //making string
        for(int i=0;i<left.length;i++){
            if(str.charAt(i)=='L'|| str.charAt(i)=='R'){
            
                ans+=str.charAt(i);
            }
            
            else{
                if(Math.abs(i-left[i])<Math.abs(i-right[i]) && isl){
                    ans+=str.charAt(left[i]);
                }
                
                if(Math.abs(i-left[i])>Math.abs(i-right[i]) && isr){
                    ans+=str.charAt(right[i]);
                }
                if(Math.abs(i-left[i])==Math.abs(i-right[i])){
                  
                    ans+=str.charAt(i);               
                    }
            }
        }
        
        return ans;
        
    }
}