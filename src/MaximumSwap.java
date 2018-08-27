
public class MaximumSwap {
	public int maximumSwap(int num) {
		char[] numArray = String.valueOf(num).toCharArray();
		int[] buckets = new int[10];
		
		for(int k=0; k<numArray.length; k++) {
			buckets[numArray[k] - '0'] = k;
		}
		
		for(int i=0; i<numArray.length; i++) {
			for(int j=9; j>numArray[i]-'0'; j--) {
				if(buckets[j] > i) {
					char temp = numArray[i];
					numArray[i] = numArray[buckets[j]];
					numArray[buckets[j]] = temp;
					return Integer.valueOf(String.valueOf(numArray));
				}
			}
		}
		
		return num;
	}
}
