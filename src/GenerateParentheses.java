import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
	public static List<String> generate(int n) {
		List<String> resultList = new ArrayList<String>();
		generateSub("", resultList, n, n);
		return resultList;
	}
	
	public static void generateSub(String sublist, List<String> resultList, int left, int right){
		if(left>right) {
			return;
		}
		
		if(left>0) {
			generateSub(sublist+"(", resultList, left-1, right);
		}
		
		if(right>0) {
			generateSub(sublist+")", resultList, left, right-1);
		}
		
		if(left==0 && right==0) {
			resultList.add(sublist);
			return;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(generate(2));
	}
}
