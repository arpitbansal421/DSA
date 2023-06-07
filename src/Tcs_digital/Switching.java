package Tcs_digital;

import java.util.*;
public class Switching {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[]app=new int[n];
		int []web=new int[m];
		//app wala array fill karna
		for(int i=0;i<app.length;i++) {
			app[i]=sc.nextInt();
		}
		
		//web wala array
		for(int i=0;i<web.length;i++) {
			web[i]=sc.nextInt();
		}
		Arrays.sort(app);
		Arrays.sort(web);
		int k=switching(app,web);
		System.out.println(k);
	}
	
	public static int switching(int []app,int []web) {
		//phele jonsa minumum hn usse start karenge
		int s=0;
		
		int i=1;
		int j=1;
		if(app[0]<web[0]) {
			
			boolean a=false;
			while(i<app.length&& j<web.length) {
				
				
				if(app[i]<web[j]) {
					i++;
					if(a) {
						s++;
						a=true;
					}
					
					
				}else {
					j++;
					s++;
					a=true;
					   
				}
				
			}}
			
			
		
			//agar web ka chota  hn tu
			if(app[0]>=web[0]) {
			
				
				boolean a=false;
				while(i<app.length &&j<web.length) {
					
					
					if(app[i]<web[j]) {
						i++;
						s++;
						a=true;
						
						
						
					}else {
						j++;
						if(a) {
							s++;
							a=false;
						}
						
					}
					
				}
				
			}
			
			if(i!=app.length || j!=web.length) {
				s++;
			}
			
			
		
	
				
			return s;
			}
	
	
	
	
			
	
		
		
		
	}


