
public class UniquePath {
	public static int uniquePaths(int m, int n) {
		int[][] dp = new int [m][n];
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++) {
				if(i==0 || j==0) {
					dp[i][j] = 1;
				}
				else {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
				}
			}
		return dp[m-1][n-1];
	}
	
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	
    	obstacleGrid[0][0]^=1;
    	
    	for(int i=0; i<m; i++) {
    		obstacleGrid[i][0] = (obstacleGrid[i][0]==1)? 0:obstacleGrid[i-1][0];
    	}
    	
    	for(int j=0; j<n; j++) {
    		obstacleGrid[0][j] = (obstacleGrid[0][j]==1)? 0: obstacleGrid[0][j-1];
    	}
    	
        for(int i=1; i<m; i++)
        	for(int j=1; j<n; j++) {
    			obstacleGrid[i][j] = (obstacleGrid[i][j]==1)?0: obstacleGrid[i][j-1] + obstacleGrid[i-1][j];
        	}
        return obstacleGrid[m-1][n-1];
    }
	
	public static void main(String[] args) {
		int[][] dp = new int [1][2];
		int[][] obg = {{0,0,0},{0,1,0},{0,0,0}};
//		System.out.println(uniquePaths(10,8));
		System.out.println(uniquePathsWithObstacles(obg));
	}
}
