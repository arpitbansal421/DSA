package Recurssion;

import java.util.*;
public class Letter_tile_combination {
    public int numTilePossibilities(String tiles) {

        int[]freq=new int[26];//1079. Letter Tile Possibilities
        /*You have n  tiles, where each tile has one letter tiles[i] printed on it.

Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.
         * 
         * 
         */
        //we are basically making frequency array to note of no of character as on each level we are counting are
        //and we are basically selecting each character
        /*for ex aba --a we count this character and append to our ans
         * and we can hold duplicity of the tree as we are using indicies as a character
         * 
         * draw recurssion tree for better understanding
         * 
         * 
         */

        for(int i=0;i<tiles.length();i++){
            freq[tiles.charAt(i)-'A']++;
        }

        return numTilePossibilities(freq,"");  
    }

    public int numTilePossibilities(int[]freq,String ans){

        int res=0;

        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                freq[i]--;
                char ch=(char)('A'+'i');
                res+=numTilePossibilities(freq,ans+ch)+1;
                freq[i]++;
            }
        }

        return res;
    }

}
