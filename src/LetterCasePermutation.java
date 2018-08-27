import java.util.LinkedList;
import java.util.List;

// DFS solution
public class LetterCasePermutation {
	public List<String> letterCasePermutation(String s) {
		if(s==null) return new LinkedList<>();
		List<String> res = new LinkedList<>();
		helper(s, res, 0);
		return res;
	}
	
	public void helper(String s, List<String> res, int pos) {
		if(pos==s.length()) {
			res.add(s);
			return;
		}
		if(s.charAt(pos)>='0' && s.charAt(pos)<='9') {
			helper(s, res, pos+1);
			return;
		}
		
		char[] c = s.toCharArray();
		c[pos] = Character.toLowerCase(c[pos]);
		helper(String.valueOf(c), res, pos+1);
		c[pos] = Character.toUpperCase(c[pos]);
		helper(String.valueOf(c), res, pos+1);
	}
}
