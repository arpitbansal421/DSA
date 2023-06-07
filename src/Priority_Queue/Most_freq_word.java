package Priority_Queue;
import java.util.*;
/*
 * Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. 
Sort the words with the same frequency by their lexicographical order.

 
 * 
 * 
 * 
 */


public class Most_freq_word {
	public static void main (String args[]) {
		HashMap<String,Integer>map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();

		for(int i=0;i<n;i++){
			String str=sc.next();
			if(!map.containsKey(str)){
				map.put(str,1);
			}else{
				map.put(str,map.get(str)+1);
			}
		}

		Most_freq_word mm=new Most_freq_word();
		mm.freqele(k,map);


    }

	public void freqele(int k,HashMap<String,Integer>map){

		PriorityQueue<Pair>pp=new PriorityQueue<>();

		for(String str:map.keySet()){
			pp.add(new Pair(str,map.get(str)));
		}

		while(k-->0){

			Pair rv=pp.remove();

			System.out.print(rv.str+" ");
		}


	}



	class Pair implements Comparable<Pair>{

		String str;
		int freq;
		public Pair(){

		}
		public Pair(String str,int freq){
			this.freq=freq;
			this.str=str;
		}

		public int compareTo(Pair o){

			if(o.freq==this.freq){

				return this.str.compareTo(o.str);
			}

			return o.freq-this.freq;
		}

	}

}
