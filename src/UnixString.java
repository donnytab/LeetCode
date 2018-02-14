import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class UnixString {
	public static String simplifyString(String path) {
		Deque<String> stack = new LinkedList<>();
		Set<String> omit = new HashSet<>(Arrays.asList("..",".",""));
		for(String dir : path.split("/")) {
			if(dir.equals("..") && !stack.isEmpty())
				stack.pop();
			else if(!omit.contains(dir))
				stack.push(dir);
		}
		String result="";
		for(String dir : stack)
			result = "/" + dir + result;
		return result.isEmpty()?"/" : result;
	}
	
	public static int judgeBool(boolean b) {
		return b ? 1 : 0;
	}
	
	public static void main(String[] args) {
//		System.out.println(simplifyString("/a/./../a/d"));
		System.out.print(judgeBool(true));
	}
}
