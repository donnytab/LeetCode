
public class DetectCapital {
	public static boolean detectCapitalUse(String word) {
		char[] temp = word.toCharArray();
		int capital = 0;
		for(char c : temp) {
			if('Z' - c >= 0) capital++;
		}
		return capital==temp.length || capital==0 || (capital==1 && 'Z' - temp[0] >= 0);
	}
	
	public static boolean detectCapitalUseWithRegex(String word) {
		return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
	}
	
	public static void main(String[] args) {
		System.out.println(detectCapitalUseWithRegex("USA"));
	}
}
