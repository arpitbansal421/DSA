package Arrays;
import java.util.*;
public class twin_string {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=count(str,0,2);
		System.out.print(k);
	}

	private static int count(String str, int i, int j) {
		// TODO Auto-generated method stub
		int count=0;
		if(j>=str.length()) {
			return 0;
		}
		if(str.charAt(i)==str.charAt(j)) {
			count++;
		}
		return count(str,i+1,j+1)+count;
	}

}
