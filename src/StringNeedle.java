
public class StringNeedle {
	public static int strStr(String haystack, String needle) {
		char[] hStr = haystack.toCharArray();
		char[] nStr = needle.toCharArray();
		if(nStr.length==0) return 0;
		for(int i =0; i<=hStr.length-nStr.length; i++) {
			if(hStr[i] == nStr[0]) {
				for(int j=0; j<nStr.length; j++) {
					if(hStr[i+j] != nStr[j]) break;
					if(j==nStr.length-1) return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] arg) {
		System.out.println(strStr("a", "a"));
	}
}
