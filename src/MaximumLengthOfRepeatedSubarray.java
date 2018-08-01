// Same idea of Longest Common Substring

public class MaximumLengthOfRepeatedSubarray {
	public int findLength(int[] A, int[] B) {
		if(A==null || B==null) return 0;
		int maxLen = 0;
		int m = A.length;
		int n = B.length;
	    int[][] table = new int[m+1][n+1];
	 
	    for (int i = 1; i <= m; i++) {
	        for (int j = 1; j <= n; j++) {
	            if (A[i-1]==B[j-1]) {
	                table[i][j] = table[i - 1][j - 1] + 1;
	                if (table[i][j] > maxLen) maxLen = table[i][j];	// maxLen = Math.max(maxLen, table[i][j]);
	            }
	        }
	    }
	    return maxLen;
	}
}
