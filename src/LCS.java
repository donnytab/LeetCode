import java.util.Arrays;

public class LCS {
	public static int longestSubstr(String first, String second) {     
	    int maxLen = 0;
	    int fl = first.length();
	    int sl = second.length();
	    int[][] table = new int[fl+1][sl+1];
	 
	    for (int i = 1; i <= fl; i++) {
	        for (int j = 1; j <= sl; j++) {
	            if (first.charAt(i-1) == second.charAt(j-1)) {
	                    table[i][j] = table[i - 1][j - 1] + 1;
	                if (table[i][j] > maxLen)
	                    maxLen = table[i][j];
	            }
	        }
	    }
	    return maxLen;
	}
	
	public static String longestSubstrReturnString(String first, String second) {     
	    int fl = first.length();
	    int sl = second.length();
	    int[][] table = new int[fl+1][sl+1];
	    String s = "";

	    for (int i = 1; i <= fl; i++) {
	        for (int j = 1; j <= sl; j++) {
	            if (first.charAt(i-1) == second.charAt(j-1)) {
	                    table[i][j] = table[i - 1][j - 1] + 1;
	                s += first.charAt(i-1);
	            }
	        }
	    }
	    return s;
	}
	
	public static void main(String[] args){
		String a = "abc";
		String b = "abcdefg";
		System.out.println(longestSubstr(a,b));
	}
}
