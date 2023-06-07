package binary_search;

/*
 *The coding blocks members
 * went to the success party of their first ever online boot-camp at Murthal. 
 * They ordered P number of paranthas. The stall has L cooks and each cook has a rank R. 
 * A cook with a rank R can cook 1 parantha in the first R minutes 1 more parantha in the next 2R minutes, 
 * 1 more parantha in 3R minutes and so on(he can only cook a complete parantha) ( For example if a cook is ranked 2.. 
 * he will cook one parantha in 2 minutes one more parantha in the next 4 
 * mins and one more in the next 6 minutes hence in total 12 minutes he cooks 3 paranthas. 
 * In 13 minutes also he can cook only 3 paranthas as he does not have enough time for the 4th parantha). 
 * Calculate the minimum time needed to cook all the paranthas.
 * 
 * 
 * 
 */

public class Murthal_parantha {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        int[]r=new int[c];
        for(int i=0;i<c;i++){
            r[i]=sc.nextInt();
        }
        System.out.println(minimum_Parantha(p,r));

    }

    public static int minimum_Parantha(int parantha,int[]cook){
        Arrays.sort(cook);

        int hi=(cook[cook.length-1])*(parantha+1)*(parantha)/2;
        int lo=0;
        int ans=0;
        while(lo<=hi){

            int mid=lo+(hi-lo)/2;
            if(isitpossible(cook,parantha,mid)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;

    }

    public static boolean isitpossible(int[]cook,int parantha,int time){

        int i=0;//it will track the cook no

        int tpf=0;//time taken form same cook 

        int pno=1;//parantha no
        int total=0;//total parantha
        
        while(i<cook.length){

            if(cook[i]*pno+tpf<=time){
                tpf+=cook[i]*pno;
                pno++;//the same cook will cook next parantha
                total++;//one parantha increased in total parantha
                //next parantha assingned

            }else{
                i++;
                pno=1;
                tpf=0;
            }

            if(total>=parantha){
                return true;
            }
        }

        if(total>=parantha){
            return true;
        }
        return false;
    }
  

}
