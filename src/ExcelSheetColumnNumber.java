
public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
    	int sum = 0, carry = 1;
        char[] num = s.toCharArray();
        for(int i=num.length-1; i>=0; i--) {
        	sum += (num[i] - 'A' + 1) * carry;
        	carry *= 26;
        }
        return sum;
    }
    
    // sample solution
    public int sampleSolution(String s) {
    	int result = 0;
    	for (int i = 0; i < s.length(); result = result * 26 + (s.charAt(i) - 'A' + 1), i++);
    	return result;
    }
    
    public static void main(String[] args) {
    	System.out.println(titleToNumber("AA"));
    }
}
