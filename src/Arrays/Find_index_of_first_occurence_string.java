package Arrays;

import java.util.*;
public class Find_index_of_first_occurence_string {
	
    public int strStr(String haystack, String needle) {

        return strStr(haystack,needle,0);
        
    }

    public int strStr(String haystack,String needle,int n){
       

        if(needle.length()>haystack.length()){
            return -1;
        }

        if(haystack.startsWith(needle)){
            return n;
        }

        return strStr(haystack.substring(1),needle,n+1);

       
        
    }
	

}
