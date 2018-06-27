import java.util.Arrays;

public class ArrayPartition1 {
	public static int arrayPairSum(int[] nums) {
		int len = nums.length;
		int sum = 0;
//		for(int i=0; i<len-1; i++) {
//			for(int j=0; j<len-1-i; j++) {
//				if(nums[j] > nums[j+1]) {
//					int temp = nums[j];
//					nums[j] = nums[j+1];
//					nums[j+1] = temp;
//				}
//			}
//		}
		
		Arrays.sort(nums);
		
		for(int k=0; k<len; k=k+2) {
			sum += nums[k];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,4,2,3};
		System.out.println(arrayPairSum(nums));;
	}
}
