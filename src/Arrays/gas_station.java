package Arrays;

//their are n gas station along a circular route where the amount of gas is of infinite supply 
//you have a car with unlimited tank and it cost cost[i] to travel from ith to i+1 station
//you begin your journey with empty tank
//calculate the start point
//agar total gas is greater than gas in tank then the answer will not be possible
public class gas_station {
	
	public static void main(String[]args) {
		int[]gas= {1,2,3,4};
		int[]cost= {1,5,1,1};
		System.out.println(start_index(gas,cost));
		
		
	}

	private static int start_index(int[] gas, int[] cost) {
		
		// TODO Auto-generated method stub
		int val=0;
		//checking whether answer is possible or not
		for(int i=0;i<cost.length;i++) {
			val+=(gas[i]-cost[i]);
			
		}
		if(val<0) {
			return -1;
		}
		int curr=0;
		int startindex=0;
		//if curr becomes negative than it impossible to have a starting index before it because each time we to cross it and 
		//become negative;
		for(int i=0;i<cost.length;i++) {
			curr+=gas[i]-cost[i];
			if(curr<0) {
				curr=0;
				startindex=i+1;
				
			}
			
		}
		
		return startindex;
		
		
		
	}

}
