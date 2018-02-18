
public class MinimumWindowSubstring {
	public static String minWindow(String s, String t) {
		int[] match = new int[256];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        int start = 0;
        int end = 0;
        
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < tArray.length; i++)
        	match[tArray[i]] ++;
        int count = tArray.length;
        int minStart = 0;
        while(end < sArray.length)
        {
            if(match[sArray[end]] > 0)
            {
                count--;
            }
            match[sArray[end]] --;
            while(count == 0)
            {
                if((end - start + 1) < minLen)
                {
                	minLen = end - start + 1;
                	minStart = start;
                }
                match[sArray[start]] ++;
                if(match[sArray[start]] > 0){
                    count ++;
                }
                start++;
            }
            end ++;

        }
        if( minStart+minLen > tArray.length)
            return "";
        return s.substring(minStart, minStart+minLen);
	}
	
	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWindow(s, t));
	}
}
