package Backtracking;

//given a 2d matrix search a word from matrix
public class word_search {
	public static void main(String[]args) {
		
		char[][]wordboard= {{'A','B','C', 'E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word="ABCCE";
		boolean ans=false;
		for(int i=0;i<wordboard.length;i++) {
			for(int j=0;j<wordboard[0].length;j++) {
				if(wordboard[i][j]!=word.charAt(0)) {
					continue;
				}
				ans=WordSearch(wordboard,i,j,word,0);
				if(ans) {
					return;
				}
				
				
			}
		}
//		if(ans) {
//			System.out.println(ans);
//			return;
//		}
//		System.out.println(ans);
	}
//
//	private static boolean wordsearch(char[][] wordboard, String word, int cc, int cr, int idx) {
//		//base case
//		if(idx==word.length()) {
////			System.out.println("hi");
//			
//			return true;
//		}
//		if(cr<0||cr>=wordboard.length||cc<0||cc>=wordboard.length||wordboard[cr][cc]!=word.charAt(idx)) {
//			
//			return false;
//			
//		}
//		//positive base condition
//		// TODO Auto-generated method stub
//		//bulding row and coloumn array for recursive calls
//		int[]r= {-1,0,0,1};//row array
//		int[]c= {0,1,-1,0};
//		boolean ans=false;
//		wordboard[cr][cc]='*';//is visited
//		
//		//now applying different recurssive calls
//		for(int i=0;i<r.length;i++) {
//			
//			ans=wordsearch(wordboard,word,cc+c[i],cr+r[i],idx+1);
//			if(ans) {
//				return ans;
//			}
//			
//		}
//		wordboard[cr][cc]=word.charAt(idx);
//
//		
//		
//		return ans;
	
	
//	}
	
//	public class Word_Search {

//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			String word = "ABCCED";
//			char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
//			boolean ans = false;
//			for (int i = 0; i < board.length; i++) {
//				for (int j = 0; j < board[0].length; j++) {
//					if(word.charAt(0)!=board[i][j]){
//	                    continue;
//	                }
//					ans = WordSearch(board, i, j, word, 0);
//					if (ans) {
//						System.out.println(ans);
//						return;
//					}
//				}
//			}
//
//		}

		public static boolean WordSearch(char[][] board, int cr, int cc, String Word, int idx) {

			if (idx == Word.length()) {
				return true;
			}

			if (cr < 0 || cr < board.length || cc < 0 || cc < board[0].length || board[cr][cc] != Word.charAt(idx)) {
				return false;
			}

			int[] r = { -1, 0, 0, 1,-1,1, 1-1};
			int[] c = { 0, 1, -1, 0,1,1,-1 ,-1};
			boolean ans = false;
			board[cr][cc] = '*';
			for (int i = 0; i < c.length; i++) {
				ans = WordSearch(board, cr + r[i], cc + c[i], Word, idx + 1);
				if (ans) {
					return ans;
					
				}

//			}
////			board[cr][cc] = Word.charAt(idx);
			
		}
			return ans;

	}}


