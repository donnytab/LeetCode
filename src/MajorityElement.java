import java.util.HashMap;

public class MajorityElement {
	public int getMajorityElement(int[] nums) {
		int majorityElement = 0, len = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int n : nums) {
			if(!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
			if(map.get(n) > len/2) {
				majorityElement = n;
				break;
			}
		}
		return majorityElement;
	}
}
