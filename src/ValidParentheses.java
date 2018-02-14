
public class ValidParentheses {
	public static boolean isValid(String s) {
		int bracket1 = 0, bracket2 = 0, bracket3 = 0;
		char[] a = s.toCharArray();
		for(char c : a)
		{
			switch(c)
			{
				case '(': bracket1 += 1; break;
				case ')': bracket1 -= 1; break;
				case '{': bracket2 += 1; break;
				case '}': bracket2 -= 1; break;
				case '[': bracket3 += 1; break;
				case ']': bracket3 -= 1; break;
				default: break;
			}
		}
		if(bracket1==0 && bracket2==0 && bracket3==0)
			return true;
		else
			return false;
	}
	
	public static boolean isValidMethod2(String s) {
		char[] a = s.toCharArray();
		for(int i=1; i<a.length-1; i++)
		{
			switch(a[i])
			{
				case '(':
					if(a[i+1]!=')')
						return false;
					else
						break;
				case '{':
					if(a[i+1]!='}')
						return false;
					else
						break;
				case '[':
					if(a[i+1]!=']')
						return false;
					else
						break;
				case ')':
					if(a[i-1]!='(')
						return false;
					else
						break;
				case '}':
					if(a[i-1]!='{')
						return false;
					else
						break;
				case ']':
					if(a[i-1]!='[')
						return false;
					else
						break;
				default:
					break;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "[](){";
//		System.out.println(isValid(s));
		System.out.println(isValidMethod2(s));
	}
}
