package Arrays;

//insertion sort--this type of sorting algorithm works on the principal that the single element in array is sorted element so it
// breaks an array into 0 && n-1 length array and we try to find the correct poistion of element in n-1 array and we constaantly
//increse our sorted array
//ex2 3 1 4 5
//2|3 1 4 5
//2 3|1 4 5
//2 1 3|4 5
//1 2 3|4 5
//1 2 3 4|5
//1 2 3 4 5

//no of passes n-1

public class Insertion_sort {
	
	public static void  main(String[]args) {
		int[]arr= {5,4,3,2,1};
		for(int pass=1;pass<arr.length;pass++) {
			int j=pass-1;
			int item=arr[pass];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				
				
//					item=temp;//har baar mera item change ho rha rha
					
					
				
				j--;
				
			}
			j++;
			arr[j]=item;
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
