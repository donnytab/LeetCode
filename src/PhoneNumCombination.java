import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneNumCombination {
    public static List<String> letterCombinations(String digits) {
        HashMap<Character, List<String>> comb = new HashMap<Character, List<String>>();
        comb.put('0', Arrays.asList(""));
        comb.put('1', Arrays.asList(""));
        comb.put('2', Arrays.asList("a","b","c"));
        comb.put('3', Arrays.asList("d","e","f"));
        comb.put('4', Arrays.asList("g","h","i"));
        comb.put('5', Arrays.asList("j","k","l"));
        comb.put('6', Arrays.asList("m","n","o"));
        comb.put('7', Arrays.asList("p","q","r","s"));
        comb.put('8', Arrays.asList("t","u","v"));
        comb.put('9', Arrays.asList("x","w","y","z"));
        char num[] = digits.toCharArray();
        List<String> resultList = new ArrayList<String>(Arrays.asList("","",""));
        for(char digit : num) {
        	for(String str : comb.get(digit)) {
        		List<String> r = resultList;
        		for(String s : r) {
    				resultList.add(s+str);
        		}
        	}
        }
        return resultList;
    }
    
    public static void main(String[] args) {
    	List<String> l = letterCombinations("23");
    	for(String s : l)
    		System.out.println(s);
    }
}
