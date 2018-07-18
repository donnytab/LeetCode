import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringCompression {
	public int compress(char[] chars) {
		Set<String> charSet = new HashSet<String>(new ArrayList(Arrays.asList(chars)));
		return charSet.size();
	}
}
