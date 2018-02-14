import java.util.List;

public class MergeIntervals {
	
	  public class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	 }
	  
	  public List<Interval> merge(List<Interval> intervals) {
		  for(int i=1; i<intervals.size(); i++) {
              if(intervals.get(i).start == intervals.get(i).end || 
                intervals.get(i-1).start == intervals.get(i-1).end) {
                  continue;
              }
			  if(intervals.get(i).start <= intervals.get(i-1).end &&
					intervals.get(i).end > intervals.get(i-1).end &&
                    intervals.get(i).start > intervals.get(i-1).start) {
				  intervals.get(i).start = intervals.get(i-1).start;
				  intervals.remove(i-1);
				  i--;
                  continue;
			  }
              
              if(intervals.get(i).start <= intervals.get(i-1).end &&
                  intervals.get(i).end < intervals.get(i-1).end && 
                intervals.get(i).start < intervals.get(i-1).start) {
				  intervals.get(i).end = intervals.get(i-1).end;
				  intervals.remove(i-1);
				  i--;
                  continue;
			  }
			  
			  if(intervals.get(i).start<=intervals.get(i-1).start &&
					  intervals.get(i).end >= intervals.get(i-1).end) {
				  intervals.remove(i-1);
				  i--;
                  continue;
			  }
			  
			  if(intervals.get(i).start>intervals.get(i-1).start &&
					  intervals.get(i).end < intervals.get(i-1).end) {
				  intervals.get(i).start = intervals.get(i-1).start;
				  intervals.get(i).end = intervals.get(i-1).end;
				  intervals.remove(i-1);
				  i--;
                  continue;
			  }
		  }
		  
		  return intervals;
	  }
	 
}
