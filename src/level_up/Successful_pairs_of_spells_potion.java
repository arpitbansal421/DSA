package level_up;

//leetcode 
import java.util.*;
public class Successful_pairs_of_spells_potion {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long success=sc.nextLong();
		int[]potions=new int[n];
		int[]spells=new int[k];
		for(int i=0;i<n;i++) {
			potions[i]=sc.nextInt();
		}
		
		for(int i=0;i<k;i++) {
			spells[i]=sc.nextInt();
		}
		
		int[]res=successfulPairs(spells,potions,success);
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
		
		
		
		
	}
	
public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        
        ArrayList<Integer>ll=new ArrayList<>();
        
        int mod=100_000_007;
        
        for(int i=0;i<spells.length;i++){
        	int ans=0;
            
            int si=0;
            int ei=potions.length-1;
            
            
            while(si<=ei){
                int mid=(si+ei)/2;
                
                if((spells[i]*potions[mid]%mod)%mod>=success) {
                	System.out.println((spells[i]*potions[mid]%mod)%mod);
//                	System.out.println(mid);
                	
                	ans=ans%mod+(ei-mid+1)%mod;
                	ei=mid-1;
                
            }else {
            	si=mid+1;
            }
  
                
            }
            
            ll.add(ans);
    
    }
        
        int[]res=new int [ll.size()];
        
        for(int i=0;i<ll.size();i++) {
        	res[i]=ll.get(i);
        }
        
        return res;

}
	
	

}
