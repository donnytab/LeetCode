/*
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 *
 * The number of ways decoding "12" is 2.
 */
public class NumDecoding {
	public static int numDecodings(String s) {
		char[] str = s.toCharArray();
		int len = str.length;
		int[] decode = new int[len+1];
		
		if(s.length() == 0) 
			return 0;
		
		decode[0] = 1;
		decode[1] = str[0] == '0'? 0 : 1;
		
		for(int i=2; i<=len; i++) {
			if(str[i-1]-'0'>=1 && str[i-1]-'0'<=9) {
				decode[i] += decode[i-1];
			}
			if(((str[i-1]-'0')+(str[i-2]-'0')*10>=10) && ((str[i-1]-'0')+(str[i-2]-'0')*10<=26)) {
				decode[i] += decode[i-2];
			}
		}
		return decode[len];
	}
	
	public static void main(String[] args) {
		System.out.println(numDecodings("121212"));
	}
}
