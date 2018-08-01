import java.util.Arrays;

/*
Input:
nums = [1,3,1]
k = 1
Output: 0 
Explanation:
Here are all the pairs:
(1,3) -> 2
(1,1) -> 0
(3,1) -> 2
Then the 1st smallest distance pair is (1,1), and its distance is 0.

https://www.cnblogs.com/grandyang/p/8627783.html
 */
public class FindKthSmallestPairDistance {
	// Binary solution
	public int smallestDistancePair(int[] nums, int k) {
		Arrays.sort(nums);
		int n = nums.length;
		int low = 0;
		int high = nums[n-1] - nums[0];
		while(low < high) {
			int cnt = 0;
			int j = 0;
			int mid = (high + low)/2;
			for(int i=0; i<n; i++) {
				while(j<n && nums[j]-nums[i]<=mid) j++;
				cnt += j-i-1;
			}
			if(cnt >= k) {
				high = mid;
			} else {
				low = mid +1;
			}
		}
		return low;
	}
	
	// Bucket Sort solution, O(n^2)
	public int smallestDistancePairWithBucketSort(int[] nums, int k) {
		int len = nums.length;
		int len2 = 1000000;
		int[] dp = new int[len2];
		for(int i=1; i<len; i++) {
			for(int j=0; j<i; j++) {
				int dif = Math.abs(nums[i]-nums[j]);
				dp[dif]++;
			}
		}
		
		int sum=0;
		for(int i=0; i<len2; i++) {
			sum+=dp[i];
			if(sum>=k) return i;
		}
		return 0;
	}
}
