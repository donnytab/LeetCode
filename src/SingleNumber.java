public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int xor = 0;
		for(int i : nums) {
			// XOR : n^n=0, n^0=n
			xor = xor^i;
		}
		return xor;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}
}
