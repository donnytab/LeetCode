
public class Number1Bits {
	public int hammingWeight(int n) {
		int count = 0;
		for(int i=0; i<Integer.SIZE; i++) {
			count += n&1;
			n >>>= 1;
		}
		return count;
	}
}
