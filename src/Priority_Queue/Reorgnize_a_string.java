package Priority_Queue;
import java.util.*;
//leetcode 767
/*
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.

Return any possible rearrangement of s or return "" if not possible.
 * 
 * 
 * 
 * 
 */
public class Reorgnize_a_string {
	
public String reorganizeString(String s) {
        
        HashMap<Character,Integer>fmap=new HashMap<>();
        
        for(char cc:s.toCharArray()){
            fmap.put(cc,fmap.getOrDefault(cc,0)+1);
        }
        PriorityQueue<Character>maxheap=new PriorityQueue<>((x,y)->fmap.get(y)-fmap.get(x));
        maxheap.addAll(fmap.keySet());
        
        StringBuilder sb=new StringBuilder();
        while(maxheap.size()>1){
            char cc1=maxheap.remove();
            char cc2=maxheap.remove();
            sb.append(cc1);
            sb.append(cc2);
            fmap.put(cc1,fmap.get(cc1)-1);
            fmap.put(cc2,fmap.get(cc2)-1);
            if(fmap.get(cc1)>0){
                maxheap.add(cc1);
            }
            if(fmap.get(cc2)>0){
                maxheap.add(cc2);
            }
            
        }
        
        if(maxheap.size()==1){
            char cc=maxheap.remove();
            int occ=fmap.get(cc);
            if(occ>1){
                return "";
            }
            
        else{
            sb.append(cc);
        }}
        
        return sb.toString();
    }

}
