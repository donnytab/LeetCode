/*
Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
 */
public class LongestIncreasingSubsequence {
	public int lengthOfLIS (int[] nums) {
		int size = 0;
		int[] sub = new int[nums.length];
	    
	    for (int digit : nums) {
	        int i = 0, j = size;
	        while (i != j) {
	            int mid = (i + j) / 2;
	            if (sub[mid] < digit)
	                i = mid + 1;
	            else
	                j = mid;
	        }
	        sub[i] = digit;
	        if (i == size) 
	        	size++;
	    }
	    return size;
	}
}
