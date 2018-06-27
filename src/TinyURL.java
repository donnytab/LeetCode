import java.util.HashMap;
import java.util.Map;

public class TinyURL {
	Map<Integer, String> map = new HashMap<>();
	
	public String encode(String longURL) {
		int key = longURL.hashCode();
		map.put(key, longURL);
		return "http://tinyurl.com/" + key;
	}
	
	public String decode(String shortURL) {
		return map.get(Integer.parseInt(shortURL.replace("http://tinyurl.com/", "")));
	}
}
