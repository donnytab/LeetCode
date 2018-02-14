public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
//    	int len = nums.length;
//		if(target == nums[len/2 -1] && nums.length == 1) 
//			return len/2 - 1;
//		else if(target < nums[len/2]) 
//			searchInsert(Arrays.copyOfRange(nums, 0, len/2 - 1), target);
//		else if(target > nums[len/2])
//			searchInsert(Arrays.copyOfRange(nums,  len/2, len - 1), target);
//		else
//			return 0;
    	
        int high = nums.length-1;
        int low = 0;
        while(low <= high) {
        	int mid = (high+low)/2;
        	if(nums[mid] == target) {
        		return mid;
        	}
        	else if(nums[mid] > target) {
        		high = mid-1;
        	}
        	else {
        		low = mid + 1;
        	}
        }
        return low;
    }
}
