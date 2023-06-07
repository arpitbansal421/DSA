package Arrays;

import java.util.*;

/*187. Repeated DNA Sequences
 * 
 * The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) 
that occur more than once in a DNA molecule. You may return the answer in any order.
 * 
 * 
 * 
 */

public class Reapeted_DNA_sequence {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String>seen=new HashSet<>();
        HashSet<String>repeated=new HashSet<>();

        for(int i=0;i+9<s.length();i++){

            String str=s.substring(i,i+10);

            if(seen.contains(str)){
                repeated.add(str);
            }
            seen.add(str);


        }

        return new ArrayList<>(repeated);

        
}

}
