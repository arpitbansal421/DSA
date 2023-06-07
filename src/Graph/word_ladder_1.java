package Graph;
import java.util.*;
//leetcode 127
//word ladder 1
//A transformation sequence from word beginWord to word endWord using a dictionary wordList is a s
//sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

//Every adjacent pair of words differs by a single letter.
//Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
//sk == endWord
//Given two words, beginWord and endWord, and a dictionary wordList,
//return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.

public class word_ladder_1 {
	 public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	        
	        Queue<Pair>qq=new LinkedList<>();
	        HashSet<String>set=new HashSet<>(wordList);
	        
	        qq.add(new Pair(beginWord,1));
	        while(!qq.isEmpty()){
	            Pair rp=qq.poll();
	            
	            ArrayList<String>nbrs=transformation(rp.word,set);
	            
	            for(String str:nbrs){
	                
	                if(str.equals(endWord)){
	                    return rp.depth+1;
	                }
	                
	                qq.add(new Pair(str,rp.depth+1));
	            }
	            
	            
	        }
	        
	        return 0;
	        
	    }
	    
	    public ArrayList<String>transformation(String word,HashSet<String>set){
	        
	        int n=word.length();
	        StringBuilder sb=new StringBuilder(word);
	        ArrayList<String>ans=new ArrayList<>();
	        for(int i=0;i<n;i++){
	            
	            char temp=sb.charAt(i);
	            
	            for(char c='a';c<='z';c++){
	                //because we will add similar character in our queue are depth would increased unnneccesaryrilyy
	                if(temp==c){
	                    continue;
	                }
	                
	                sb.setCharAt(i,c);
	                
	                if(set.contains(sb.toString())){
	                    ans.add(sb.toString());
	                    set.remove(sb.toString());
	                    
	                }
	                
	                
	            }
	            
	            sb.setCharAt(i,temp);
	            
	            
	        }
	        
	        return ans;
	    }
	    
	    
	    class Pair{
	        String word;
	        int depth;
	        public Pair(String word,int depth){
	            this.word=word;
	            this.depth=depth;
	        }
	    }

}
