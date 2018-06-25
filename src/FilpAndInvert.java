/*
Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*/

public class FilpAndInvert {
	public int[][] filpAndInvert(int[][] A) {
		int len = A[0].length;
		for(int i=0; i<len; i++) {
			// Invert first
			for(int j=0; j<len; j++) {
				A[i][j] ^= 1;
			}
			
			// Flip
			for(int k=0; k<len/2; k++) {
				int temp = A[i][k];
				A[i][k] = A[i][len-k-1];
				A[i][len-k-1] = temp;
			}
		}
		return A;
	}
}
