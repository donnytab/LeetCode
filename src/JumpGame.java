
public class JumpGame {
    public static boolean canJump(int[] nums) {
    	int sum=0;
        for(int i=0; i<nums.length; i++) {
        	if(i>sum) {
        		return false;
        	}
        	sum = nums[i]+i > sum? nums[i]+i : sum;
        }
        return true;
    }
    
    public static void main(String[] args) {
    	int[] nums_true = {2,3,1,1,4};
    	int[] nums_false = {3,2,1,0,4};
    	System.out.println(canJump(nums_false));
    }
}
