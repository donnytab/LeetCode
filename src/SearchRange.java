import java.util.Arrays;

public class SearchRange {
	static int max = Integer.MAX_VALUE;
	static int min = Integer.MIN_VALUE;
	static boolean flag = true;
	public int[] searchRange(int[] nums, int target) {
		int len = nums.length;
		
		if(flag) {
			max = len/2;
			min = len/2;
			flag = false;
		}
		
		if(target == nums[len/2]) {
			if(len/2 < min) min = len/2;
			if(len/2 > max) max = len/2;
		}
		
		if(target < nums[len/2]) {
			searchRange(Arrays.copyOfRange(nums, 0, len/2), target);
		}
		
		if(target > nums[len/2]) {
			searchRange(Arrays.copyOfRange(nums,  len/2 + 1, len - 1), target);
		}
		
		if(nums.length == 1)
			return new int[] {min, max};
		return new int[] {-1, -1};
	}
}
