import java.util.Arrays;

public class KthLargestElementInArray {
	// Method1: Time: O(nlogk), Space: O(k)
	public int findKthLargestMethod1(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length-k];
	}
	
	// Method2: QuickSelect
	public int findKthLargestMethod2(int[] nums, int k) {
		int len = nums.length;
		int p = quickSelect(nums, 0, len-1, len-k+1);
		return nums[p];
	}
	
	int quickSelect(int[] a, int low, int high, int k) {
		int i = low, j = high, pivot = a[high];
		while(i<j) {
			if(a[i++] > pivot) swap(a, --i, --j);
		}
		swap(a, i, high);
		// count the nums that are <= pivot from low
	    int m = i - low + 1;
		
	 // pivot is the one!
	    if (m == k)     return i;
	    // pivot is too big, so it must be on the left
	    else if (m > k) return quickSelect(a, low, i - 1, k);
	    // pivot is too small, so it must be on the right
	    else            return quickSelect(a, i + 1, high, k - m);
	}
	
	void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
