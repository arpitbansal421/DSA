package Arrays;

public class Selection_sort {
	
	public static void main(String[]args) {
		int []arr= {3,5,1,0};
		
		for(int counter=0;counter<arr.length;counter++) {
			int min=counter;
			for(int i=counter+1;i<arr.length;i++) {
				if(arr[min]>arr[i]) {
					min=i;
				}
				
				
			}
			if(min!=counter) {
				int temp=arr[min];
				arr[min]=arr[counter];
				arr[counter]=temp;
			}
		}
		
		//printing elements
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
