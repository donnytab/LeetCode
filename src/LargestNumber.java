import java.util.Arrays;
import java.util.Comparator;

/*
Given a list of non negative integers, arrange them such that they form the largest number.

Example 1:

Input: [10,2]
Output: "210"
Example 2:

Input: [3,30,34,5,9]
Output: "9534330"
 */
// [1,5,9,12,16,17]
// 951171612
// [3, 5, 9, 30, 34]

public class LargestNumber {
	public static String largestNumber(int nums[]){
		String result = "";
		if(nums.length == 0 || nums == null) return result;
		
		String[] str = new String[nums.length];
		for(int i=0; i<nums.length; i++) {
			str[i] = nums[i]+"";
		}
		
		Arrays.sort(str, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				String s1 = o1 + o2;
				String s2 = o2 + o1;
//				return s1.compareTo(s2)*(-1);
				return s1.compareTo(s2);
			}
		});
		
		if(str[str.length-1].charAt(0) == '0') result = "0";
		
		for(int i=0; i<nums.length; i++) {
//			result += str[i];
			result = str[i] + result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 30, 34, 5, 9};
		System.out.println(largestNumber(nums));
	}
}
