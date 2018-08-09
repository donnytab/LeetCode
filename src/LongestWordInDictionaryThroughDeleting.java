import java.util.List;
/*
Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]
Output: 
"apple"

Input:
s = "abpcplea", d = ["a","b","c"]
Output: 
"a"
 */

public class LongestWordInDictionaryThroughDeleting {
	public String findLongestWord(String s, List<String> d) {
	    String res = "";
	    for (String w : d) {
	        if (isSubsequence(s, w) && compare(w, res) < 0) 
	            res = w;
	    }
	    
	    return res;
	}

	private int compare(String a, String b) {
		// return the longest word with the smallest lexicographical order
	    return a.length() == b.length() ? a.compareTo(b) : b.length() - a.length();
	}

	private boolean isSubsequence(String s, String w) {
	    if (w.length() > s.length()) return false;
	    for (int i = 0, j = 0; i < s.length(); i++) {
	        if (s.charAt(i) == w.charAt(j)) {
	            j++;
	            if (j == w.length()) return true;
	        }
	    }
	    return false;
	}
}
