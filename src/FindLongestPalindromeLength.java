import java.util.HashMap;

public class FindLongestPalindromeLength {
	public int longestPalindromeLength(String s) {
		if(s==null || s.length()==0) return 0;
		HashMap<String, Integer> hashmap = new HashMap<>();
		String[] strArray = s.split("");
		for(String str : strArray) {
			if(hashmap.get(str) != null) {
				hashmap.put(str, hashmap.get(str)+1);
			} else {
				hashmap.put(str, 1);
			}
		}
		int result = 0;
		for(String st : hashmap.keySet()) {
			result += (hashmap.get(st)/2)*2;
		}
		if(result!=s.length()) result++;
		return result;
	}
}
