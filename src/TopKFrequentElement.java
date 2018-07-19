import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TopKFrequentElement {
	public static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> frequentMap = new TreeMap<>();
		List<Integer> resultList = new ArrayList<>();
		
		// Count frequency for each unique element
		for(int element : nums) {
			if(frequentMap.get(element) != null) {
				frequentMap.put(element, frequentMap.get(element)+1);
			} else {
				frequentMap.put(element, 1);
			}
		}

		List<Map.Entry<Integer, Integer>> keyList = new ArrayList<>(frequentMap.entrySet());		
		// Sort keyList by value in descending order
		Collections.sort(keyList, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		// Store top K keys in resultList
		for(Map.Entry<Integer, Integer> map : keyList) {
			if(k-- > 0) {
				resultList.add(map.getKey());
			}
		}
		return resultList;
	}
	
	public static void main(String[] args) {
		int[] test = {4,1,-1,2,-1,2,3};
		System.out.println(topKFrequent(test, 3));
	}
}
