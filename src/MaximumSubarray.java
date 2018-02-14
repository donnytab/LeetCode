public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int currentMax = nums[0];
		for(int i=0; i<nums.length; i++) {
			max = Math.max(max + nums[i], nums[i]);
			currentMax = Math.max(currentMax, max);
		}
		return currentMax;
	}
	
	// DP Solution
	public int maxSubArrayDP(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = nums[0];
		int max = dp[0];
		
		for(int i=0; i<n; i++) {
			dp[i] = nums[i] + dp[i-1]>0?dp[i-1]:0;
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
