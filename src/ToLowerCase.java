
public class ToLowerCase {
	public String getLowerCase(String s) {
		int ascii = 'a'-'A';
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(c >= 'A' && c <='Z') {
				sb.append((char)(c+ascii));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
