import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDifference {
	public static char findDiff(String s, String t) {
		Set<String> set1 = new HashSet<String>(Arrays.asList(s.split("")));
		Set<String> set2 = new HashSet<String>(Arrays.asList(t.split("")));
		if(set1.size() > set2.size()){ 
			set1.removeAll(set2);
			return set1.iterator().next().charAt(0);
		}
		else
			set2.removeAll(set1);
			return set2.iterator().next().charAt(0);
	}
	
	public static void main(String[] args) {
		String s = "1234";
		String t = "12345";
		System.out.println(findDiff(s, t));
	}
}
