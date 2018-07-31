// The idea is to start from each index and try to extend palindrome for both odd and even length.
public class PalindromicSubstrings {
	public int countSubstring(String s) {
		int res = 0, n = s.length();
		for(int i=0; i<n; i++) {			// i is the mid point
			for(int j=0; i-j>=0 && i+j<n && s.charAt(i-j)==s.charAt(i+j); j++)	//odd length, substring s[i-j, ..., i+j]
				res++;
			for(int j=0; i-1-j>=0 && i+j<n && s.charAt(i-1-j)==s.charAt(i+j); j++) //even length, substring s[i-1-j, ..., i+j]
				res++;
		}
		return res;
	}
}
