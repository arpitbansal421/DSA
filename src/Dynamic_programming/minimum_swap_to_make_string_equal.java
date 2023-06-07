package Dynamic_programming;
 java.util.*;
/*
 * minimum swap to make string equal
 * leetcode 1247
 * You are given two strings s1 and s2 of equal length consisting of letters "x" and "y" only. Your task is to make these two strings equal to each other. You can swap any two characters that belong to different strings, which means: swap s1[i] and s2[j].

Return the minimum number of swaps required to make s1 and s2 equal, or return -1 if it is impossible to do so.
 * 
 * the basic logic which i have used is that i have count lotal mismatch x and y in both string
 * if x and y are even so we interchanged both pairs and we can make the equal
 * 
 * but if they odd so we have will interchange till same pairs equal and we will swap the remaing pair
 * 
 * 
 */
public class minimum_swap_to_make_string_equal {
  public int minimumSwap(String s1, String s2) {
        
        int x=0;
        int y=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                continue;
            }else{
                
                if(s1.charAt(i)=='x'){
                    x++;
                }else{
                    y++;
                }
            }
        }
        
    
        
        if(x%2==0 && y%2==0){
            return x/2+y/2;
        }
        else if(x%2!=0 && y%2!=0){
            return x/2+y/2+2;}
    
    
    return -1;}

}
