package Heap;
import java.util.*;
public class Heap {
	//complete binary tree if tree height is h all the levels upto h-1 level must be fill
	//if parent index is p the left child index 2*p+1
	//and right child index is 2*p+2
	//if child index is c1 then parent index pi=ci-1/2
	private ArrayList<Integer>list=new ArrayList<>();
	//basically by this method we add an item to our heap
	
	//we maintain the property of complete binary tree 
	//min heap me minimum value sabse upper hoti hn
	public void add(int item) {
		
		list.add(item);
		
		upheapify(list.size()-1);
		
	}
	
	private void upheapify(int ci) {
		int pi=(ci-1)/2;
		
		if(list.get(pi)>list.get(ci)) {
			this.swap(ci, pi);;
			this.upheapify(pi);
			
		}
	}
	
	private void swap(int ci,int pi) {
		
		int ith=this.list.get(pi);
		int jth=this.list.get(ci);
		
		this.list.set(pi,jth);
		this.list.set(ci,ith);
	}
	
	
	//downheapify function
	
	private void downheapify(int pi) {
		
		
		int lc=2*pi+1;
		int rc=2*pi+2;
		
		int mini=pi;
		
		if(lc<this.list.size()&&this.list.get(lc)<this.list.get(mini)) {
			mini=lc;
		}
		if(rc<this.list.size()&&this.list.get(rc)<this.list.get(mini)) {
			mini=rc;
		}
		
		if(mini!=pi) {
			swap(mini,pi);
			downheapify(mini);
		}
	}
	
	public int remove() {
		int rv=this.list.get(0);
		swap(0,this.list.size()-1);
		this.list.remove(this.list.size()-1);
		downheapify(0);
		return rv;
		
	}
	
	public int get() {
		return this.list.get(0);
	}
	
	public int size() {
		return this.list.size();
	}
	
	
	public static void main(String[] args) {
		
		Heap hp=new Heap();
		hp.add(0);
		hp.add(1);
		hp.add(2);
		hp.add(5);
		hp.remove();
		  
		hp.add(6);
		
	}
	
	
	

}
