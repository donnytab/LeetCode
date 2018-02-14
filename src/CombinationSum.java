import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		for(int i=0; i<candidates.length; i++) {
			if(candidates[i]==target) {
				resultList.add(Arrays.asList(candidates[i]));
				continue;
			}
			for(int j=0; j<candidates.length; j++) {
				int sum = candidates[i] + candidates[j];
				List<Integer> setList = new ArrayList<Integer>();
				setList.add(candidates[i]);
				setList.add(candidates[j]);
				if(sum == target) {
					resultList.add(setList);
					continue;
				}
				while( sum < target) {
					sum += candidates[j];
					setList.add(candidates[j]);
					if(sum == target) {
						resultList.add(setList);
					}
				}
			}
		}
		for(int m = 0; m <resultList.size(); m++) {
			for(int n = m+1; n<resultList.size(); n++) {
				HashSet<Integer> setOne = new HashSet<Integer>(resultList.get(m));
				HashSet<Integer> setTwo = new HashSet<Integer>(resultList.get(n));
				if(setOne.equals(setTwo)) {
					resultList.remove(m);
					break;
				}
			}
		}
		return resultList;
	}
}
