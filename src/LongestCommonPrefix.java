
public class LongestCommonPrefix {
	public static String lcp(String[] strs) {
		String minStr = "";
		if(strs.length == 0) {
			return minStr;
		}
		else if(strs.length == 1) {
			return strs[0];
		}
		else {
			minStr = strs[0];
		}
		for(String str : strs) {
			if(str.length()<minStr.length()) {
				minStr = str;
			}
		}
		int maxLen = Integer.MAX_VALUE;
		String commonPrefix = "";
		char[] minArr = minStr.toCharArray();
		for(int i=1; i<strs.length; i++) {
			char[] cArr = strs[i].toCharArray();
			int innerMaxLen = 0;
			for(int j=0; j<minArr.length; j++) {
				if(minArr[j] == cArr[j]) innerMaxLen++;
			}
			maxLen = innerMaxLen < maxLen? innerMaxLen : maxLen;
		}
		for(int k =0; k<maxLen; k++) {
			commonPrefix += minArr[k];
		}
		return commonPrefix;
	}
	
	public static void main(String[] args) {
		String[] strs = {"a", "b", "a"};
		System.out.print(lcp(strs));
	}
}
