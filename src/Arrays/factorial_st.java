package Arrays;

public class factorial_st {
	public static void main(String[] args) {
		int a=4;
		int ans=1;
		while(a>0) {
			ans*=a;
			a--;
		}
		
		System.out.println(ans);
	}

}
