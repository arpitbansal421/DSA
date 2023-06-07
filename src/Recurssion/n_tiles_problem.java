package Recurssion;

//given a board of m*n and a tile of n*1 print the no of ways to add tiles to the board
/*actually we are assuming nx4 floor n is breadth of the floor 4 is the height of floor
 * and 1x4 is the bradth and hieght of files
 * so firstly the base case n<4 is 3x4,2x4,1x4 their we can only alll tiles vertically draw a matrix and verify the ans
 * so in such cases return 1
 * and you can verify other cases by drawing an acuurate nmatrix
 * 
 * 
 * 
 */

public class n_tiles_problem {
	
	public static void main(String[]args) {
		int m=6;
		int n=4;
		int k=no_ways(m);
		System.out.println(k);
		
	}

	private static int no_ways(int n) {
		if(n<4) {
			return 1;
		}
		// TODO Auto-generated method stub
		int h=no_ways(n-4);
		int v=no_ways(n-1);
		return h+v;
	}

}
