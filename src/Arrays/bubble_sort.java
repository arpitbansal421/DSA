package Arrays;

//principle--works on the the principle of sinking the largest element on one side
//no of passes n-1
//best case scenerio---sorted element
//repeatative comarision

public class bubble_sort {
	
	public static void main(String[]args) {
		int[]arr= {0,4,3,2,1};
		
		for(int pass=1;pass<arr.length;pass++) {
			for(int j=0;j<arr.length-pass;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			                                       
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
        while(i<s.length()&& j<t.length()){

            if(s.charAt(i)!=t.charAt(j)){
                count++;
            }
            if(count>2){
                return false;
            }
            i++;
            j++;
        }
		
	}

}
