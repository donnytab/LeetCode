import java.util.Arrays;

public class FindDuplicateNumber {
	public static int findDuplicate(int[] nums) {
		if(nums == null) return Integer.MIN_VALUE;
		Arrays.sort(nums);
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				return nums[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	
	// Similar to find a loop in linked list
	public static int findDuplicateBinarySearch(int[] nums) {
		int n = nums.length;
	    int slow = n;
	    int fast = n;
	    do{
	        slow = nums[slow-1];
	        fast = nums[nums[fast-1]-1];
	    }while(slow != fast);
	    slow = n;
	    while(slow != fast){
	        slow = nums[slow-1];
	        fast = nums[fast-1];
	    }
	    return slow;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 3, 4, 7};
		System.out.println(findDuplicate(nums));
	}
}


