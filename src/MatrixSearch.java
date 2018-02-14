
public class MatrixSearch {
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) {
			return false;
		}
        if(matrix[0].length==0) {
            return false;
        }
		
		int m = matrix.length;
		int n = matrix[0].length;
		int range = 0;
		
		for(int i=0; i<m; i++) {
			if(target>=matrix[i][0] && target<=matrix[i][n-1]) {
				range = i;
			}
		}
		
		for(int j=0; j<n; j++) {
			if(target == matrix[range][j]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int target = -9;
		int[][] matrix = {{1,   3,  5,  7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 50}};
		System.out.println(searchMatrix(matrix, target));
	}
}
