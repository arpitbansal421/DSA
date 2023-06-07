package Binary_tree;

import java.util.*;
/*
 * If the depth of a tree is smaller than 5, then this tree can be represented by a list of three-digits integers.

For each integer in this list:

1.The hundreds digit represents the depth D of this node, 1 <= D <= 4.
2.The tens digit represents the position P of this node in the level it belongs to, 1 <= P <= 8. 
The position is the same as that in a full binary tree.
3.The units digit represents the value V of this node, 0 <= V <= 9.

Given a list of ascending three-digits integers representing a binary tree with the depth 
smaller than 5, you need to return the sum of all paths from the root towards the leaves.
 * 
 * 
 */

public class pathsum_1V {
	public int pathSumIV(int[] nums) {
        // Write your code here.

        int[]node=new int[16];
        Arrays.fill(node,-1);
        for(int ele:nums){
            int unit=ele%10;
            
            int tens=(ele/10)%10;
            int hundren=(ele/100)%10;
            
            int pos=(int)(Math.pow(2,hundren-1))+(tens-1);
           
            node[pos]=unit;
        }
        Queue<Pair>qq=new LinkedList<>();
        int sum=0;
        qq.add(new Pair(1,node[1]));

        while(!qq.isEmpty()){
            Pair pp=qq.remove();
           //we will only calculate our answer only at leave node because it hold the sum of entire path
            if((2*pp.idx>=16 && 2*pp.idx+1>=16)||(node[2*pp.idx]==-1 &&node[2*pp.idx+1]==-1)){
                sum+=pp.pathsum;}
           
            //left child 
            if(2*pp.idx<16 &&node[2*pp.idx]!=-1){
                qq.add(new Pair(2*pp.idx,pp.pathsum+node[2*pp.idx]));
            }
            //right child
            if(2*pp.idx+1<16 &&node[2*pp.idx+1]!=-1){
                qq.add(new Pair(2*pp.idx+1,pp.pathsum+node[2*pp.idx+1]));
            }
        }
        return sum;
    }

    class Pair{
        int idx;
        int pathsum;
        public Pair(int idx,int pathsum){
            this.idx=idx;
            this.pathsum=pathsum;
        }
    }

}
