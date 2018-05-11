
public class ReverseString {
	public static String reverseString(String s){
		StringBuilder sb= new StringBuilder();
		sb.append(s);
		return sb.reverse()+"";
	}
	
	public static void main(String[] args){
		System.out.println(reverseString("hello"));
	}
}
