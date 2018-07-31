// DP solution
// dp(i, j) represents whether s(i ... j) can form a palindromic substring, 
// dp(i, j) is true when s(i) equals to s(j) and s(i+1 ... j-1) is a palindromic substring
// Time complexity O(n^2).
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		int n = s.length();
		String res = "";
		boolean[][] palinDP = new boolean[n][n];
		
		for(int i=n-1; i>=0; i--) {
			for(int j=i; j<n; j++) {
				palinDP[i][j] = s.charAt(i) == s.charAt(j) && (j-i<3 || palinDP[i+1][j-1]);
				
				if(palinDP[i][j] && (res==null || j-i+1>res.length())) {
					res = s.substring(i, j+1);
				}
			}
		}
		return res;
	}
}
