import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of strings, group anagrams together.
 * 
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
 * 
 * Return:[["ate", "eat","tea"],["nat","tan"],["bat"]]
 * 
 * */
public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> group = new ArrayList<List<String>>();
		if(strs.length == 0) {
			return group;
		}
		
		Map<String, List<String>> wordMap = new HashMap<String, List<String>>();
		for(int i=0; i<strs.length; i++) {
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			String wordKey = String.valueOf(c);
			if(!wordMap.containsKey(wordKey)) {
				List<String> newValue = new ArrayList<String>();
				wordMap.put(wordKey, newValue);
			}
			wordMap.get(wordKey).add(strs[i]);
		}
		
		for(List<String> l : wordMap.values()) {
			group.add(l);
		}
		return group;
	}
	
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(strs));
	}
}
