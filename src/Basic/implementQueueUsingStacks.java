package Basic;

import java.util.Arrays;

public class implementQueueUsingStacks {
	public String solution(String S) {
        String sHour = S.substring(0, 2);
        String sMin = S.substring(3,5);
        int h = Integer.valueOf(sHour);
        int m = Integer.valueOf(sMin);
        
        if(sHour.equals(sMin)) return S;
        
        for(;;) {
        	m -= 1;
        	boolean flag = true;
        	if(m == 60) {
        		m = 0;
        		h += 1;
        		h %= 24;
        	}
        	String time = String.format("%02d:%02d", h, m);
        	for(int i=0; i<time.length(); i++) {
        		if(S.indexOf(time.charAt(i))<0) {
        			flag = false;
        			break;
        		}
        	}
        	if(flag) return time;
        }
    }
	
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
