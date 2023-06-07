package HashMap;

import java.util.*;
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
//typically using all the original letters exactly once.
public class group_Anagrams {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[]list=new String[n];
		
		
		for(int i=0;i<n;i++) {
			list[i]=sc.next();
		}
		
		HashMap<String, ArrayList<String>>map=new HashMap<>();
		ArrayList<ArrayList<String>>li=anagrams(list,map);
		
		System.out.println(li);
	
		
		
		
	}
	
	public static ArrayList<ArrayList<String>> anagrams(String[]list,HashMap<String,ArrayList<String>>map){
		//now in this hashmap we
		//store string and integer as a key value pair basically we create a unigue 
		//string for each pair
		for(int i=0;i<list.length;i++) {
			int[]freq=new int[26];//we are assinging the size as 26 because only lowe case character are given in the question
			//iterating through the entire array
			String str="";
			//now iterating through each character of the string
			for(int j=0;j<list[i].length();j++) {
				char ch=list[i].charAt(j);
				
				
				freq[ch-'a']++;
				
			}
			for(int j=0;j<freq.length;j++) {
				if(freq[j]>=10) {
					str+="x";
					str+=freq[j];
					str+="x";
							
				}
				else {
					
					str+=freq[j];
				}
			}
			
			//now putting it into the map
			if(!map.containsKey(str)) {
				map.put(str, new ArrayList<String>());
			}
				map.get(str).add(list[i]);
			
		}
		
		ArrayList<ArrayList<String>>li=new ArrayList<>();
		for(String key:map.keySet()) {
			
			li.add(map.get(key));
		}
		
		return li;
		
		
	}

}
