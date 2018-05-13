import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
//        String[] words = paragraph.split("!|?|'|,|;|.");
        if((paragraph == null) || (paragraph.length() == 0)){ return ""; }
        String tempString = paragraph.replaceAll("[\\!\\?\\'\\,\\;\\.]", "");
        for(String string: banned){
            tempString = tempString.replaceAll("\\b" + string + "\\b", "");
        }
        tempString = tempString.trim();
        System.out.println(tempString);
        HashMap<String, Integer> countMap = new HashMap<>();
        int maxCount = Integer.MIN_VALUE;
        String resultString = "";
        for(String string: tempString.split("\\s+")){
            string = string.toLowerCase();
            countMap.put(string, countMap.getOrDefault(string, 0) + 1);
        }
        System.out.println(countMap);
        for(Map.Entry<String, Integer> entry : countMap.entrySet()){
            if(maxCount < entry.getValue()){
                resultString = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return resultString;
        
    }
    
}
