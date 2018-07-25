import java.util.HashSet;
import java.util.Set;

/*
Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
public class LongestConsecutiveSequence {
	public int getLongestSequence(int[] nums){
		if(nums == null || nums.length == 0) return 0;
		
		int count = 1;
		Set<Integer> LCSset = new HashSet<>();
		for(int num : nums)
			LCSset.add(num);
		
		for(int num : nums) {
			if(LCSset.remove(num)) {
				int val = num;
				int sum = 1;
				while(LCSset.remove(val-1))
					val--;
				sum += num-val;
				
				val = num;
				while(LCSset.remove(val+1)) 
					val++;
				sum += val - num;
				
				count = Math.max(count, sum);
			}
		}
		return count;
	}
}
