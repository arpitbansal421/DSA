package binary_search;
import java.util.*;

//bookallocation
//given n books and m pages to read such that maximum students reads the minimum no of pages

public class BookAllocation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int nob=sc.nextInt();
			int nos=sc.nextInt();
			int[]pages=new int[nob];
			for(int i=0;i<pages.length;i++) {
				pages[i]=sc.nextInt();
			}
			System.out.println(Minimum_pages(nob,nos,pages));
			
			
		}
	}

	private static int  Minimum_pages(int nob, int nos, int[] pages) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=0;
		int ans=0;
		for(int val:pages) {
			hi+=val;
		}
	
	
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
		
			
			
			if(isitpossible(nob,nos,pages,mid)) {
				hi=mid-1;
				ans=mid;
				
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
		
	}

	private static boolean isitpossible(int nob, int nos, int[] pages,int mid) {
		int readpage=0;
		int student=1;
		for(int i=0;i<pages.length;) {
	
			
			if(readpage+pages[i]<=mid) {
				
				readpage+=pages[i];
				i++;
				
				
			}else {
			
				student++;
				readpage=0;
			}
			if(student>nos) {
				return false;
			}
			
		}
		// TODO Auto-generated method stub
		return true;
	}

}
