package Trie;
import java.util.*;
public class Addcontanct {
	
	class Node{
		char data;//it will contain starting letter
		HashMap<Character,Node>children=new HashMap<>();
		boolean terminal;
		int count;
		public Node(char ch) {
			this.data=ch;
			this.count=1;
		}
		
		public Node() {
			
		}
		
		
		
	}
	
	private Node root;
	
	public Addcontanct() {
		
		this.root=new Node('*');
	}
	
	//insert node
	
	public void insert(String word) {
		
		Node curr=this.root;
		for(int i=0;i<word.length();i++) {
			
			char ch=word.charAt(i);
			
			if(curr.children.containsKey(ch)) {
				
				curr.count+=1;
			
				
				curr=curr.children.get(ch);
				
			}else {
				Node nn=new Node(ch);
				curr.children.put(ch,nn);
				curr=nn;
			}
		}
		
		curr.terminal=true;
		
	}
	
	//contains word
	
	public boolean search(String word) {
		Node curr=this.root;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(!curr.children.containsKey(ch)) {
				return false;
			}
			curr=curr.children.get(ch);
		}
		
		return curr.terminal;
	}
	
	//starts with
	
	public boolean StartsWith(String word) {
		Node curr=this.root;
		
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(!curr.children.containsKey(ch)) {
				return false;
			}
			
			curr=curr.children.get(ch);
		}
		
		return true;
		
	}
	
	public int Contact(String word) {
		
		Node curr=this.root;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(!curr.children.containsKey(ch)) {
				return 0;
			}
			else {
				
				if(i==word.length()-1) {
					return curr.count;
				}
				curr=curr.children.get(ch);
			}
		}
		return curr.count;
	} 
	
	public static void main(String[] args) {
		Addcontanct ad=new Addcontanct();
		ad.insert("hackerrank");
		ad.insert("hack");
		ad.insert("hacker");
		
		System.out.println(ad.Contact("hacker"));
	}
	

}
