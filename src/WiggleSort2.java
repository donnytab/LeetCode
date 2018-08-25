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
}
