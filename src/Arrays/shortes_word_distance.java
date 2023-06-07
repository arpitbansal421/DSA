package Arrays;

import java.util.*;
/*
 * 
 *924 · Shortest Word Distance
 *Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 * 
 * the basic logic in this question is let us take two ball example let us say we have two balls one red and anthor blue
 * so we are here intrested in finding the distance between balls
 * so if we got blue fist so we not its distance and then a red ball so we will basically mark their 
  *update the shortest distance
  *NOTE IF WE GOT TWO CONSECUTIVE BLUE BALL OR RED BALL WE WILL TAKE THE BALL WHICH GOT
  *WE CAN TAKE AN EXAMPLE IF WE GOT BLUE AT 0 INDEX AND THEN AGAIN BLUE BALL AT 3 INDEX AND THEN A RED BALL AT 5 INDEX
  *SO WE CONSIDER THE DISTANCE BETWEEN 3 AND 5 INDEX AS IT IS MINIMUM
 */
public class shortes_word_distance {
	 public int shortestDistance(String[] words, String word1, String word2) {
	        // Write your code here
	        int ans=Integer.MAX_VALUE;
	        int r=-1;
	        int b=-1;

	        for(int i=0;i<words.length;i++){
	            
	            if(words[i].equals(word1)){
	            
	                r=i;
	            }
	            if(words[i].equals(word2)){
	              
	                b=i;
	            }

	            if(r!=-1 && b!=-1){
	                ans=Math.min(ans,Math.abs(r-b));
	            }
	        }



	        return ans;

	    }

}
