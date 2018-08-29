
public class RotateArray {
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		for(int i=0; i<k; i++) {
			int temp = nums[len-1];
			for(int j=len-1; j>0; j--) {
				nums[j] = nums[j-1];
			}
			nums[0] = temp;
		}
		return;
	}
	
	public void rotate2(int[] nums, int k) {
		int len = nums.length;
		int[] temp = nums.clone();
		for(int i=0; i<len; i++) {
			nums[(i+k)%len] = temp[i];
		}
		return;
	}
}
