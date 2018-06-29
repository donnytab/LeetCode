
public class ReverseWordsIII {
	public static String reverseWords(String s) {
		String[] inputWords = s.split(" ");
		for(int i=0; i<inputWords.length; i++) {
			inputWords[i] = new StringBuilder(inputWords[i]).reverse().toString();
		}
		StringBuilder result = new StringBuilder();
		
		for(String word : inputWords) {
			result.append(word + " ");
		}
		return result.toString().trim();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest!"));
	}
}
