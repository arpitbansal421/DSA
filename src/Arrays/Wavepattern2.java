package Arrays;

public class Wavepattern2 {
	//vertical wave
	public static void main(String[] args) {
		int[][]arr= {{1,5,9},{10,6,2},{3,7,11},{12,8,4}};
		printwave(arr);
	}
	
	public static void printwave(int[][]arr) {
		
		for(int c=0;c<arr[0].length;c++) {
			if(c%2==0) {
				for(int r=0;r<arr.length;r++) {
					System.out.print(arr[r][c]+" ");
				}
			}else {
				for(int r=arr.length-1;r>=0;r--) {
					System.out.print(arr[r][c]+" ");
				}
			}
			System.out.println();
		}
	}

}
