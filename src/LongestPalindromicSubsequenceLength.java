/*
dp[i][j]: the longest palindromic subsequence's length of substring(i, j), string from index i to j
here i, j represent left, right indexes in the string
State transition:
dp[i][j] = dp[i+1][j-1] + 2 if s.charAt(i) == s.charAt(j)
otherwise, dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1])
Initialization: dp[i][i] = 1
https://www.youtube.com/watch?v=Fi5INvcmDos
 */
public class LongestPalindromicSubsequenceLength {
	public int longPalindromeSubseq(String s) {
		final int n = s.length();
		int[][] palinDP = new int[n][n];
		
		for(int i=n-1; i>=0; i--) {					// string: [i][i+1]...[j-1][j]
			palinDP[i][i] = 1;	// base case
			for(int j=i+1; j<n; j++) {
				if(s.charAt(i)==s.charAt(j)) {
					palinDP[i][j] = palinDP[i+1][j-1] + 2;
				} else {
					palinDP[i][j] = Math.max(palinDP[i+1][j], palinDP[i][j-1]);
				}
			}
		}
		return palinDP[0][n-1];
	}
}
