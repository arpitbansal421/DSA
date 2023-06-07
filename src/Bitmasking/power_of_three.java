package Bitmasking;
//27-27/3--9/3-3--3/3-1
public class power_of_three {
	
public boolean isPowerOfThree(int n) {
        
        
        if(n==1){
            return true;
            
        }
        
        if(n%3!=0 || n==0){
            return false;
        }
        
        return isPowerOfThree(n/3);
    }

}
