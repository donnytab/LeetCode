package Interview;

public class Google1_LastClosestTime {
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
}
