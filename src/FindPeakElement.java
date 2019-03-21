/*
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5 
 * */
public class FindPeakElement {
	public int findPeakElement(int[] nums) {
		int len = nums.length;
		if(len == 1) return 0;
		
		int left = 0, right = len - 1;
		while(left < right - 1) {
			int mid = (right + left)/2;
			if(nums[mid] < nums[mid+1]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return (left == len - 1 || nums[left] > nums[left+1]) ? left : right;
	}
}
