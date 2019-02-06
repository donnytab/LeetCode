import java.util.HashSet;

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for(int n : nums) set.add(n);
		return nums.length != set.size();
	}
	
	/* one-line answer
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
	 */
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		containsDuplicate(nums);
	}
}
