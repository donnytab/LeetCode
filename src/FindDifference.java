import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDifference {
	public static char findDiff(String s, String t) {
		Set<String> set1 = new HashSet<String>(Arrays.asList(s.split("")));
		Set<String> set2 = new HashSet<String>(Arrays.asList(t.split("")));
		Set<String> resultSet = new HashSet<String>(Arrays.asList(t.split("")));
		if(set1.size() > set2.size()){ 
			set1.removeAll(set2);
			resultSet = set1;
		}
		else{
			set2.removeAll(set1);
			resultSet = set2;
		}
		if(resultSet.size() == 0) return s.charAt(0);
		return resultSet.iterator().next().charAt(0);
		
		/*	// bit manipulation
		 * int n = t.length();
			char c = t.charAt(n - 1);
			for (int i = 0; i < n - 1; ++i) {
				c ^= s.charAt(i);
				c ^= t.charAt(i);
			}
			return c;
		*/
	}
	
	public static void main(String[] args) {
		String s = "123e4";
		String t = "1234";
		System.out.println(findDiff(s, t));
	}
}
