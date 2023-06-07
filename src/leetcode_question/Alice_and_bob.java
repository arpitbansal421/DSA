package leetcode_question;

//question no 236

//Alice and Bob play a game with piles of stones. 
//There are an even number of piles arranged in a row, 
//and each pile has a positive integer number of stones piles[i].
//
//The objective of the game is to end with the most stones. 
//The total number of stones across all the piles is odd, so there are no ties.
//
//Alice and Bob take turns, with Alice starting first.
//Each turn, a player takes the entire pile of stones either from the beginning or from the end of the row. 
//This continues until there are no more piles left, at which point the person with the most stones wins.

//ans-similar to optimal game strtegey
public class Alice_and_bob {
	
	public static void main(String[]args) {
		
	}
	
	public boolean stonegame(int[]piles,int i,int j,int a,int b) {
		
		if(i>j) {
			if(a>b) {
				return true;
			}
			return false;
		}
		
	   
		
		
	}
	


}
