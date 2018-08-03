
public class BinarySearch {
	public static int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    public static int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, right);
        } else {
            return binarySearch(nums, target, left, mid - 1);
        }   
    }
	
	public static void main(String[] args) {
		int[] nums = {0,1,3,5,8,12,44};
		System.out.println(search(nums, 12));
	}
}
