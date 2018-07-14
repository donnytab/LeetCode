
public class DetectCapital {
	public boolean detectCapitalUse(String word) {
		char[] temp = word.toCharArray();
		int capital = 0;
		for(char c : temp) {
			if('Z' - c >= 0) capital++;
		}
		return capital==temp.length || capital==0 || (capital==1 && 'Z' - temp[0] >= 0);
	}
}
