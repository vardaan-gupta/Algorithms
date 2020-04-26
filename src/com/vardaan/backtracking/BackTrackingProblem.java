package com.vardaan.backtracking;
/*
 * N Queen problem
 */
public class BackTrackingProblem {
	
	private static int n =4;

	public static void main (String args[]) {		
		int [] queens = new int[n];
		
	   check(0,queens) ;
		
		 
	}
	
	
	



	/*
	  
	 */
	static void check(int k , int[]  queens) {	

		if (k == queens.length) {
			printQueens(queens);
		} else {
			for (int i = 0; i < queens.length ; i++) {
				queens[k] = i;
				if (conditions(queens, k)) {
					 check(k+1, queens);
				}

			}
		}
		
	}
	
	
	 /***************************************************************************
	    * Prints n-by-n placement of queens from permutation q in ASCII.
	    ***************************************************************************/
		
		private static void printQueens(int[] queens) {
		for (int i = 0; i < n; i++) {
			int queensPosition = queens[i];
			for (int j = 0; j < n; j++) {
				if (j == queensPosition) {
					System.out.print("Q ");
				} else {
					System.out.print("* ");
				}

			}
			System.out.println();

		}
		System.out.println();
			
		}
		
		 /***************************************************************************
		    * Return true if queen placement q[n] does not conflict with
		    * other queens q[0] through q[n-1]
		    ***************************************************************************/		
		private static boolean conditions(int[] queens, int k) {
		
			for (int i = 0; i < k; i++) {
				if (queens[k] == queens[i] )  return false; // same column
				if (k- queens[k] == i - queens[i]) return false;
				if (k+ queens[k] == i + queens[i]) return false;
				
			}
			return true;
			
		}
	
}
