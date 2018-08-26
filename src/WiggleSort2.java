import java.util.Arrays;

public class WiggleSort2 {
	public void wiggleSort(int[] nums) {
		Arrays.sort(nums);
		int size = nums.length;
		int[] result = new int[size];
		for(int i=0; i<size/2; i++) {
			result[i] = nums[i];
			result[i+1] = nums[i+size/2];
		}
		nums = result;
	}
	
	/*
	public void wiggleSort(int[] nums) {
        int median = findKthLargest(nums, (nums.length + 1) / 2);
        int n = nums.length;

        int left = 0, i = 0, right = n - 1;

        while (i <= right) {

            if (nums[newIndex(i,n)] > median) {
                swap(nums, newIndex(left++,n), newIndex(i++,n));
            }
            else if (nums[newIndex(i,n)] < median) {
                swap(nums, newIndex(right--,n), newIndex(i,n));
            }
            else {
                i++;
            }
        }
    }

    private int newIndex(int index, int n) {
        return (1 + 2*index) % (n | 1);
    }
	 */
}
