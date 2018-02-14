
public class MultiplyStrings {
	public static String multiplyStr(String s1, String s2) {
		int i1=0, i2=0;
		int l = 1;
		int result=0;
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		for(int i=a1.length-1; i>=0; i--) {
			i1 += (a1[i]-'0')*l;
			l *= 10;
		}
		l=1;
		for(int i=a2.length-1; i>=0; i--) {
			i2 += (a2[i]-'0')*l;
			l *= 10;
		}
		for(int k=0; k<i1; k++) {
			result += i2;
		}
		return String.valueOf(result);
	}
	
	public static void main(String[] args) {
		String s1 = "11";
		String s2 = "22";
		System.out.println(multiplyStr(s1, s2));
	}
}
