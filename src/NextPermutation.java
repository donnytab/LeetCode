
public class NextPermutation {
	public void nextPermutation(int[] nums){
		int backPtr = nums.length - 1;
		while(backPtr>=0 && nums[backPtr] <= nums[backPtr-1]) {
			backPtr--;
		}
		int current = nums[backPtr-1];
		int frontPtr = backPtr-1, reversePtr = backPtr;
		while(frontPtr<nums.length && nums[frontPtr] > current) {
			frontPtr++;
		}
		swap(nums, backPtr-1, frontPtr);
		reverse(nums, reversePtr);
	}
	
    public void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
	
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
