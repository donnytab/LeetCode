import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TopKFrequentElement {
	public static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> frequentMap = new TreeMap<>();
		List<Integer> resultList = new ArrayList<>();
		
		for(int element : nums) {
			if(frequentMap.get(element) != null) {
				frequentMap.put(element, frequentMap.get(element)+1);
			} else {
				frequentMap.put(element, 1);
			}
		}
		
		Set<Integer> keySet = frequentMap.keySet();
		Iterator<Integer> iter = keySet.iterator();
		
		for(int i=0; i<k; i++) {
			if(iter.hasNext()) {
				resultList.add(iter.next());
			}	
		}
		return resultList;
	}
	
	public static void main(String[] args) {
		int[] test = {4,1,-1,2,-1,2,3};
		System.out.println(topKFrequent(test, 3));
	}
}
