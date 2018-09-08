import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
	public List<Integer> getMajorityElement2(int[] nums){
		int len = nums.length;
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int n : nums) {
			if(!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
			}
			if(map.get(n) > len/3) {
				list.add(n);
				break;
			}
		}
		return list;
	}
}
