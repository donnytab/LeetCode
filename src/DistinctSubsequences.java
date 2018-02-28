/*
Given a string S and a string T, count the number of distinct subsequences of S which equals T.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

Here is an example:
S = "rabbbit", T = "rabbit"

Return 3.
 */
public class DistinctSubsequences {
	public static int numDistinct(String S, String T) {
	    int[][] mem = new int[T.length()+1][S.length()+1];

	    for(int j=0; j<=S.length(); j++) {
	        mem[0][j] = 1;
	    }
	    
	    for(int i=0; i<T.length(); i++) {
	        for(int j=0; j<S.length(); j++) {
	            if(T.charAt(i) == S.charAt(j)) {
	                mem[i+1][j+1] = mem[i][j] + mem[i+1][j];
	            } else {
	                mem[i+1][j+1] = mem[i+1][j];
	            }
	        }
	    }
	    
	    return mem[T.length()][S.length()];
	}
	
	public static void main(String[] args) {
		String S = "rabbbit";
		String T = "rabbit";
		System.out.println(numDistinct(S,T));
	}
}
