package Dynamic_programming;


import java.util.*;
public class TUGHLAQ_COIN_EXCHANGE {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
//		long[]dp=new long[n+1];
//		Arrays.fill(dp, -1);
		long k=maxamount(n);
		System.out.print(k);
		
	}

	static HashMap<Long,Long>map=new HashMap<>();
	private static long maxamount(long n) {
		// TODO Auto-generated method stub
		
		//base condition
		
		if(n==0) {
			return 0;
		}
		
		
		if(map.containsKey(n)) {
			return map.get(n);
		}
		
		map.put(n,Math.max(n, maxamount(n/2)+maxamount(n/4)+maxamount(n/3)));
		
		
	
		
		return map.get(n);
		
		
		

}}
