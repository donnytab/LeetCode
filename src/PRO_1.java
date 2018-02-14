
public class PRO_1 {
	public static int[] twoSum(int[] nums, int target) {
		int[] results = new int[2];
		//traverse:
		for(int i=0; i<nums.length; i++)
        	for(int j=0; j<nums.length; j++)
        	{
        		if(nums[i]+nums[j]==target && i!=j){
        			
        			results[0] = i;
        			results[1] = j;
        			//System.out.println("p:"+i+","+j);
        			// break traverse;
        			return results;
        		}
        	}
        return results;
    }
	
	public static int longestSubstr(String first, String second) {     
	    int maxLen = 0;
	    int fl = first.length();
	    int sl = second.length();
	    int[][] table = new int[fl+1][sl+1];
	 
	    for (int i = 1; i <= fl; i++) {
	        for (int j = 1; j <= sl; j++) {
	            if (first.charAt(i-1) == second.charAt(j-1)) {
	                    table[i][j] = table[i - 1][j - 1] + 1;
	                if (table[i][j] > maxLen)
	                    maxLen = table[i][j];
	            }
	        }
	    }
	    return maxLen;
	}
	
//	public static void main(String[] args){
//		int[] nums = {2, 7, 11, 15};
//		int[] set = twoSum(nums, 9);
//		System.out.println(set[0]+","+set[1]);
//	}
	
	public static void main(String[] args){
		String a = "abc";
		String b = "abcdefg";
		System.out.println(longestSubstr(a,b));
}
}
