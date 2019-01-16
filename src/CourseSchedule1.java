import java.util.LinkedList;
import java.util.Queue;

// Sample Answer
public class CourseSchedule1 {
	// BFS (Topological Sorting)
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		if(numCourses == 0 || prerequisites.length == 0)
			return true;
		int indegree[] = new int[numCourses];
		for(int i=0; i<prerequisites.length; i++)
			indegree[prerequisites[i][0]]++;
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0; i<numCourses; i++) {
			if(indegree[i] == 0) queue.add(i);
		}
		int canFinishCount = queue.size();
		while(!queue.isEmpty()){
			int prereq = queue.remove();	// Already finish prereq course
			for(int i=0; i<prerequisites.length; i++) {
				if(prerequisites[i][1] == prereq) {
					indegree[prerequisites[i][0]]--;
					if(indegree[prerequisites[i][0]] == 0) {
						canFinishCount++;
						queue.add(prerequisites[i][0]);
					}
				}
			}
		}
		return (canFinishCount == numCourses);
	}
}
