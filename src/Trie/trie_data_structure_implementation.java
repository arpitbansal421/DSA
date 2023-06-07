package Trie;
import java.util.*;
public class Trie {
	 public class Node{
	        char data;//to store the data member
	        boolean terminal;//to mark the terminal
	        HashMap<Character,Node>children=new HashMap<>();//store the children of the tree
	        
	        public Node(char ch){
	            this.data=ch;
	            this.terminal=false;
	        }
	        
	    }
	    
	    private Node root;
	    public Trie() {
	        
	        this.root=new Node('*');
	        
	        
	    }
	    
	    public void insert(String word) {
	        
	        Node curr=this.root;
	        for(int i=0;i<word.length();i++){
	        	
	            char ch=word.charAt(i);
	            
	            if(curr.children.containsKey(ch)){
	                curr=curr.children.get(ch);
	            }else{
	                Node nn=new Node(ch);
	                curr.children.put(ch,nn);
	                curr=nn;
	            }
	        }
	        
	        curr.terminal=true;
	    }
	    
	    public boolean search(String word) {
	        
	           Node curr=this.root;
	        for(int i=0;i<word.length();i++){
	            char ch=word.charAt(i);
	            
	            if(!curr.children.containsKey(ch)){
	                return false;
	            }
	            curr=curr.children.get(ch);
	        
	        
	    }
	        return curr.terminal;
	    }
	    
	    public boolean startsWith(String word) {
	    	
	               Node curr=this.root;
	        for(int i=0;i<word.length();i++){
	            char ch=word.charAt(i);
	            
	            if(!curr.children.containsKey(ch)){
	                return false;
	            }
	            curr=curr.children.get(ch);
	        
	        
	    }
	        
	        return true;
	      
	        
	    }

}
