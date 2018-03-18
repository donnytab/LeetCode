import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given an input string, reverse the string word by word.
For example,
Given s = "the sky is blue",
return "blue is sky the".
*/
public class ReverseWords {
	public static String reverseWords(String s) {
		String reverse = "";
		List<String> words = Arrays.asList(s.split(" "));
		Collections.reverse(words);
		for(String word : words) reverse += word +" ";
		return reverse;
	}
	
	public static void main(String args[]) {
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}
}
