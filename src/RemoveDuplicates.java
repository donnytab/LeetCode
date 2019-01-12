public class RemoveDuplicates {
	public static int removeDuplicate(int[] nums) {
		int dis = 1, len = nums.length;
		if(len == 0) return 0;
		for(int i=1; i<len; i++) {
			if(nums[i-1] != nums[i]) {
				nums[dis] = nums[i];
				dis++;
			}
		}
		return dis;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,2,2,3};
		System.out.println(removeDuplicate(nums));
	}
}
