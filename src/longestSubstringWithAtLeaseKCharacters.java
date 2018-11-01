/*
Example 1:
Input:
s = "aaabb", k = 3
Output:
3

Example 2:
Input:
s = "ababbc", k = 2
Output:
5
 */
public class longestSubstringWithAtLeaseKCharacters {
	// Divide and Conquer solution
	public int longestSubstring(String s, int k) {
		char[] arr = s.toCharArray();
		return helper(arr, 0, s.length(), k);
	}
	
	private int helper(char[] str, int start, int end, int k) {
		if(end - start < k) return 0;
		int[] count = new int[26];
		for(int i=start; i<end; i++) {
			int index = str[i] - 'a';
			count[index]++;
		}
		for(int j=0; j<26; j++) {
			if(count[j]<k && count[j]>0) {
				for(int m=start; m<end; m++) {
					if(str[m] == j+'a') {
						int left = helper(str, start, m, k);
						int right = helper(str, m+1, end, k);
						return Math.max(left, right);
					}
				}
			}
		}
		return end - start;
	}
}
