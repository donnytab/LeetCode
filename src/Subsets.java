import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> resultList = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(resultList, new ArrayList<>(), nums, 0);
		return resultList;
	}
	
	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int nums[], int start) {
		list.add(new ArrayList<>(tempList));
		for(int i=start; i<nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i+1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
