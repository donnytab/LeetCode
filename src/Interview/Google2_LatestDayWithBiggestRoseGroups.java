package Interview;

import java.util.Arrays;

public class Google2_LatestDayWithBiggestRoseGroups {
	public int solution(int[] A, int K, int M) {
        int len = A.length;
        int result = -1;
        for(int i=0; i<len; i++) {
        	int space = 0;
        	int count = 0;
        	int maxSequence = 0;
        	int[] subarray = Arrays.copyOfRange(A, 0, i);
        	Arrays.sort(subarray);
        	for(int j=0; j<subarray.length-1; j++) {
        		if(subarray[j]+1 != subarray[j+1]) {
        			space++;
        		} else {
        			count++;
        			maxSequence = count > maxSequence? count : maxSequence;
        		}
        	}
        	if(space+1 == M && maxSequence >= K) result = i;
        }
        return result;
    }
}
