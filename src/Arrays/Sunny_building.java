package Arrays;


import java.util.*;
public class Sunny_building {
	
	    public static void main (String args[]) {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();

			while(t-->0){
				int n=sc.nextInt();
				int[]arr=new int[n];
				for(int i=0;i<arr.length;i++){
					arr[i]=sc.nextInt();
				}
				System.out.println(sunnybuilding(arr));
			}


	    }

		public static int sunnybuilding(int[]arr){
			
			int max=Integer.MIN_VALUE;
			int ans=0;
			for(int i=0;i<arr.length;i++){

				if(max<=arr[i]){
					max=arr[i];
					ans++;
				}
			}
			return ans;
		
	}

}
