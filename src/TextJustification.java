/*
 * Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
	static List<String> fullJustifiy(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<String>();
        int index = 0;
        while (index < words.length) {
            int count = words[index].length();
            int last = index + 1;
            while (last < words.length) {
                if (words[last].length() + count + 1 > maxWidth) break;
                count += words[last].length() + 1;
                last++;
            }
            
            StringBuilder builder = new StringBuilder();
            int diff = last - index - 1;
            if (last == words.length || diff == 0) {
                for (int i = index; i < last; i++) {
                    builder.append(words[i] + " ");
                }
                builder.deleteCharAt(builder.length() - 1);
                for (int i = builder.length(); i < maxWidth; i++) {
                    builder.append(" ");
                }
            } else {
                int spaces = (maxWidth - count) / diff;
                int r = (maxWidth - count) % diff;
                for (int i = index; i < last; i++) {
                    builder.append(words[i]);
                    if (i < last - 1) {
                        for (int j = 0; j <= (spaces + ((i - index) < r ? 1 : 0)); j++) {
                            builder.append(" ");
                        }
                    }
                }
            }
            lines.add(builder.toString());
            index = last;
        }
        return lines;
	}
	
	public static void main(String[] args) {
		String[] s = {"This", "is", "an", "example", "of", "text", "justification."};
		int maxWidth = 16;
		System.out.println(fullJustifiy(s, maxWidth));
	}
}
