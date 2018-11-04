/*
Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		for(int i=0, j=s.length()-1; i<j; i++,j--) {
			while(i<j && !Character.isLetterOrDigit(s.charAt(i))) 
				i++;
			while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
				j--;
			if(s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
}
