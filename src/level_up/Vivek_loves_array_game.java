package level_up;
import java.util.*;
public class Vivek_loves_array_game {
    public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		while(t-->0){
			int n=sc.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
		
			int ans=kpartion(arr,0,arr.length-1);
			System.out.println(ans);
		}

    }

	public static int kpartion(int []arr,int si,int ei){
		int total=0;

		

		for(int i=si;i<=ei;i++){
			total+=arr[i];

		}

		if(total%2!=0){
            
			return 0;
		}
	   
		if((ei)<=si){
			System.out.println(ei-si+1);
		 
			return 0;
		}

		total=total/2;

		int curr=0;

		int ans=0;

		for(int i=si;i<=ei;i++){

            
			

			curr+=arr[i];
			if(curr==total){
				ans=1+Math.max(kpartion(arr,0,i),kpartion(arr,i+1,ei)); 
			}
		}

		return ans;

		
		
	}


}
