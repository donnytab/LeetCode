/*
Input: 43261596
Output: 964176192
Explanation: 43261596 represented in binary as 00000010100101000001111010011100, 
             return 964176192 represented in binary as 00111001011110000010100101000000.
 */
public class ReverseBits {
	public int reverseBits(int n) {
		final int bitSize = 32;
		int result = 0;
		for(int i=0; i<bitSize; i++) {
			result = result<<1 | (n&1);
			n >>>= 1;
		}
		return result;
	}
}
