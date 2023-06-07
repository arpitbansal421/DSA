package Tcs_digital;
//similar to n queen problem
import java.util.*;
public class odd_even {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int h=sc.nextInt();
		
		int k=sc.nextInt();
		boolean[]board=new boolean[h+1];
//		ArrayList<Integer>list=new ArrayList<>();
		int ans=Oddeven(board,k,0,l,h,0);
		System.out.println(ans);
	}
	
	
	public static int Oddeven(boolean[]board,int tq,int qpsf,int l,int h,int sum) {
		
		//base condition
		if(tq==qpsf) {
//			System.out.println("hi");
			if(sum%2==0) {
//				System.out.println(sum);
				return 1;
			}
			return 0;
		}
		
		int res=0;
		for(int i=l;i<=h;i++) {
//			if(!board[i]) {
//				board[i]=true;//first queen is placed
				
				res+=Oddeven(board,tq,qpsf+1,l,h,sum+i);
//			
//				board[i]=false;//undo step1 10 2
				
			}
		 return res;
		}
		
	
	}
	
	
	
	

	